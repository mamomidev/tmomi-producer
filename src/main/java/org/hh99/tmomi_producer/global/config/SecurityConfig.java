package org.hh99.tmomi_producer.global.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@RequiredArgsConstructor
@Import({org.hh99.tmomi.global.config.SecurityConfig.class, org.hh99.tmomi.global.jwt.JwtTokenProvider.class})
public class SecurityConfig {

}
