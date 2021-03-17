package com.uj.atm.interfaces;

public interface ICreditCard {

    /**
     * change pin card
     * @param oldPin
     * @param newPin
     * @return
     */
    boolean ChangePin(String oldPin, String newPin);

    /**
     * Return true when pin is valid
     * @param pin
     * @return
     */
    boolean IsPinValid(String pin);

    /**
     * Add account to this credit card
     * @param account
     */
    void AddAccount(IAccount account);

    /**
     *  Deposit money in to this account
     * @param account
     * @param amount
     * @return
     */
    double DepositFunds(IAccount account, double amount);

    /**
     * Withdraw money form this account
     * @param account
     * @param amound
     * @return
     */
    double WithdrawFund(IAccount account, double amound);
}
