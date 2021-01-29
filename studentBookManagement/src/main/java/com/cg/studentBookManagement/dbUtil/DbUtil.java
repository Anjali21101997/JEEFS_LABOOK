package com.cg.studentBookManagement.dbUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbUtil {
	EntityManagerFactory emf;
	EntityManager em;
	public EntityManager createEntityManager()
	{
	    emf=Persistence.createEntityManagerFactory("JPA-PU");
	    em=emf.createEntityManager();
		return em;
	}
	public void closeResources()
	{
		emf.close();
		em.close();
	}
	
	

}
