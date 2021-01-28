/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3oop;

/**
 *
 * @author user
 */
public class HW3OOP {

    public static void main(String[] args) {
        
        PeobleJob_Interface JobCarpenter = new Carpenter();   // upcast
        JobCarpenter.workTime();
        
        PeobleJob_Interface a_Carpenter = new Carpenter("Hamdan", 30 ,9, "Rock");
        a_Carpenter.Salary();
        
        Carpenter c = new Carpenter();
        // Define values of cat
        c.setName("Adawi");
        c.setType("Rab");
        c.setHourWork(60);
        c.setAge(28);
        
        // print result methods & info of above cat
        c.sayHello();
        c.BrackTime();
        c.ItIsGood();
        System.out.println(c.toString());
        
        // We can do same to Dogs
        System.out.println("===================================");
        System.out.println("Test Teacher_Help class\n");
        
        Teacher_Help teacher_H = new Teacher_Help();
        teacher_H.setA(a_Carpenter);
        teacher_H.startWork();
        teacher_H.TeacherName(c);
        
        System.out.println("===================================");
        System.out.println("Test Singer & Student classes\n");
        
        PeobleJob_Interface S = new Student("Sundus", 24, 1,"Student");
        S.workTime();
        S.JobeTitle();
        
        Singer singer =  new Singer("Ahlam", 30, 5,"Rock & Rab");
        singer.Back();
        singer.Salary();
        
    }
    
}





