package com.heren.his.rest.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/inject/context")
public class ContextInjectedResource {
    @Context
    private LocalDependency local;

    @GET
    @Path("parameter")
    public String parameter(@Context ParameterDependency dependency) {
        return dependency.parameter();
    }

    @GET
    @Path("local")
    public String local() {
        return local.local();
    }

    public static interface LocalDependency {
        String local();
    }

    public static interface ParameterDependency {
        String parameter();
    }
}
