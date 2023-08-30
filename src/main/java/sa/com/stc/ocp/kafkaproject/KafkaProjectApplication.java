package sa.com.stc.ocp.kafkaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProjectApplication {

	public static void main(String[] args) {
		 SpringApplication.run(KafkaProjectApplication.class, args);
	}

}
