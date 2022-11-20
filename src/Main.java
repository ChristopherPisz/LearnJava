import com.poop.Customer;
import com.poop.CustomerReadOnly;
import com.poop.Order;

public class Main {
    public static void main(String[] args) {
        var customer = new Customer("Fred");
        System.out.println(String.format("The customer's name is %s", customer.getName()));

        var order = new Order(customer);
        CustomerReadOnly customerRecord = order.getCustomer();
        System.out.println(String.format("The Order's Customer's name is %s", customerRecord));
    }
}
