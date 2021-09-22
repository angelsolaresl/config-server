package com.tis.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationStarter.
 */
@SpringBootApplication
@EnableConfigServer // con esto se dice que será un servidor, que levante todos los mecanismos
public class ApplicationStarter {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);

	}

}
