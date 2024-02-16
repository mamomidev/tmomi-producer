package org.hh99.tmomi_producer.domain.reservation.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {
	private KafkaTemplate<String, String> kafkaTemplate;

	public void reservationEventIdSend(Long eventTimeId) {
		kafkaTemplate.send("reservationEventTimeId" + eventTimeId, "자리를 주세요");
	}
}
