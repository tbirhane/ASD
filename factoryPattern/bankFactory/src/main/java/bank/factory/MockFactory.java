package bank.factory;

import bank.EmailSender;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.dao.MockAccountDAO;

public class MockFactory implements MyFactory{
    @Override
    public IAccountDAO getAccountDAO() {
        return new MockAccountDAO();
    }

    @Override
    public EmailSender getEmailSeder() {
        return null;
    }
}
