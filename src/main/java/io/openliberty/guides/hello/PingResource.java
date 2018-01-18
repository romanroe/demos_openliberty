package io.openliberty.guides.hello;

import javax.inject.Inject;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/get")
public class PingResource {

    @Inject
    private TestService testService;

    @Inject
    private DataSource dataSource;

    @GET
    public String ping() {
        System.out.println("this.dataSource = " + this.dataSource);
        return "ping " + this.testService.getMessage();

    }

}
