package bank.factory;

import bank.EmailSender;
import bank.dao.AccountDAO;

public class ProductionFactory implements MyFactory{
    @Override
    public AccountDAO getAccountDAO() {
        return new AccountDAO();
    }

    @Override
    public EmailSender getEmailSeder() {
        return new EmailSender();
    }
}
