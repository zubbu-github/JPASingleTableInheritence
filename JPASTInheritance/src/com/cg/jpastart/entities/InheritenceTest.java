package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Create ONE Employee
		Employee employee = new Employee();
		employee.setName("Zubeir");
		employee.setSalary(50000);
        em.persist(employee);
        
        //Create One Manager
        Manager manager = new Manager();
        manager.setName("Gambhir");
        manager.setSalary(40000);
        manager.setDepartmentname("Training");
        em.persist(manager);
        
        em.getTransaction().commit();
        
        System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}

}
