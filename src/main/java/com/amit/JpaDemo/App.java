package com.amit.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		//To get Employee Details from Table
		Employee employee = new App().getEmployeeDetails(103);
		System.out.println(employee);

		//To set Employee Details in Table
		//new App().setEmployeeDetails(107, "Aman", 27, "Engineering");
		//Employee newEmployee = new App().getEmployeeDetails(107);
		//System.out.println(newEmployee);
	}

	public Employee getEmployeeDetails(int employeeId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Employee emp = em.find(Employee.class, employeeId);
		return emp;
	}

	public void setEmployeeDetails(int empId, String name, int age, String department) {
		Employee empNew = new Employee();
		empNew.setEmpID(empId);
		empNew.setEmpName(name);
		empNew.setEmpAge(age);
		empNew.setEmpDept(department);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(empNew);
		em.getTransaction().commit();
	}

}
