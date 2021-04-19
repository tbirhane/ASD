package bank.factory;

import bank.EmailSender;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;

public interface MyFactory {
    IAccountDAO  getAccountDAO();
    EmailSender getEmailSeder();
}
