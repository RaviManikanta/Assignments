package com.yash.RestDemos;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    
//    public String getIt() {
//        return "Got it!";
//    }
	
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String Html() {
    	return "<html> " +
    			"<title>" + "Hello Jersey" + "</title>" +
    			"<body><h1>" + "Hello Jersey HTML" + "</h1></body>" +
    			"</html> ";  
    }
}
