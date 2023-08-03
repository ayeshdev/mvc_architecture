package com.ayesh.mvc_architecture.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/user")
public class UserController {
    @GET()
    @Path("/{id}")
    public String get(@PathParam("id") Long id){
    return id.toString();
    }
}
