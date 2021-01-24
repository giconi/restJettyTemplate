package restTemplateJetty;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;


@Path("/entry-point")
public class EntryPoint {

		// TODO Auto-generated method stub
		
		  @GET
		  @Path("test")
		  @Produces(MediaType.TEXT_PLAIN)
		    public String test() {
		        return "Test";
		    }
		  
		  @GET
		  @Path("random")
		  @Produces(MediaType.TEXT_PLAIN)
		  	public float random() {
			  	Random rand = new Random();
			  	return rand.nextFloat();
		  }
		  
		  @GET
		  @Path("item/{id}")
		  public String itemId(@PathParam("id") Integer id) {
		      return "Path parameter value is [" + id + "]";
		  }

}
