package com.bmo.alerts.bs.rest;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@LocalBean
@Path("test")
public class MyResource {
	
	    @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String testMethod() {
	        return "Jaxra-EJB Test";
	    }
}
