
public class Main {
    
    public static void main(String[] args) { // -> run the program
    
        //objects initialization and testing:

        //->names, address, date;

        Name hmAli = new Name("Muhammad", "Ali", "Aizat", "21001416");
        Address hmAliAddr = new Address("Jalan Kemuning 9", "Segamat", "85300", "Johor");

        TuitionCenter kb = new TuitionCenter("Kota Bharu",hmAli, hmAliAddr);

        Name najwan = new Name("Ahmad", "Najwan", "Masnon", "21001416");
        Address najwanAddr = new Address("Jalan Kesumba 2", "Segamat", "85300", "Johor");
        Date najwanDate = new Date("Monday", "6 March 2023");

        Name daniel = new Name("Muhammad", "Daniel", "Aizat", "21001416");
        Address danielAddr = new Address("Jalan Kemuning 2", "Segamat", "85300", "Johor");
        Date danielDate = new Date("Sunday", "5 March 2023");

        Name hakim = new Name("Ahmad", "Hakim", "Hakimi", "21001416");
        Address hakimAddr = new Address("Jalan Merak 2", "Segamat", "85300", "Johor");
        Date hakimDate = new Date("Saturday", "4 March 2023");

        ObjectsTester obj1 = new ObjectsTester(najwan, najwanAddr, najwanDate);


        Tutor najwanTutor = new Tutor(najwan, najwanAddr, "Universiti Teknologi PETRONAS", 5, najwanDate, 5,kb);
        Tutor danielTutor = new Tutor(daniel, danielAddr, "Universiti Teknologi PETRONAS", 5, danielDate, 5,kb);
        Tutor hakimTutor = new Tutor(hakim, hakimAddr, "Universiti Teknologi PETRONAS", 5, hakimDate, 5, kb);

        TutorList accessArrayList = new TutorList();

        accessArrayList.addTutoToList(najwanTutor);
        accessArrayList.addTutoToList(hakimTutor);
        accessArrayList.addTutoToList(danielTutor);


        //->students:

        Name zikri = new Name("Ahmad", "zikri", "Masnon", "21001416");
        Address zikriAddr = new Address("Jalan Kesumba 2", "Segamat", "85300", "Johor");
        Date zikriDate = new Date("Monday", "6 March 2023");

        Name zzat = new Name("Muhammad", "zzat", "Aizat", "21001416");
        Address zzatAddr = new Address("Jalan Kemuning 2", "Segamat", "85300", "Johor");
        Date zzatDate = new Date("Sunday", "5 March 2023");

        Name amir = new Name("Ahmad", "amir", "amiri", "21001416");
        Address amirAddr = new Address("Jalan Merak 2", "Segamat", "85300", "Johor");
        Date amirDate = new Date("Saturday", "4 March 2023");

        int[] testScores = new int[]{25, 20, 30, 40, 50};
        Student zikriStudent = new Student(zikri, zikriAddr, 6, "SK Sri Labis", hakimTutor, testScores,kb );

        int[] testScores1 = new int[]{25, 20, 30, 40, 50};
        Student zzatStudent = new Student(zzat, zzatAddr, 6, "SK Sri Labis", najwanTutor, testScores1 ,kb );

        int[] testScores2 = new int[]{25, 20, 30, 40, 50};
        Student amirStudent = new Student(amir, amirAddr, 6, "SK Sri Labis", danielTutor, testScores2,kb  );
        

        
        



        //printOuts:
        // System.out.println("Name : " +najwan);
        // System.out.println("IC : " + najwan.getIc());
        // System.out.println("Address : " + najwanAddr);


        // System.out.println(obj1);
        // System.out.println("\n" + najwanTutor);
        // System.out.println("\n" + danielTutor);
        // System.out.println("\n" + hakimTutor);


        //accessArrayList.displayTutorInfo();

        System.out.println(zikriStudent);

        System.out.println(zikriStudent.getTutorForStudent());

        zikriStudent.getAverageMarks();
        zikriStudent.getMaxMarks();
        zikriStudent.getMinMarks();

        


        // System.out.println(zikriStudent.getTutorForStudent());
        // System.out.println(zzatStudent.getTutorForStudent());
        // System.out.println(amirStudent.getTutorForStudent());

        // System.out.println(amirStudent);

        // amirStudent.getAverageMarks();
        // amirStudent.getMaxMarks();
        // amirStudent.getMinMarks();




    }


}