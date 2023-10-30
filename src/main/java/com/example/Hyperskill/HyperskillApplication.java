package com.example.Hyperskill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class HyperskillApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SpringApplication.run(HyperskillApplication.class, args);
		System.out.println("Diego Bonitão");

		System.out.println("Digite o valer de X: ");
		int x = scanner.nextInt();
		int fx = (x + 4) * 2 + 1;
		System.out.println(fx);

	}

}
