package org.hh99.tmomi_producer.global.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.serialization.StringSerializer;
import org.hh99.reservation.dto.ReservationDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
public class KafkaConfig {
	@Value(value = "${spring.kafka.bootstrap-servers}")
	private String bootstrapAddress;
	@Value(value = "${aws.access-key}")
	private String awsAccessKeyId;
	@Value(value = "${aws.secret-access-key}")
	private String awsSecretAccessKey;

	@Bean
	public ProducerFactory<String, ReservationDto> producerFactory() {
		Map<String, Object> config = new HashMap<>();
		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

//		System.setProperty("AWS_ACCESS_KEY_ID", awsAccessKeyId);
//		System.setProperty("AWS_SECRET_ACCESS_KEY", awsSecretAccessKey);
//
//		config.put(AdminClientConfig.SECURITY_PROTOCOL_CONFIG, "SASL_SSL");
//		config.put(SaslConfigs.SASL_MECHANISM, "AWS_MSK_IAM");
//		config.put(SaslConfigs.SASL_JAAS_CONFIG, "software.amazon.msk.auth.iam.IAMLoginModule required;");
//		config.put(SaslConfigs.SASL_CLIENT_CALLBACK_HANDLER_CLASS,
//				"software.amazon.msk.auth.iam.IAMClientCallbackHandler");

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public KafkaTemplate<String, ReservationDto> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
}