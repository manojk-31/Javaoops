abstract class PaymentMethod {
    abstract void processPayment(double amount);
}


class CreditCard extends PaymentMethod {
    private static final double TRANSACTION_FEE_PERCENTAGE = 2.0;

   
    void processPayment(double amount) {
        double fee = (amount * TRANSACTION_FEE_PERCENTAGE) / 100;
        double totalAmount = amount + fee;
        System.out.println("Processing Credit Card payment.");
        System.out.printf("Original Amount: $%.2f, Transaction Fee: $%.2f, Total Amount Charged: $%.2f%n",
                amount, fee, totalAmount);
    }
}

class PayPal extends PaymentMethod {
 
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment.");
        System.out.printf("Total Amount Charged: $%.2f%n", amount);
    }
}

public class OnlinePaymentSystem {
   
    public static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); 
    }

    public static void main(String[] args) {
       
        PaymentMethod creditCardPayment = new CreditCard();
        PaymentMethod paypalPayment = new PayPal();
  
        processTransaction(creditCardPayment, 100.00);  
        System.out.println(); 
    }
}
