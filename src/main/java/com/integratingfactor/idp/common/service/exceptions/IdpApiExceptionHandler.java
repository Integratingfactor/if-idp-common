package com.integratingfactor.idp.common.service.exceptions;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IdpApiExceptionHandler implements ExceptionMapper<Exception> {
    private static Logger LOG = Logger.getLogger(IdpApiExceptionHandler.class.getName());

    @Context
    HttpServletRequest request;

    public Response toResponse(Exception e) {
        if (e instanceof IdpException) {
            LOG.info(((IdpException) e).getError());
            return ((IdpException) e).toResponse();
        } else if (e instanceof WebApplicationException) {
            return ((WebApplicationException) e).getResponse();
        } else {
            e.printStackTrace();
            return Response.status(500).type(MediaType.APPLICATION_JSON_TYPE).entity(e.getMessage()).build();
        }
    }

}
