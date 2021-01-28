/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3oop;

public class Singer extends Teacher{

    
    // Encapsulation variables
    private String namee;
    private String type;
    private int age;
    private int HourWork;

    
    // Defualt Constructor
    public Singer() {}
    
    // Parameterized Constructor

    /**
     *
     * @param name
     * @param age
     * @param HourWork
     * @param type
     */
    

    public Singer(String namee, int age, int HourWork , String type) {
        this.namee = namee;
        this.age=age;
        this.HourWork = HourWork;
        this.type = type;
    }
    
    
    //Getter
    public String getNamee(){  return namee;    }
    public int getAge() {   return age;    }
    public String getType() {   return type;    }
    public int getHourWork() {   return HourWork;    }
    
    
    //Setter
    public void setNamee(String namee)  {   this.namee = namee; }
    public void setAge(int age)    {  this.age = age;    }
    public void setType(String type)    {  this.type = type;    }
    public void setHourWork(int HourWork)    {  this.HourWork = HourWork;    }
    
    
    // Override Methods (toString Method)
    @Override
    public String toString() {
        return "Singer{" + "namee=" + namee + ", type=" + type + ", HourWork=" + HourWork + ",Age=" + age + '}';
    }
    
    
}
