package org.hh99.tmomi_producer.domain.reservation.controller.v1;

import org.hh99.tmomi_producer.domain.reservation.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ReservationController {

	private final ReservationService reservationService;

	@PostMapping("/eventTimes/{eventTimeId}/reservation")
	public void reservation(@PathVariable Long eventTimeId) {
		reservationService.reservationEventIdSend(eventTimeId);
	}
}
