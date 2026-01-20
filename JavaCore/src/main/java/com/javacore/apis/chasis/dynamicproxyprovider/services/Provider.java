package com.javacore.apis.chasis.dynamicproxyprovider.services;

import com.javacore.apis.chasis.dynamicproxyprovider.dtos.SimplifiedDto;
import com.javacore.apis.chasis.dynamicproxyprovider.utils.ProviderType;

import java.util.List;

public interface Provider {
    ProviderType getProviderType();
    List<SimplifiedDto> processRequest();
    String getUrl();
}
