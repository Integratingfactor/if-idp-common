package com.integratingfactor.idp.common.service.exceptions;

public class IdpValidationException extends IdpException {

    /**
     * 
     */
    private static final long serialVersionUID = 6548333090093460454L;

    public IdpValidationException(String error) {
        super("Validation Error: " + error);
    }

    @Override
    protected int getStatus() {
        return 400;
    }
}
