package com.rocks.distributed_lovable.intelligence_service.repository;

import com.rocks.distributed_lovable.intelligence_service.entity.ChatEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatEventRepository extends JpaRepository<ChatEvent, Long> {
}
