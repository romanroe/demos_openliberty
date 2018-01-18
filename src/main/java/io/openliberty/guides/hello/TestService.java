package io.openliberty.guides.hello;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestService {

    public String getMessage() {
        return "" + Math.random();
    }

}
