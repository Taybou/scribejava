package com.github.scribejava.apis;

import com.github.scribejava.core.builder.api.DefaultApi20;

/**
 * FranceConnect API
 */
public class FranceConnectApi extends DefaultApi20 {

    protected FranceConnectApi() {
    }

    private static class InstanceHolder {
        private static final FranceConnectApi INSTANCE = new FranceConnectApi();
    }

    public static FranceConnectApi instance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return "https://app.franceconnect.gouv.fr/api/v1/token";
    }

    @Override
    protected String getAuthorizationBaseUrl() {
        return "https://app.franceconnect.gouv.fr/api/v1/authorize";
    }
}