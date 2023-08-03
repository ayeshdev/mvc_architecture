package com.ayesh.mvc_architecture.controllers;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import org.glassfish.jersey.server.mvc.Viewable;

import java.util.HashMap;
import java.util.Map;

@Path("/login")
public class LoginController {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Viewable index(){
        Map<String, Object> model = new HashMap<>();
        model.put("name","Achintha");
        model.put("address","Colombo");
        return new Viewable("/login_index",model);
    }

    @POST
    public Response loginAction(@FormParam("email") String email, @FormParam("password") String password, @Context HttpServletRequest request){
        if(email.equals("user@gmail.com") && password.equals("1234")){
            request.getSession().setAttribute("user","1");
//            return Response.temporaryRedirect(UriBuilder.fromUri("").build()).build();
            return Response.status(Response.Status.FOUND).location(UriBuilder.fromUri("").build()).build();
        }else{
//            return Response.temporaryRedirect(UriBuilder.fromUri("/login").build()).build();
            return Response.status(Response.Status.FOUND).location(UriBuilder.fromUri("login").build()).build();
        }
    }

//    @POST
//    public String loginAction(@QueryParam("name") String a, @QueryParam("address") String b){
//        System.out.println(a);
//        System.out.println(b);
//        return a;
//    };
//
//    @POST
//    public String postLoginAction(@FormParam("name") String name){
//        System.out.println(name);
//        return name;
//    };
};
