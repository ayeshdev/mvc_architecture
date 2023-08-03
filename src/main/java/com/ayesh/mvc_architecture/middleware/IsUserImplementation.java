package com.ayesh.mvc_architecture.middleware;

import com.ayesh.mvc_architecture.annotations.IsUser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import org.glassfish.jersey.server.mvc.Viewable;

import java.io.IOException;
@Provider
@IsUser
//@PreMatching
public class IsUserImplementation implements ContainerRequestFilter {

    @Context
    HttpServletRequest request;

    @Context
    HttpServletResponse response;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
//        System.out.println("IsUserImplementation....");
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            System.out.println("Not login...");
            containerRequestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).entity(new Viewable("/404")).build());
        };
    }
}
