package com.Aimable01.spring_boot_ultimate;

import com.Aimable01.spring_boot_ultimate.services.ColourPrinter;
import com.Aimable01.spring_boot_ultimate.services.impl.ColourPrintImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		final ColourPrinter colourPrinter = new ColourPrintImpl();
		log.info(colourPrinter.print());
	}
}
