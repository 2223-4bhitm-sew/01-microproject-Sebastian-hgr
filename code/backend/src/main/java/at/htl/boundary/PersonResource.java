package at.htl.boundary;

import at.htl.control.CustomerRepository;
import at.htl.entity.Customer;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

@Path("/customer")
public class PersonResource {


    @Inject
    CustomerRepository customerRepository;

    private List<Customer> customers = new LinkedList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Customer customer) {
        customers.add(customer);
        return Response.created(null).build();
    }


    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(Customer customer) {
        if(customers.size() > 0) {
            customers.remove(customer);
        }
        return Response.noContent().build();
    }
}
