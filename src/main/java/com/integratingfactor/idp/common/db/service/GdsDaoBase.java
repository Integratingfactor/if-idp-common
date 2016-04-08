package com.integratingfactor.idp.common.db.service;

public interface GdsDaoBase {

    static final String GdsDaoNameSpaceEnvKey = "idp.service.db.keyspace.name";

    String nameSpace();

    void cleanupExpired();
}
