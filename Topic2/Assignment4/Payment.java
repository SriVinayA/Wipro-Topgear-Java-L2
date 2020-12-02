package Topic2.Assignment4;

class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = Math.round(amount * 100) / 100.0;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void paymentDetails() {
        System.out.println("The payment amount is= " + this.amount);
    }
}