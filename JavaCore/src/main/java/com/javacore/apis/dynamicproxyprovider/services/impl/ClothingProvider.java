package com.javacore.apis.dynamicproxyprovider.services.impl;

import com.javacore.apis.dynamicproxyprovider.dtos.ProductDto;
import com.javacore.apis.dynamicproxyprovider.dtos.SimplifiedDto;
import com.javacore.apis.dynamicproxyprovider.utils.ApiClient;
import com.javacore.apis.dynamicproxyprovider.utils.ProviderType;
import com.javacore.apis.dynamicproxyprovider.services.Provider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ClothingProvider implements Provider {
    private final String url = "https://fakestoreapi.com/products";
    private final ApiClient apiClient;

    public ClothingProvider(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public ProviderType getProviderType() {
        return ProviderType.CLOTHING;
    }

    @Override
    public List<SimplifiedDto> processRequest() {
        System.out.println("Clothing Provider - " + ProviderType.CLOTHING.name());
        List<ProductDto> products = apiClient.getList(url, ProductDto.class);
        log.info("response {}", products);
        List<SimplifiedDto> simplifiedProducts = products.stream()
                .map(product -> new SimplifiedDto(
                        product.getTitle(),
                        product.getCategory()
                ))
                .toList();
        return simplifiedProducts;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
