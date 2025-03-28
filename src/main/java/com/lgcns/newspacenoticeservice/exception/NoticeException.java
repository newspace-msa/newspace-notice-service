package com.lgcns.newspacenoticeservice.exception;

import lombok.Getter;

@Getter
public class NoticeException extends RuntimeException {

    private NoticeResponseStatus status;

    public NoticeException(NoticeResponseStatus status) {
        super(status.getMessage());
        this.status = status;
    }
}
