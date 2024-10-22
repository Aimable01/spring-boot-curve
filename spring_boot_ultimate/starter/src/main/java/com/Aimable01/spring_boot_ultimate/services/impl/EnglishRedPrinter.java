package com.Aimable01.spring_boot_ultimate.services.impl;

import com.Aimable01.spring_boot_ultimate.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print(){
        return "Red";
    }
}
