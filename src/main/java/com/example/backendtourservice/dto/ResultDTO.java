package com.example.backendtourservice.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
/**
 * Controller 계층에서 API 호출 성공 시에 반환할 DTO
 */
public class ResultDTO<T> {
    private final int resultCode;
    private final String message;
    private final T data;
}
