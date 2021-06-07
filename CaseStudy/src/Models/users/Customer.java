package Models.users;

import Models.services.Services;

public class Customer extends Person implements Comparable<Customer>{
    private String typeCustomer;
    private String adress;
    private Services services;

    public Customer() {
    }

    public Customer(String typeCustomer, String adress, Services services) {
        this.typeCustomer = typeCustomer;
        this.adress = adress;
        this.services = services;
    }

    public Customer(String namePerson, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, String typeCustomer, String adress) {
        super(namePerson, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.adress = adress;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }


    public String showInfor() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                ", adress='" + adress + '\'' +
                ", services=" + services +
                "} " + super.toString();
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + typeCustomer +
                "," + adress ;
    }


    @Override
    public int compareTo(Customer o) {
        return this.getNamePerson().compareTo(o.getNamePerson());
    }
}
