package com.javacore.apis.dynamicproxyprovider.services.impl;

import com.javacore.apis.dynamicproxyprovider.dtos.SimplifiedDto;
import com.javacore.apis.dynamicproxyprovider.utils.ApiClient;
import com.javacore.apis.dynamicproxyprovider.utils.ProviderType;
import com.javacore.apis.dynamicproxyprovider.services.Provider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DefaultProvider implements Provider {
    private final String url = "";
    private final ApiClient apiClient;

    public DefaultProvider(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public ProviderType getProviderType() {
        return ProviderType.DEFAULT;
    }

    @Override
    public List<SimplifiedDto> processRequest() {
        System.out.println("Default Provider - " + ProviderType.DEFAULT);
        //todo complete it
        return null;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
