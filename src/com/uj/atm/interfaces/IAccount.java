package com.uj.atm.interfaces;

public interface IAccount {

    /**
     * Zwraca dane o koncie w formacie: [accountNumber],[CurrentFunds]
     * @return Przykład: dla konta nr 782 z saldem 384.34 metoda powinna zwrócić ciąg "782,384.34".
     */
    String PrintAccountData();

    /**
     * Metoda realizuje wpłatę na konto
     * Po jej wykonaniu wartość środków na koncie powinna zwiększyć się o wartość amount
     * Przykład: jeśli na koncie jest 100 PLN to DepositFunds(50) powinno skutkować
     *           zwiększeniem środków na koncie o 50 PLN i końcowym saldem 150 PLN.
     * @param amount Kwota do wpłacenia na konto.
     * @return Ilość środkó po wpłaceniu na konto.
     */
    double DepositFunds(double amount);

    /**
     * Metoda realizuje wypłatę środków z konta.
     * Po jej wykonaniu wartość środków na koncie powinna zmniejszyć się o wartość amount
     * Przykład: dla konta z saldem 450 PLN wykonanie WithdrawFund(50) powinna skutkować
     *           wypłatą 50 PLN i końcowym saldem 400 PLN.
     * @param amount Kwota do wypłacenia z konta.
     * @return Ilość środkó po wypłeaceniu środków.
     */
    double WithdrawFund(double amount);

}
