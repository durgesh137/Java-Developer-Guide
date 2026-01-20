package com.javacore.apis.chasis.dynamicproxyprovider.services.impl;

import com.javacore.apis.chasis.dynamicproxyprovider.dtos.SimplifiedDto;
import com.javacore.apis.chasis.dynamicproxyprovider.utils.ApiClient;
import com.javacore.apis.chasis.dynamicproxyprovider.utils.ProviderType;
import com.javacore.apis.chasis.dynamicproxyprovider.services.Provider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserProvider implements Provider {
    private final String url = "https://reqres.in/api/users";
    private final ApiClient apiClient;

    public UserProvider(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public ProviderType getProviderType() {
        return ProviderType.USER;
    }

    @Override
    public List<SimplifiedDto> processRequest() {
        System.out.println("User Provider - " + ProviderType.USER.name());
        //todo complete it
        return null;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
