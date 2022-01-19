package com.cg.hibernatee.OneToOne;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();   
		      
		    Employee e1=new Employee();    
		    e1.setName("Ravi Malik");    
		    e1.setEmail("ravi@gmail.com");    
		        
		    EmpAdress address1=new EmpAdress();    
		    address1.setAddressLine1("G-21,Lohia nagar");    
		    address1.setCity("Ghaziabad");    
		    address1.setState("UP");    
		    address1.setCountry("India");    
		    address1.setPincode(201301);    
		        
		    e1.setAddress(address1);    
		    address1.setEmployee(e1);    
		        
		    session.persist(e1);    
		    t.commit();    
		        
		    session.close();    
		    System.out.println("success");    
		}    
		}

