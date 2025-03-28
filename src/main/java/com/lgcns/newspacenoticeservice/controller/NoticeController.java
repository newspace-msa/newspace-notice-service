package com.lgcns.newspacenoticeservice.controller;

import com.lgcns.newspacenoticeservice.dto.NoticeRequestDto;
import com.lgcns.newspacenoticeservice.dto.NoticeResponseDto;
import com.lgcns.newspacenoticeservice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notice")
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;

    // 메인화면 공지 조회
    @GetMapping
    public ResponseEntity<NoticeResponseDto> getMainNotice() {
        return ResponseEntity.ok(noticeService.getMainNotice());
    }

    // 공지 등록
    @PostMapping
    public ResponseEntity<NoticeResponseDto> createNotice(@RequestBody NoticeRequestDto requestDto) {
        return ResponseEntity.ok(noticeService.createNotice(requestDto));
    }

    // 공지 수정
    @PutMapping("/{noticeId}")
    public ResponseEntity<NoticeResponseDto> updateNotice(@PathVariable Long noticeId,
                                                          @RequestBody NoticeRequestDto requestDto) {
        return ResponseEntity.ok(noticeService.updateNotice(noticeId, requestDto));
    }

    // 공지 삭제
    @DeleteMapping("/noticeId")
    public ResponseEntity<NoticeResponseDto> deleteNotice(@PathVariable Long noticeId) {
        noticeService.deleteNotice(noticeId);
        return ResponseEntity.ok().build();
    }
}
