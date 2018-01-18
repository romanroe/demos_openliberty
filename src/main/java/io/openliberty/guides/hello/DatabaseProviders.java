package io.openliberty.guides.hello;

import org.apache.commons.dbcp.BasicDataSource;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;


@ApplicationScoped
public final class DatabaseProviders {

    @Produces
    public DataSource createDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:mem:testdb;mode=postgresql");
        ds.setUsername("");
        ds.setPassword("");
        return ds;
    }

}
