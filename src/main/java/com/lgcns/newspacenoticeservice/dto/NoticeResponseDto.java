package com.lgcns.newspacenoticeservice.dto;

import com.lgcns.newspacenoticeservice.entity.Notice;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NoticeResponseDto {
    private Long id;
    private String content;
    

    public NoticeResponseDto(Notice notice) {
        this.id = notice.getId();
        this.content = notice.getContent();
    }
}
