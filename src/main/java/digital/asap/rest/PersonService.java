package digital.asap.rest;

import digital.asap.Person;
import digital.asap.PersonBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import java.io.IOException;

@Path("person")
public class PersonService {

    @Inject
    private PersonBean personBean;

    @GET
    public void get(@Context HttpServletRequest request,
                    @Context HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("contextPath", request.getContextPath());
        request.setAttribute("person", this.personBean.getPerson());
        request.getRequestDispatcher("/person.jsp").forward(request, response);
    }

    @POST
    public void post(Person person) {
        this.personBean.setPerson(person);
    }

}
