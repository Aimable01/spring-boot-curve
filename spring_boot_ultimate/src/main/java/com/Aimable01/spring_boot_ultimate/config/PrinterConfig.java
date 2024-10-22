package com.Aimable01.spring_boot_ultimate.config;

import com.Aimable01.spring_boot_ultimate.services.BluePrinter;
import com.Aimable01.spring_boot_ultimate.services.ColourPrinter;
import com.Aimable01.spring_boot_ultimate.services.GreenPrinter;
import com.Aimable01.spring_boot_ultimate.services.RedPrinter;
import com.Aimable01.spring_boot_ultimate.services.impl.ColourPrintImpl;
import com.Aimable01.spring_boot_ultimate.services.impl.EnglishBluePrinter;
import com.Aimable01.spring_boot_ultimate.services.impl.EnglishGreenPrinter;
import com.Aimable01.spring_boot_ultimate.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter) {
        return new ColourPrintImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
