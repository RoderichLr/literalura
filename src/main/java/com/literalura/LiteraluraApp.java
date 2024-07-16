package com.literalura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.literalura.menu.ClientMenu;
import com.literalura.repository.AutorRepository;
import com.literalura.repository.LibroRepository;

@SpringBootApplication
public class LiteraluraApp implements CommandLineRunner {

	@Autowired
	private LibroRepository libroRepositorio;
	@Autowired
	private AutorRepository autorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ClientMenu client = new ClientMenu(libroRepositorio, autorRepositorio);
		client.menu();
	}

}
