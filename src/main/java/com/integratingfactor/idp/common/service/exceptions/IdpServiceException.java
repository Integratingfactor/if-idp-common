package com.integratingfactor.idp.common.service.exceptions;

public class IdpServiceException extends IdpException {

    /**
     * 
     */
    private static final long serialVersionUID = 6548333090093460454L;

    public IdpServiceException(String error) {
        super("Service Error: " + error);
    }
}
