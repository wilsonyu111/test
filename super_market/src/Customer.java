import javax.sound.sampled.Line;

public class Customer{

    private String custID;
    private String name;
    private String address;
    private String phone;


    public Customer(String custID, String name, String address, String phone)
    {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.custID = custID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    public String getCustID()
    {
        return custID;
    }
}
