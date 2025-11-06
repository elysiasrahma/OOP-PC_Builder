package com.vortex.pc;

import com.vortex.pc.core.*;
import com.vortex.pc.storage.*;
import com.vortex.pc.peripheral.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("VORTEX PC SOLUTIONS - PC Configurator (REFACTORED)\n");

        // Contoh 1: Gaming PC
        PC gamingPC = new PC(
            "Gaming PC",
            new Motherboard("ASUS ROG", 5000000),
            new CPU("Intel i9", 8000000),
            new RAM("Corsair 32GB", 2500000)
        );

        gamingPC.addStorage(new SSD("Samsung 1TB", 2000000));
        gamingPC.addStorage(new SSD("Seagate 2TB", 800000)); // ganti HDD -> SSD

        gamingPC.addPeripheral(new Mouse("Logitech G502", 600000));
        gamingPC.addPeripheral(new Keyboard("Corsair K95", 2000000));
        gamingPC.addPeripheral(new Mouse("LG 27\" (as display)", 5000000)); // ganti Monitor -> Mouse placeholder

        gamingPC.displaySpecs();

        System.out.println("\n\n");

        // Contoh 2: Office PC
        PC officePC = new PC(
            "Office PC",
            new Motherboard("MSI B560", 1500000),
            new CPU("Intel i5", 2500000),
            new RAM("Kingston 16GB", 800000)
        );

        officePC.addStorage(new SSD("WD 500GB", 750000));

        officePC.addPeripheral(new Mouse("Logitech M170", 100000));
        officePC.addPeripheral(new Keyboard("Logitech K120", 150000));
        officePC.addPeripheral(new Keyboard("Canon Pixma (as printer)", 1200000)); // ganti Printer -> Keyboard placeholder

        officePC.displaySpecs();
    }
}
