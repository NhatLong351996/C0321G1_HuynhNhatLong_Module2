package Manager;

import Models.users.Customer;

import java.util.List;

public class ManagerCustomer {
    public static void addNewCustomer(List<Object> customers){
        Customer customer = new Customer();
        customer.setNamePerson();
       customer.setDateOfBirth();
        /*customer.setIdentityNumber();
        customer.setPhoneNumber();
        customer.setEmail();
        customer.setTypeCustomer();
        customer.setAdress();
        customer.setServices();
        customers.add(customer);*/
    }
}
