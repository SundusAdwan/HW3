/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3oop;

/**
 *
 * @author Solin SM
 */
public class Student implements PeobleJob_Interface{
    
    // Encapsulation variables
    private String name;
    private int age;
    private int HourWork;
    private String type;
    
    // Defualt Constructor
    public Student() {}
    
    // Parameterized Constructor
    public Student(String name, int age,int HourWork, String type) {
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
    public void setHourWork(int HourWork)  {   this.HourWork = HourWork; }
    public void setType(String type)    {   this.type = type;   }
    
    
    
    
    // Override Methods (toString Method)
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", HourWork=" + HourWork + ", type=" + type+ '}';
    }
    
    
    // Class Methods
    public void Grade(){
        System.out.println("It's nice Grade");
    }
    
    public void sayHello(){
        System.out.println("Hello ... ");
    }

    
            // Overide PeobleJob_Interface (Implement Methods)

    @Override
    public void Salary() {
        System.out.println("I am a Student , My Salary is 0$");

    }

    @Override
    public void JobeTitle() {
        System.out.println("I am Still Student");
    }

    @Override
    public void workTime() {
        System.out.println("I Can start Study from 5:pm to 10:00pm ");

    }

    @Override
    public void BrackTime() {
        System.out.println("I can take brak from 6:00pm to 6:30pm");

    }
    
}
