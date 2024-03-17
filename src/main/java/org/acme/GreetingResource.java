package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String bye() {
        return "Hello kunal controller";
    }


    @GET
    @Path("/kunal")
    @Produces(MediaType.TEXT_PLAIN)
    public String kunal() {
        return "Hello kunal custom controller";
    }
}
