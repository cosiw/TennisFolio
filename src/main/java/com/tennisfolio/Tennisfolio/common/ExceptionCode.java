package com.tennisfolio.Tennisfolio.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ExceptionCode {
    INTERNAL_ERROR("9999", "서버 오류가 발생했습니다.", HttpStatus.INTERNAL_SERVER_ERROR),
    RAPID_ERROR("9000", "외부 API 통신을 실패했습니다.", HttpStatus.BAD_GATEWAY),
    PARSER_ERROR("9001", "데이터 파싱 중 오류가 발생했습니다.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_REQUEST("9100", "요청 값을 확인해주세요.", HttpStatus.BAD_REQUEST),
    NOT_FOUND("9200", "해당 데이터가 없습니다.", HttpStatus.NOT_FOUND);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;

    ExceptionCode(String code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
