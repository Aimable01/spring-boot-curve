package com.Aimable01.spring_boot_ultimate.services.impl;

import com.Aimable01.spring_boot_ultimate.services.BluePrinter;
import com.Aimable01.spring_boot_ultimate.services.ColourPrinter;
import com.Aimable01.spring_boot_ultimate.services.GreenPrinter;
import com.Aimable01.spring_boot_ultimate.services.RedPrinter;

public class ColourPrintImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColourPrintImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print(){
        return String.join(", ",redPrinter.print(),greenPrinter.print(),bluePrinter.print());
    }
}
