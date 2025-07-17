package com.jsp.view;

import java.util.Scanner;
import com.jsp.Model.Student;
import com.jsp.controller.*;

public class Studentview {
	private static Scanner sc=new Scanner(System.in);
	private static Student getStudentObject() {
		//create the Students type of Object
		Student s=new Student();
		System.out.println("Enter ID");
		int id=sc.nextInt();
		sc.nextLine();
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Email");
        String email=sc.nextLine();
        System.out.println("Enter Password");
        String pass=sc.nextLine();
        System.out.println("Enter DOB");
        String dob=sc.nextLine();
        System.out.println("Enter Gender");
        String gender=sc.nextLine();
        System.out.println("Enter relationshipstatus");
        String relationShipStatus=sc.nextLine();
        System.out.println("Enter Mobile ");
        long mob =sc.nextLong();
        
        //set info students Object
        
        s.setId(id);
        s.setName(name);
        s.setEmail(email);
        s.setPassword(pass);
        s.setDob(dob);
        s.setGender(gender);
        s.setRelationshipStatus(relationShipStatus);
        s.setMob(mob);
        
        return s;
		}
	
	public static Student getStudentUpdate() {
		//create the Students type of Object
		Student s=new Student();
		System.out.println("Enter ID");
		int id=sc.nextInt();
		sc.nextLine();
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Email");
        String email=sc.nextLine();
        System.out.println("Enter Password");
        String pass=sc.nextLine();
        System.out.println("Enter DOB");
        String dob=sc.nextLine();
        System.out.println("Enter Gender");
        String gender=sc.nextLine();
        System.out.println("Enter relationshipstatus");
        String relationShipStatus=sc.nextLine();
        System.out.println("Enter Mobile ");
        long mob =sc.nextLong();
        
        //set info students Object
        
        s.setId(id);
        s.setName(name);
        s.setEmail(email);
        s.setPassword(pass);
        s.setDob(dob);
        s.setGender(gender);
        s.setRelationshipStatus(relationShipStatus);
        s.setMob(mob);
        
        return s;
		}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("**** Welcome to SMS Project\n\n\n\n");
		
		StudentController controller=new StudentController();
		while(true) {
			System.out.println("1.Create Students");
			System.out.println("2.Find Student by id");
			System.out.println("3.update Student by id");
			System.out.println("4.Delete Student by id");
			System.out.println("5.Find All Students");
			System.out.println("6.Exit\n");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int choice= sc.nextInt();
			System.out.println(choice);
			
			switch(choice) {
			case 1:
//				System.out.println("1. Create Students");
				//logic to create the students type of object
				Student s=getStudentObject();//Students Obejct
				controller.saveStudent(s);
				
				System.out.println("Student Saved");
				//saveStudent() to store object into ArrayList
				break;
				
			case 2:
				//Find By ID 
				
				System.out.println("Enter Id");
				int id=sc.nextInt();				
				controller.findById(id);
				break;
				
			case 3:
				
				//update by id
				System.out.println("Enter Id to Update");
			    int id1 = sc.nextInt();
			    sc.nextLine();
			    Student updatedStudent = getStudentUpdate();
			    controller.updateById(id1, updatedStudent);
			    break;
				
			case 4:
				System.out.println("Enter Id to Delete");
				int id2=sc.nextInt();
				controller.deleteById(id2);
				break;
				
			case 5:
				//findAll() 
				
				controller.findAll();
				break;
				
			case 6:
				System.out.println("Thank You");
				return;
				
			default:
				System.out.println("invalid Choice");
			}
		}
		
		
	}

}
