package com.integratingfactor.idp.common.service.exceptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public abstract class IdpException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -5742205755086739266L;
    private String error;

    protected IdpException() {
    }

    protected abstract int getStatus();

    protected IdpException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    @Override
    public String getMessage() {
        return error;
    }

    public Response toResponse() {
        return Response.status(getStatus()).type(MediaType.APPLICATION_JSON_TYPE).entity(getError()).build();
    }

}
