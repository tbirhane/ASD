package customers;

@Aspect
@Configration
public class LogAspect {

    @Autowired
    private ILogger logger ;

    @After("execution(* customers.EmailSender.sendEmail(..)")
    public void logMessageEmail(JoinPoint joinPoint){
    Object[] args = joinPoint.getArgs();
    String messgae = (String) args[1];
    String email = (String) args[0];

    EmailSender emailSender = joinPoint.getTarget();
    String outgoingMailServer = emailSender.getOutgoingMailServer();
    logger.log("method=" + joinPoint.getSignature().getName() + " address="+email+" message="+messgae + " outgoingMailServer="+outgoingMailServer);
    }

    @Around("execution (* customers.CustomerDAO.*.(..))")
    public Object invoke(ProceedingJoinPoint joinPoint)  throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start(joinPoint.getSignature().getName());
        Object retVal = joinPoint.proceed();
        sw.stop();
        long totaltime = sw.getLastTaskTimeMillis();
        // print the time to the console
        logger.log("time="+totaltime);
        return retVal;
    }
}
