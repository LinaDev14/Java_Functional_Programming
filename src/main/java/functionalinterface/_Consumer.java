package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // Normal Java function
        Customer maria = (new Customer("Mateo", "31245268569"));
        greetCustomer(maria);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thank for registering phone number " + customer.customerPhoneNumber);


    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thank for registering phone number " + customer.customerPhoneNumber);
    }
    static class Customer {
        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        private final String customerName;
        private final String customerPhoneNumber;

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }

    }
}
