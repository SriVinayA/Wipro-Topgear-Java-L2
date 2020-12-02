package Topic2.Assignment4;

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    public void paymentDetails() {
        System.out.println("The payment amount is = " + this.amount);
    }
}