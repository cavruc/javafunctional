package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal Java functional
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);
// Consumer Java Interface
        greetCustomerConsumer.accept(maria);
        String name_1 = "Vera";
        giveOneName.accept(name_1);

    }

    static Consumer<String> giveOneName = name ->
            System.out.println("Hello " + name +
                    " you are the BEST");

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thank for registering phone number "
                    + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thank for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }


}
