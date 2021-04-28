package com.springrest.springrest;

import org.springframework.stereotype.Repository;

	@Repository
	  
	public class PayLoadDAO {
	  
	    private static payLoads list
	        = new payLoads();
	  
	    // This static block is executed
	    // before executing the main
	    // block
	    static
	    {
	  
	        // Creating a few employees
	        // and adding them to the list
	        list.getpayLoadList().add(
	            new PayLoad(
	               "J&k","UP","cement","canter",1,150.0,""));
	  
	       
	           
	    }
	  
	    // Method to return the list
	    public payLoads getAllPayLoads()
	    {
	  
	        return list;
	    }
	  
	       
	        // Method to add an employee
	        // to the employees list
	        public void
	        addPayLoad(PayLoad payload)
	    {
	        list.getpayLoadList()
	            .add(payload);
	           
	    }
	}

