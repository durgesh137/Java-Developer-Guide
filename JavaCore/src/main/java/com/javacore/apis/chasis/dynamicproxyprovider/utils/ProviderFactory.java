package com.javacore.apis.chasis.dynamicproxyprovider.utils;

import com.javacore.apis.chasis.dynamicproxyprovider.services.Provider;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ProviderFactory {
    private final ApplicationContext context;

    public ProviderFactory(ApplicationContext context) {
        this.context = context;
    }

    public Provider getProvider(String type) {
        if(type == null || type.isBlank()) {
            throw new NullPointerException("ProviderType cannot be null");
        }

        ProviderType providerType = findProviderType(type);

        if (providerType == null) {
            throw new IllegalArgumentException("Invalid provider type: " + type);
        }

        return createProviderWithReflection(providerType);
    }


    private Provider createProviderWithReflection(ProviderType providerType) {
        try {
            return context.getBean(providerType.getProviderClass());
        } catch (Exception e) {
            throw new RuntimeException("Failed to create provider: " + providerType.getName(), e);
        }
    }

    private  ProviderType findProviderType(String type) {
        for (ProviderType pt : ProviderType.values()) {
            if (pt.getName().equalsIgnoreCase(type)) {
                return pt;
            }
        }
        return null;
    }
}
