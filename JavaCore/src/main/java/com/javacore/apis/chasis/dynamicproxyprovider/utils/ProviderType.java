package com.javacore.apis.chasis.dynamicproxyprovider.utils;

import com.javacore.apis.chasis.dynamicproxyprovider.services.Provider;
import com.javacore.apis.chasis.dynamicproxyprovider.services.impl.ClothingProvider;
import com.javacore.apis.chasis.dynamicproxyprovider.services.impl.DefaultProvider;
import com.javacore.apis.chasis.dynamicproxyprovider.services.impl.UserProvider;

public enum ProviderType {
    CLOTHING("men-women's clothing", ClothingProvider.class),
    USER("users", UserProvider.class),
    DEFAULT("default", DefaultProvider.class);

    private final String name;
    private final Class<? extends Provider> providerClass;

    ProviderType(String name, Class<? extends Provider> providerClass) {
        this.name = name;
        this.providerClass = providerClass;
    }

    public String getName() {
        return name;
    }

    public Class<? extends Provider> getProviderClass() {
        return providerClass;
    }
}
