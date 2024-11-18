import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Account Number: " + customer.getAccount().getAccountNumber());
            System.out.println("Balance: " + customer.getAccount().getBalance());
            System.out.println();
        }
    }
}
