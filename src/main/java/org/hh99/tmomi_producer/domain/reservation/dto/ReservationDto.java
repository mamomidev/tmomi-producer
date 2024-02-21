package org.hh99.tmomi_producer.domain.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
	private String email;
	private Long eventTimeId;
}
