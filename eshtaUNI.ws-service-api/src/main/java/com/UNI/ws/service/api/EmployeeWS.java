package com.UNI.ws.service.api;

import com.UNI.dto.EmployeeDTO;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.MediaType;

/**
 * User: Abdelrazik
 * Date: 04/16/14
 */
@Path("/")
public interface EmployeeWS {
	
	@GET
    @Path("/getEmpid")
    @Produces(MediaType.APPLICATION_JSON)
	EmployeeDTO getEmpid( @QueryParam("id") long id);
    
   
    
    
    @GET
    @Path("/getFirstname")
    @Produces(MediaType.APPLICATION_JSON)
    EmployeeDTO getFirstname(@QueryParam("firstname") String firstname) throws Exception;
    
    
    @GET
    @Path("/getLastname")
    @Produces(MediaType.APPLICATION_JSON)
    EmployeeDTO getLastname( @QueryParam("lastname") String lastname) throws Exception;
    
    @POST
    @Path("/insertNewEmp")
    @Produces(MediaType.APPLICATION_JSON)
    EmployeeDTO insertNewEmp(@FormParam ("firstname") String firstName, @FormParam ("lastname") String lastName, @FormParam ("salary") int salary);
   
    
    


	
}
