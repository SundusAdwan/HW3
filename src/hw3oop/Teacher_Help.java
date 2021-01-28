
package hw3oop;


public class Teacher_Help {
    
    // Data Coupling : call function from class in another function relate to another class
    // Stamp Coupling : use object and using some of param
    // We should reduce using coupling
    
    PeobleJob_Interface a;
    
    public void setA(PeobleJob_Interface a){  // Stamp Coupling
        this.a = a;
    }
    
    public void startWork(){
        a.workTime();// Data Coupling
    }
    
    public void TeacherName(Carpenter t){    // This is Stamp Coupling (Teacher t)
        System.out.println("The type & name of Teacher is : " + t.getType() + " " + t.getName());     // Data Coupling in print
    }
    
    /* better to reduce Coupling is to define ( String Type , String name ) instead of ( Teacher t )*/
    
}
