package com.ayesh.mvc_architecture.controllers;

import com.ayesh.mvc_architecture.annotations.IsUser;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@IsUser
@Path("/")
public class HomeController {
    @GET
    //me wage thanak thamai endpoint ekak kiyanne. e kiynne controller ekaka request ekak awilla hariytama eka complete wenawanm ekata api kiyanawa end point kiyala
    public String index(){
        return "Eren Yeager";
    }
}
