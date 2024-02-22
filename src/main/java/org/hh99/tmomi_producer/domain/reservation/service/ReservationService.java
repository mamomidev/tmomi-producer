package org.hh99.tmomi_producer.domain.reservation.service;

import org.hh99.tmomi_producer.domain.reservation.dto.ReservationDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {
	private final KafkaTemplate<String, ReservationDto> kafkaTemplate;

	public void sendReservationInformation(ReservationDto reservationDto) {
		kafkaTemplate.send("reservation", reservationDto);
	}
}
