import java.util.Arrays;


public class Student {
    private Name name;
    private Address address;
    private int year;
    private String schoolname;
    private Tutor tutorForStudent;
    private int[] listOfMarks = new int[5] ;
    private TuitionCenter tuitionCenter;


    
    //->constructors
    public Student(Name name, Address address, int year, String schoolname, Tutor tutorForStudent, int[] listOfMarks, TuitionCenter tuitionCenter) {
        this.name = name;
        this.address = address;
        this.year = year;
        this.schoolname = schoolname;
        this.tutorForStudent = tutorForStudent;
        this.listOfMarks = listOfMarks;
        this.tuitionCenter = tuitionCenter;
    }

    //-> getters and setters
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getSchoolname() {
        return schoolname;
    }
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    public Tutor getTutorForStudent() {
        return tutorForStudent;
    }
    public void setTutorForStudent(Tutor tutorForStudent) {
        this.tutorForStudent = tutorForStudent;
    }
    public int[] getListOfMarks() {
        return listOfMarks;
    }
    public void setListOfMarks(int[] listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    public void getAverageMarks(){
        System.out.println("\nAvg Mark For:" + getName());
        int sum =0;
        for (int i = 0; i< listOfMarks.length;i++){
            sum = listOfMarks[i] + sum;}
        float avg = sum/listOfMarks.length;

        System.out.println("Average mark:" + avg);
    }

    public void getMaxMarks(){
        System.out.println("\nMax Mark For: " + getName());
        int max =-100;
        for (int i = 0; i< listOfMarks.length;i++){
            if (listOfMarks[i] > max){
                max = listOfMarks[i];}

        }
        System.out.println("Max mark:" + max);
    
}

    public void getMinMarks(){
        System.out.println("\nMin Mark For :" + getName());
        int min =999;
        for (int i = 0; i< listOfMarks.length;i++){
            if (listOfMarks[i] < min){
                min = listOfMarks[i];}

        }
        System.out.println("Min mark:" + min);


    
}

    public TuitionCenter getTuitionCenter() {
        return tuitionCenter;
    }

    public void setTuitionCenter(TuitionCenter tuitionCenter) {
        this.tuitionCenter = tuitionCenter;
    }

    @Override
    public String toString() {
        return "\nStudents data:" + "\nName :" + name + "\nAddress : " + address + "Year :" + year + "\nSchoolname :" + schoolname
                +"\nList of Marks" + Arrays.toString(listOfMarks) + "\nTuition Center :" + tuitionCenter.getTcName() ;
    }
    
    

    






}
