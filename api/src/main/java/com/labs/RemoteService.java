package com.labs;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8081")
@Path("/hello-remote")
public interface RemoteService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRemoteHello();
}
