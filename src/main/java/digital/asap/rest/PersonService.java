package digital.asap.rest;

//import org.jboss.resteasy.plugins.providers.html.View;

import javax.servlet.ServletException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Path("person")
public class PersonService {
/*
    @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;*/
/*
    @GET
    @Produces(MediaType.TEXT_HTML)
    public void get() throws ServletException, IOException {
        request.setAttribute("applicationInstanceList", "sdadasd");
        //Forward to the jsp page for rendering
        request.getRequestDispatcher("/person.jsp").forward(request, response);
        //return new View("person.jsp");
    }*/

    @GET
    public void get(@Context HttpServletRequest request,
                    @Context HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("applicationInstanceList", "sdadasd");
        //Forward to the jsp page for rendering
        request.getRequestDispatcher("/person.jsp").forward(request, response);
        //return new View("person.jsp");
    }

/*
    public Response update(){

    }*/

}
