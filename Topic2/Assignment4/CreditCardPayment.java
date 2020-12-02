package Topic2.Assignment4;

class CreditCardPayment extends Payment {
    String CardName, ExpirationDate, CreditCardNumber;

    CreditCardPayment(double Value, String CardName, String ExpirationDate, String CreditCardNumber) {
        super(Value);
        this.CardName = CardName;
        this.ExpirationDate = ExpirationDate;
        this.CreditCardNumber = CreditCardNumber;
    }

    public void paymentDetails() {
        System.out.println("The payment of Amount " + this.amount + " by the card \"" + this.CreditCardNumber + "\" with the expiry date " + this.ExpirationDate + " by the card holder " + this.CardName);
    }
}