public class Address {
    //-> attributes
    private String street;
    private String district;
    private String postcode;
    private String state;

    //-> constructors:
    public Address(String street, String district, String postcode, String state) {
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;
    }
    //-> getters and setters:
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }


    //-> toString:
    @Override
    public String toString() {
        return street + ", " + district + ", " + postcode + ", " + state;
                
    }
    

    
    
    
}
