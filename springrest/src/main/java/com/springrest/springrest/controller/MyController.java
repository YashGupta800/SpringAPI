package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.PayLoad;
import com.springrest.springrest.PayLoadDAO;
import com.springrest.springrest.payLoads;

@RestController
public class MyController {

	 @Autowired
	   private PayLoadDAO payloadDao;
	       
	   @GetMapping("/load")
	    public payLoads getPayLoads()
	    {
	  
	        return payloadDao
	            .getAllPayLoads();
	    }
	   
	   @PostMapping("/load")
	   public void addpayLoad(
		        @RequestBody PayLoad load)
		    {
		      payloadDao.addPayLoad(load);
		    }
		    
}
