package com.uj.atm.interfaces;

public interface IAtm {

    /**
     *  Pin code must have 4 character all must be numeric.
     * @param pin pin code as a string
     * @return return credit card if pin code is valid
     */
    ICreditCard CheckPinAndLogIn(String pin);

    /**
     * Logut form ATM
     * @return
     */
    boolean LogOut();

    /**
     * Returns current amount of money on yours account
     * @param account
     * @return numeric amount of money
     */
    String AccountStatus(IAccount account);

    /**
     * change pin card
     * @param card
     * @param oldPin
     * @param newPin
     * @param newPinConform
     * @return
     */
    boolean ChangePinCard(ICreditCard card, String oldPin, String newPin, String newPinConform);

    /**
     * Put money in to account
     * @param card
     * @param amount
     * @return
     */
    double DepositFunds(ICreditCard card, double amount);

    /**
     * Take mony from account
     * @param card
     * @param amount
     * @return
     */
    double WithdrawFund(ICreditCard card, double amount);

    /**
     * Transfer money from one account to another
     * @param card
     * @param accountRecipient
     * @param amount
     * @return
     */
    boolean Transfer(ICreditCard card, IAccount accountRecipient, double amount);

}
