package org.example.department.serviceImplementation;

import org.example.department.entities.Staff;
import org.example.department.entities.Student;
import org.example.department.entities.Teacher;
import org.example.department.entities.User;
import org.example.department.enums.Behaviour;
import org.example.department.services.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public String admit(Student student){
        if(student.getAge() < (20)){
            return student.getFirstName()+ " " + student.getLastName()+ " " + " Admitted";

        }
        return "Not Admitted";
    }


    @Override
    public void employ(Staff staff){

    }
    @Override
    public void expel(Student student){
        if(student.getBehaviour().equals(Behaviour.WORSE)){
        System.out.println("You have been Rusticated: ");
    }
    }
    @Override
    public void suspended(User user){
        if (user.getBehaviour().equals(Behaviour.BAD)){
        System.out.println("you have been suspended: ");
    }
    }
    @Override
    public void promote(Teacher teacher){
        if(teacher.getBehaviour().equals(Behaviour.EXCELLENT)){//|| ()) LAST DATE OF PROMOTION

            System.out.println("You have earned a promotion");
        }

    }
    public void award(User user){
        if(user.getBehaviour().equals(Behaviour.OUTSTANDING)){
            System.out.println("Congratulations!!!\n" + "Award of Excellence");
        }

    }

}
