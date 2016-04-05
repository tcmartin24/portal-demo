package io.ctl.demos.portaldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.java.CloudScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@CloudScan
public class PortalDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalDemoApplication.class, args);
	}
}
