package com.springrest.springrest;

import java.util.ArrayList;
import java.util.List;

public class payLoads {
	private List<PayLoad> payLoadList;
	  
    // Method to return the list
    // of employees
    public List<PayLoad> getpayLoadList()
    {
  
        if (payLoadList == null) {
  
            payLoadList
                = new ArrayList<>();
  
                   
        }
  
        return payLoadList;
  
           
    }
  
    public void
    setEmployeeList(
        List<PayLoad> payLoadList)
    {
        this.payLoadList
            = payLoadList;
    }
}

