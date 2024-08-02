package com.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/test")
public class TestController  {

    @GET
    @Path("/hello")
    public void t1(@QueryParam("name") String name){
        System.out.println("Hi every body " +name);
    }

    @POST
    @Path("/t2")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String t2(Person person){
        System.out.println("Test Post "+person.getName());
        return "Hi First Post";
    }

}
