public class ObjectsTester {
    private Name name;
    private Address address;
    private Date date;

    
    public ObjectsTester(Name name, Address address, Date date) {
        this.name = name;
        this.address = address;
        this.date = date;
    } 

    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    //-> toString
    @Override
    public String toString() {
        return "Name : " + name + 
             "\naddress :" +address +
             "\ndate :" + date;
    }
    

    


    
}
