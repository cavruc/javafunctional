package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer myObj = new Customer("Maria", "99999");
        greetCustomerConsumer.accept(myObj);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thank for registering phone number "
                    + customer.customerPhoneNumber);

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }


}
