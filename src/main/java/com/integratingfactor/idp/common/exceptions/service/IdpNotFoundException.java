package com.integratingfactor.idp.common.exceptions.service;

public class IdpNotFoundException extends IdpException {

    /**
     * 
     */
    private static final long serialVersionUID = 6548333090093460454L;

    public IdpNotFoundException(String error) {
        super("Does not exists: " + error);
    }
}
