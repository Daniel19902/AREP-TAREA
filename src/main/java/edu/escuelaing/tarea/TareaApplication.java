package edu.escuelaing.tarea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareaApplication {

	public static void main(String[] args) {
		System.out.println(9/5);
		SpringApplication.run(TareaApplication.class, args);
	}

}
