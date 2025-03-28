package com.lgcns.newspacenoticeservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum NoticeResponseStatus {

    NOT_FOUND_NOTICE(false, 4108, "해당 공지사항 id에 맞는 공지사항을 찾을 수 없습니다.");

    private final boolean isSuccess;
    private final int code;
    private final String message;
    private HttpStatus httpStatus;

    NoticeResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }

    NoticeResponseStatus(boolean isSuccess, int code, String message, HttpStatus httpStatus) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
