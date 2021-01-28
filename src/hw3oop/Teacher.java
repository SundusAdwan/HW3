/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3oop;

public class Teacher implements PeobleJob_Interface{
    
    // Encapsulation variables
    private String name;
    private int age;
    private int HourWork;
    private String type;

    // Defualt Constructor
    public Teacher() {}

    // Parameterized Constructor
    public Teacher(String name, int age, int HourWork, String type) {
        this.name = name;
        this.age = age;
        this.HourWork = HourWork;
        this.type = type;
    }
    
    
    //Getter
    public String getName() {   return name;    }
    public int getAge()     {   return age;     }
    public int getHourWork(){   return HourWork;   }
    public String getType() {   return type;    }
    
    
    // Setter
    public void setName(String name)    {   this.name = name;   }
    public void setAge(int age)         {   this.age = age;     }
    public void setColor(int HourWork)  {   this.HourWork = HourWork; }
    public void setType(String type)    {   this.type = type;   }
    
    
    // Class Methods
    public void startLecture(){
	System.out.println("Lecture Start");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void Back(){
        System.out.println("Teacher Back");
    }
    
    // Overload Methods
    public int speedLecture(){
        int speed = 2;
        return speed;
    }
    
    public String speedLecture(Singer b){
        double speed = 2.6;
        String bird_speed = b.getNamee() + " " + speed;
        return bird_speed;
    }

    
        // Overide PeobleJob_Interface (Implement Methods)

    @Override
    public void Salary() {
        System.out.println("Teacher Salary : 50$ per 1 h");
    }

    @Override
    public void JobeTitle() {
        System.out.println("I am a Teacher");
    }

    @Override
    public void workTime() {
        System.out.println("i will start at 9:00am ");
    }

    @Override
    public void BrackTime() {
        System.out.println("I will Take a brack from 2:00 pm to 4:00pm");
    }
}
