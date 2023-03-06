import java.util.ArrayList;

public class TutorList {
    
    //used an dynamic array using ArrayList
    ArrayList <Tutor> tutorArrayList = new ArrayList<Tutor>(); //created an array list of tutor?

    // getters and setters kena try |
    public ArrayList<Tutor> getTutorArrayList(Tutor tutor) {
        return tutorArrayList;
    }

    public void setTutorArrayList(ArrayList<Tutor> tutorArrayList) {
        this.tutorArrayList = tutorArrayList;
    }

    //-> method: displayTutorInfo:

    public void displayTutorInfo(){
        
        for (int i=0; i< tutorArrayList.size(); i++){
            System.out.println("#" + (i+1));
            System.out.println("NAME :" + tutorArrayList.get(i).getName());
            System.out.println("IC :" + tutorArrayList.get(i).getDateJoined());
            System.out.println("ADDRESS :" + tutorArrayList.get(i).getAddress());
        }

    }

    public void addTutoToList(Tutor a){
        //for (int i=0; i< tutorArrayList.size(); i++){
        this.tutorArrayList.add(a);}

    public void searchTutoinList(Tutor a){
        //for (int i=0; i< tutorArrayList.size(); i++){
        this.tutorArrayList.add(a);
    }

    
    
}


