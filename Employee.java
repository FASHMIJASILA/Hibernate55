package com.cg.hibernatee.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


	@Entity  
	@Table(name="emp220")  
	public class Employee {
		   
		    @Id  
		    @GeneratedValue(strategy=GenerationType.AUTO)  
		    @PrimaryKeyJoinColumn  
		private int employeeId;    
		private String name,email;    
		@OneToOne(targetEntity=EmpAdress.class,cascade=CascadeType.ALL)  
		private EmpAdress address;  
		public int getEmployeeId() {  
		    return employeeId;  
		}  
		public void setEmployeeId(int employeeId) {  
		    this.employeeId = employeeId;  
		}  
		public String getName() {  
		    return name;  
		}  
		public void setName(String name) {  
		    this.name = name;  
		}  
		public String getEmail() {  
		    return email;  
		}  
		public void setEmail(String email) {  
		    this.email = email;  
		}  
		public EmpAdress getAddress() {  
		    return address;  
		}  
		public void setAddress(EmpAdress address) {  
		    this.address = address;  
		}    
		  
		}   
	
	
	
 