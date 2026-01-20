package com.javacore.apis.chasis.dynamicproxyprovider.utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Component
@Slf4j
public class ApiClient {
    private final RestTemplate restTemplate;

    public ApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <T> T get(String url, Class<T> responseType) {
        return restTemplate.getForObject(url, responseType);
    }

    public <T> List<T> getList(String url, Class<T> responseType) {
        try {
            String response = restTemplate.getForObject(url, String.class);
            ObjectMapper mapper = new ObjectMapper();
            JavaType listType = mapper.getTypeFactory()
                    .constructCollectionType(List.class, responseType);
            return mapper.readValue(response, listType);
        } catch (Exception e) {
            log.error("Error making GET request to {}", url, e);
            return Collections.emptyList();
        }
    }




    public <T> T post(String url, Object request, Class<T> responseType) {
        return restTemplate.postForObject(url,request,responseType);
    }
}
