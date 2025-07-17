package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.Model.Student;
import com.jsp.view.Studentview;

public class StudentController {
	//Business Logic
	
	
	private ArrayList<Student> al=new ArrayList();
	
	//save student in ArrayList
	public void saveStudent(Student student)//student<---s
	{
		al.add(student);
		
	}
	public void findAll()
	{
		for(Student s:al) {
			System.out.println(s);
		}
	}
	public void findById(int id)  //id<----id
	{
		for(Student s : al)
		{
			if(s.getId()==id){
			System.out.println(s);
			return;
			}
			
		}
		System.out.println(id+ "Id Not Found");
		
	}
	 public boolean updateById(int id, Student updatedStudent) {
	        for (Student s : al) {
	            if (s.getId() == id) {
	                s.setName(updatedStudent.getName());
	                s.setEmail(updatedStudent.getEmail());
	                s.setPassword(updatedStudent.getPassword());
	                s.setDob(updatedStudent.getDob());
	                s.setGender(updatedStudent.getGender());
	                s.setRelationshipStatus(updatedStudent.getRelationshipStatus());
	                s.setMob(updatedStudent.getMob());
	                System.out.println(id + " Id is updated successfully.");
	                return true;
	            }
	        }
	        System.out.println(id + " Id not found");
	        return false;
	    }
	public void deleteById(int id)  //id<----id
	{
		for(Student s : al)
		{
			if(s.getId()==id){
				int a=Math.abs(al.indexOf(id));
			al.remove(s);
			System.out.println(id + "Id is Deleted");
			return;
			}
			
		}
		System.out.println(id+ "Id Not Found");
		
	}
	

}
