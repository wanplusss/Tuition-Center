public class TuitionCenter {
    private String tcName;
    private Name HeadMaster;
    private Address address;




    public TuitionCenter(String tcName, Name headMaster, Address address) {
        this.tcName = tcName;
        HeadMaster = headMaster;
        this.address = address;
    }
    
    public Name getHeadMaster() {
        return HeadMaster;
    }

    public void setHeadMaster(Name headMaster) {
        HeadMaster = headMaster;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName;
    }
    

    @Override
    public String toString() {
        return "\nTuition Center : " + tcName + "\nHeadMaster :" + HeadMaster + "\nAddress:" + address;
    }

    

    
}


