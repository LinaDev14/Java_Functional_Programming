package functionalinterface;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Lina", "3182661523"));
    }

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
