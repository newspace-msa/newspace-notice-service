package com.lgcns.newspacenoticeservice.repository;

import com.lgcns.newspacenoticeservice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

    Optional<Notice> findByIsMainTrue();
}
