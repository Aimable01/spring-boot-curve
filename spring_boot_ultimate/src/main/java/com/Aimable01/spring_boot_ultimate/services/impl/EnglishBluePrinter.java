package com.Aimable01.spring_boot_ultimate.services.impl;

import com.Aimable01.spring_boot_ultimate.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print(){
        return "Blue";
    }
}
