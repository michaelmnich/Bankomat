package com.uj.atm.interfaces;

public interface ICreditCard {

    /**
     * Metoda zmienia PIN karty i zwraca TRUE w przypadku poprawnej zmiany kodu PIN oraz FALSE w przypadku nieudanej zmiany.
     * @param oldPin Stary pin
     * @param newPin Nowy pin
     * @param newPinConform Nowy pin wartość weryfikująca 'newPin' oraz newPinConform 'muszą' być sobie równe.
     * @return Jeżeli uda się zmienić pin zwraca true.
     */
    boolean ChangePin(String oldPin, String newPin, String newPinConform);

    /**
     * Metoda sprawdza, czy PIN danej karty jest poprawny
     * @param pin Pin w foemie string należy go przekonwertowac na wartość numeryczną.
     * @return Jezeli pin jest poprawny zwracamy true w przeciwnym wypadku false..
     */
    boolean IsPinValid(String pin);

    /**
     * Metoda stowarzysza z daną kartą określone konto jedno Konto jedna karta.
     * relacja 1 do 1.
     * @param account Obiekt konta które będzie dodane do karty.
     */
    void AddAccount(IAccount account);

    /**
     * Metoda realizuje wpłatę pieniędzy na konto stowarzyszone z tą kartą
     * @param amount Kwota jaką chcmy wpłacicć
     * @return Zwracamu true lub false w zależności czy operacja się uda (może sie nie udać jak na przykład obiekt konta pod kartą jest = null).
     */
    double DepositFunds(IAccount account, double amount);

    /**
     * Metoda realizuje wypłatę określonej kwoty z konta stowarzyszonego z tą kartą.
     * @param amount Kwota jaką chcmy wypłacić
     * @return Zwracamu true lub false w zależności czy operacja się uda.
     */
    double WithdrawFund(IAccount account, double amount);
}
