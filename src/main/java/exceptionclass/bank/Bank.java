package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        Account account = findAccountByNumber(accountNumber);
        if (account.getBalance() < amount) {
            throw new InvalidBankOperationException("Low balance", ErrorCode.LOW_BALANCE);
        }
        account.subtract(amount);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccountByNumber(accountNumber);
        account.deposit(amount);
    }

    private Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new InvalidBankOperationException("Unknown bank account", ErrorCode.INVALID_ACCOUNTNUMBER);
    }


}
