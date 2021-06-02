package Models.users;

import Models.services.Services;

public class Customer extends Person {
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

    public Customer(String namePerson, String dateOfBirth, String identityNumber, String phoneNumber, String email, String typeCustomer, String adress, Services services) {
        super(namePerson, dateOfBirth, identityNumber, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.adress = adress;
        this.services = services;
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
}
