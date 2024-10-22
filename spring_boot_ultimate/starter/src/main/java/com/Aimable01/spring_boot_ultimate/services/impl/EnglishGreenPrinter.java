package com.Aimable01.spring_boot_ultimate.services.impl;

import com.Aimable01.spring_boot_ultimate.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print(){
        return "Green";
    }
}
