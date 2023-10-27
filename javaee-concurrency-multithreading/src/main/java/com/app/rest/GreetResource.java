package com.app.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greetUser")
public class GreetResource {
	@GET
	public String greetUser() {
		return "Welcome to Java EE Concurrency project";
	}

}
