package com.integratingfactor.idp.common.service.exceptions;

public class IdpNotFoundException extends IdpException {

    /**
     * 
     */
    private static final long serialVersionUID = 6548333090093460454L;

    public IdpNotFoundException(String error) {
        super("Does not exists: " + error);
    }

    @Override
    protected int getStatus() {
        return 404;
    }
}
