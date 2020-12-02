/*
Define a class named Payment that contains a member variable of type double that stores the
amount of the payment and appropriate accessor and mutator methods. Also create a method
named paymentDetails that outputs an English sentence to describe the amount of the payment.
Next, define a class named CashPayment that is derived from Payment. This class should
redefine the paymentDetails method to indicate that the payment is in cash. Include appropriate
constructor(s).
Define a class named CreditCardPayment that is derived from Payment. This class should
contain member variables for the name on the card, expiration date, and credit card number.
Include appropriate constructor(s). Finally, redefine the paymentDetails method to include all
credit card information in the printout.
Create a main method that creates at least two CashPayment and two
CreditCardPayment objects with different values and calls paymentDetails for each
*/

package Topic2.Assignment4;

public class Assignment4 {
    public static void main(String[] args) {
        CashPayment cp1 = new CashPayment(100.00);
        CashPayment cp2 = new CashPayment(200.00);

        CreditCardPayment ccp1 = new CreditCardPayment(1000.00, "name1", "04/27", "7412 8963 8254 4563");
        CreditCardPayment ccp2 = new CreditCardPayment(2000.00, "name2", "03/27", "4561 7894 6549 1234");

        cp1.paymentDetails();
        ccp1.paymentDetails();
        cp2.paymentDetails();
        ccp2.paymentDetails();
    }
}