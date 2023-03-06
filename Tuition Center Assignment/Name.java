public class Name {
    private String fname;
    private String mname;
    private String lname;
    private String ic;



    
    //->constructors:
    public Name(String fname, String mname, String lname, String ic) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.ic = ic;
    }
    //->getter and setters:
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    //->toString: 
    @Override
    public String toString() {
        return  fname + " " + mname  + " " +  lname;
    }
      
}
