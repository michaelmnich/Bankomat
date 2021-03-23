package com.uj.atm.interfaces;

public interface IAtm {

    /**
     * Metoda sprawdza poprawność PINu i jeśli jest on poprawny, prawdę w przeciwnym wypadku zwraca fałsz.
     * Karta kredytowa w tym kontekście jest obiektem klasy implementującej interface 'ICreditCard'
     * Poprawny kod PIN musi składać się z 4 znaków, każdy z nich musi być cyfrą.
     * @param pin Kod pin w formie stringa. (nalezy go przetłumaczyć na wartość numeryczną.)
     * @param creditCard Obiekt karty kredytowej implementujący interface 'ICreditCard'
     * @return Jeżeli i
     */
     boolean CheckPinAndLogIn(ICreditCard creditCard, String pin);

    /**
     * Metoda zwraca bieżącą wartość salda na koncie
     * Przykład: dla konta z saldem 362 PLN metoda zwróci wartość 362
     * @param account numer konta dla, którego ma zostać zwrócone saldo
     * @return Aktualne saldo z konta jako wartość typu double.
     */
    double AccountStatus(IAccount account);

    /**
     * Metoda zmienia PIN karty i zwraca TRUE w przypadku poprawnej zmiany kodu PIN oraz FALSE w przypadku nieudanej zmiany.
     * @param card Obiekt karty kredytowej
     * @param oldPin Stary pin
     * @param newPin Nowy pin
     * @param newPinConform Nowy pin wartość weryfikująca 'newPin' oraz newPinConform 'muszą' być sobie równe.
     * @return Jeżeli uda się zmienić pin zwraca true.
     */
    boolean ChangePinCard(ICreditCard card, String oldPin, String newPin, String newPinConform);

    /**
     * Metoda realizuje wpłatę pieniędzy na konto stowarzyszone z daną kartą
     * @param card Karta kredytowa stowarzyszona z kontem
     * @param amount Kwota jaką chcmy wpłacicć
     * @return Zwracamu true lub false w zależności czy operacja się uda (może sie nie udać jak na przykład obiekt konta pod kartą jest = null).
     */
    boolean DepositFunds(ICreditCard card, double amount);

    /**
     * Metoda realizuje wypłatę określonej kwoty z konta stowarzyszonego z określoną kartą.
     * @param card Karta kredytowa stowarzyszona z kontem
     * @param amount Kwota jaką chcmy wypłacić
     * @return Zwracamu true lub false w zależności czy operacja się uda.
     */
    boolean WithdrawFund(ICreditCard card, double amount );

    /**
     * Metoda realizuje przelew określonej kwoty (amount) z konta stowarzyszonego z daną kartą (card) na określone konto (accountRecipient)
     * Jeżeli operacja się uda metoda zwraca true w przeciwnym wypadku zwraca false.
     * Operacja może się nie udać na przykłąd gdy mamy niewystarczajaco srodków na karcie.
     * @param card Karta którą dokonujemy transfer.
     * @param accountRecipient Konto odbiorcy.
     * @param amount Kwota, która wysyłamy.
     * @return Zwracamu true lub false w zależności czy operacja się uda.
     */
    boolean Transfer(ICreditCard card, IAccount accountRecipient, double amount);

}
