package com.supersoft.service;

import java.util.List;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.dao.StudentDAO;
import com.supersoft.model.Student;






@Repository
public class StudentServiceImpl implements StudentService {
     
	@Autowired
    private StudentDAO studentDAO;

    @Transactional
	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
    	studentDAO.saveStudent(stu);
		
	} 
    
    @Transactional
    @Override
    public void editStudent(Student stu)
    {
    	studentDAO.editStudent(stu);
    }
    
    
    
    
    
    @Transactional
	@Override
	public void updateStudent(Student stu)
    	{
		System.out.println("StudentServiceImpl.updateStudent()");
		// TODO Auto-generated method stub
		studentDAO.updateStudent(stu);
		}
    
    

    @Transactional
    @Override
	public void removeStudentById(Integer id) {
		// TODO Auto-generated
    	studentDAO.removeStudentById(id);
		
		
	}

    @Transactional
    @Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentById(id);
	}

    @Transactional
	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentByEmail(email);
	}
    
    
    @Transactional
	@Override
	public Student getStudentByMobile(String mobile) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentByMobile(mobile);
	}

    

    @Transactional
	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return studentDAO.listStudent();
	}

	@Transactional
    @Override
	public void mergeStudent(Student stu2) 
	{
		// TODO Auto-generated method stub
		studentDAO.mergeStudent(stu2);
		
	}


   /* @Transactional
   	@Override
   	public void updateStudent(Student stu) {
   		System.out.println("UserServiceImpl.updateUser()");
   		// TODO Auto-generated method stub
   		studentDAO.updateStudent(stu);
   		
   	}*/

    
}
