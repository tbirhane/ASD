package framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

public class FWContext {

	private static List<Object> objectMap = new ArrayList<>();

	public FWContext() {
		try {
			// find and instantiate all classes annotated with the @TestClass annotation
			Reflections reflections = new Reflections("");
			Set<Class<?>> types = reflections.getTypesAnnotatedWith(TestClass.class);
			for (Class<?> implementationClass : types) {
				objectMap.add((Object) implementationClass.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			Method beforeMethod = null;
			for (Object theTestClass : objectMap) {
				// find the methods annotated with the @Before annotation
				for (Method method : theTestClass.getClass().getDeclaredMethods()) {
					if (method.isAnnotationPresent(Before.class)) {
						beforeMethod = method;
						break;
					}
				}
			}
			for (Object theTestClass : objectMap) {
				// find all methods annotated with the @Test annotation
				for (Method method : theTestClass.getClass().getDeclaredMethods()) {
					if (method.isAnnotationPresent(Test.class)) {
						if(beforeMethod!=null){
							beforeMethod.invoke(theTestClass);
						}
						method.invoke(theTestClass);

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
