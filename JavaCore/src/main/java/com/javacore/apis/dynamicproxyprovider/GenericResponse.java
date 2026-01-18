package com.javacore.apis.dynamicproxyprovider;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GenericResponse<T> {
    private boolean success;
    private String message;
    private HttpStatus httpStatus;
    private T payload;
    private String errorDetails;

    // Success response factory method
    public static <T> GenericResponse<T> success(T payload, String message) {
        return GenericResponse.<T>builder()
                .success(true)
                .message(message)
                .httpStatus(HttpStatus.OK)
                .payload(payload)
                .build();
    }

    // Error response factory method
    public static <T> GenericResponse<T> error(String message, HttpStatus status, String errorDetails) {
        return GenericResponse.<T>builder()
                .success(false)
                .message(message)
                .httpStatus(status)
                .errorDetails(errorDetails)
                .build();
    }
}
