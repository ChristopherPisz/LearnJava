import com.poop.Customer;
import com.poop.Order;

public class Main {
    public static void main(String[] args) {
        var customer = new Customer("Fred");

        // String are passed by ref, but are immutable
        String name = customer.getName();
        name = "Poop";

        // Is Fred's name now Poop?
        // No, because strings are passed by reference, but are immutable, and when you assign an immutable, it makes a new object?
        // Therefore, the local name has its own address in memory?
        System.out.println(String.format("The customer's name is %s", customer.getName()));
        System.out.println(String.format("Local name is %s", name));

        //---------------
        var order = new Order(customer);
        System.out.println(String.format("The Order's Customer's name is %s", order.getCustomer().getName()));

        // TODO - To demonstrate the problem I want to prevent. How do we stop dumb callers from changing the member data
        // of the order, while still being able to read it?
        Customer customer2 = order.getCustomer();
        customer2.setName("Barney");
        System.out.println(String.format("The Order's Customer's name is %s", order.getCustomer().getName()));




    }
}
