package br.usp.dsid.consumerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestApplication.class, args);
		
		Consumer consumer = new Consumer();
		System.out.println("\nGET\n");
		consumer.getMethod("Brazil");
		System.out.println("\nPOST\n");
		consumer.postMethod(JsonPlaceHolder.builder().title("a title").body("a body").userId(14).build());
		System.out.println("\nPUT\n");
		consumer.putMethod(JsonPlaceHolder.builder().id(101).title("a different title").body("a different body").userId(14).build(), "10");
		System.out.println("\nDELETE\n");
		consumer.deleteMethod("10");
		System.exit(0);
	}

}
