package com.integratingfactor.idp.common.db.service;

public interface GdsDaoBase {

    String nameSpace();

    void cleanupExpired();
}
