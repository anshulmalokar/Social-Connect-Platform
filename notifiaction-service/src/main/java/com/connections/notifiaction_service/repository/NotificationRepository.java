package com.connections.notifiaction_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connections.notifiaction_service.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
