/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3oop;

public class Carpenter implements PeobleJob_Interface{
    
    

    
    // Encapsulation variables
    private String name;
    private int age;
    private int HourWork;
    private String type;

    // Defualt Constructor
    public Carpenter() {}
    
    // Parameterized Constructor
    public Carpenter(String name, int age, int HourWork, String type) {
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
        return "Carpenter{" + "name=" + name + ", age=" + age + ", HourWork=" + HourWork + ", type=" + type + '}';
    }
    
    
    
    // Class Methods
    public void ItIsGood(){
        System.out.println("I have good Work ....");
    }
    
    
    public void sayHello(){
        System.out.println("Hello i am a Carpenter");
    }
    
            // Overide PeobleJob_Interface (Implement Methods)

    @Override
    public void Salary() {
    System.out.println("My Salary is 150$ per 1 day");    }

    @Override
    public void JobeTitle() {
    System.out.println("I am a Carpenter");
    }

    @Override
    public void workTime() {
    System.out.println("I am a Work from 7:00 am to 7:00pm");
    }

    @Override
    public void BrackTime() {
    System.out.println("I will take brack from 1:00pm to 2:00pm");
    }

    
}
