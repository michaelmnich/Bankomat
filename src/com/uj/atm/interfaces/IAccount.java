package com.uj.atm.interfaces;

public interface IAccount {

    /**
     * Return data from account in Format [accountNumber],[CurrentFunds]
     * @return
     */
    String PrintAccountData();

    /**
     * Deposit money in to this account
     * @param amount
     * @return
     */
    double DepositFunds(double amount);

    /**
     * Withdraw money form this account
     * @param amound
     * @return
     */
    double WithdrawFund(double amound);

}
