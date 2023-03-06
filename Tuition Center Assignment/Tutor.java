

public class Tutor {
    private Name name;
    private Address address;
    private String qualification;
    private int yearsOfExp;
    private Date dateJoined; 
    private int yearsInTheCenter;
    private TuitionCenter tuitionCenter;

    
    //-> constructors:
    public Tutor(Name name, Address address, String qualification, int yearsOfExp, Date dateJoined,
            int yearsInTheCenter, TuitionCenter tuitionCenter) {
        this.name = name;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExp = yearsOfExp;
        this.dateJoined = dateJoined;
        this.yearsInTheCenter = yearsInTheCenter;
        this.tuitionCenter = tuitionCenter;
    }

    //-> getters and setters:
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getYearsInTheCenter() {
        return yearsInTheCenter;
    }

    public void setYearsInTheCenter(int yearsInTheCenter) {
        this.yearsInTheCenter = yearsInTheCenter;
    }

    public TuitionCenter getTuitionCenter() {
        return tuitionCenter;
    }

    public void setTuitionCenter(TuitionCenter tuitionCenter) {
        this.tuitionCenter = tuitionCenter;
    }

    //-> toString:
    @Override
    public String toString() {
        return "\nTutor's Data:" + "\nName : " + name + "\naddress : " + address + "\nqualification : " + qualification + "\nyearsOfExp : "
                + yearsOfExp + "\ndateJoined : " + dateJoined + "\nyearsInTheCenter : " + yearsInTheCenter + "\nTuition Center :" + tuitionCenter;
    }

    

}
