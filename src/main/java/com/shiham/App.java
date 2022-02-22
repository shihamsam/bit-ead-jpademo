package com.shiham;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
		EntityManager em = emf.createEntityManager();
		
		
		Student stu = em.find(Student.class, 1);
		
		System.out.println(stu);
		
	}

}
