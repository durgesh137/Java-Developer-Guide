package com.javacore.apis.dynamicproxyprovider.controllers;

import com.javacore.apis.dynamicproxyprovider.GenericResponse;
import com.javacore.apis.dynamicproxyprovider.dtos.SimplifiedDto;
import com.javacore.apis.dynamicproxyprovider.utils.ProviderFactory;
import com.javacore.apis.dynamicproxyprovider.services.Provider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Develop a REST endpoint that accepts a providerType parameter and returns a refined dataset sourced from an external vendor.
 * - The system must determine the correct integration logic dynamically
 * - strip the external response of any fields not required by our internal data contract.
 */
@RestController
@RequestMapping("/api/provider")
@Slf4j
public class ProviderController {

    private final ProviderFactory providerFactory;

    public ProviderController(ProviderFactory providerFactory) {
        this.providerFactory = providerFactory;
    }

    @GetMapping("/details")
    public ResponseEntity<GenericResponse<List<SimplifiedDto>>> getProducts(@RequestParam String provider) {
        // Get provider using factory
        Provider providerObj = providerFactory.getProvider(provider);
        List<SimplifiedDto> simplifiedDtos = providerObj.processRequest();

        // Build response
        return ResponseEntity.ok(GenericResponse.success(simplifiedDtos,"Providers data fetched successfully!"));
    }
}

/**
 * Here url to get data based the provider is different for each implementation class
 * - hence put final parameter in each of implementation class
 */