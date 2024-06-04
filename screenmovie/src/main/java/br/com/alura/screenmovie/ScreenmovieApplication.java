package br.com.alura.screenmovie;

import br.com.alura.screenmovie.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmovieApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmovieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibirMenu();

	}
}
