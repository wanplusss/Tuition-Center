public class Date {
    private String day;
    private String date;

    
    //->? constructors date:

    //-> 1. FULL CON
    public Date(String day, String date) {
        this.day = day;
        this.date = date;
    }

//-> empty con
    public Date() {
    }



    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return day + ", " + date;
    }

    


    
}
