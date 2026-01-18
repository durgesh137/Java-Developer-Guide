package com.javacore.apis.dynamicproxyprovider.services;

import com.javacore.apis.dynamicproxyprovider.dtos.SimplifiedDto;
import com.javacore.apis.dynamicproxyprovider.utils.ProviderType;

import java.util.List;

public interface Provider {
    ProviderType getProviderType();
    List<SimplifiedDto> processRequest();
    String getUrl();
}
