package com.integratingfactor.idp.common.service.exceptions;

public abstract class IdpException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -5742205755086739266L;
    private String error;

    protected IdpException() {
    }

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

}
