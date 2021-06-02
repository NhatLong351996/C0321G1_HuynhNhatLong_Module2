package Test;

import Models.user_exception.DateOfBirthException;
import Models.users.Customer;
import Models.users.Person;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setDateOfBirth();
    }
}
