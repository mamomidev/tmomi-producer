package org.hh99.tmomi_producer.domain.reservation.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class ReservationController {

	@PostMapping("/eventTimes/{eventTimeId}/reservation")
	public void reservation(@PathVariable Long eventTimeId){

	}
}
