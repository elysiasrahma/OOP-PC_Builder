package com.vortex.pc;

import java.util.List;
import java.util.Arrays;
import com.vortex.pc.core.*;
import com.vortex.pc.storage.*;
import com.vortex.pc.peripheral.*;
import com.vortex.pc.base.*;

class PC {
    private String pcName;

    private Motherboard motherboard;
    private CPU cpu;
    private RAM ram;

    private List<StorageDevice> storageDevices;
    private List<Peripheral> peripherals;

    public PC(String pcName, Motherboard motherboard, CPU cpu, RAM ram) {
        this.pcName = pcName;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storageDevices = new java.util.ArrayList<>();
        this.peripherals = new java.util.ArrayList<>();
    }

    public void addStorage(StorageDevice storage) {
        storageDevices.add(storage);
    }

    public void addPeripheral(Peripheral peripheral) {
        peripherals.add(peripheral);
    }

    public double calculateTotalPrice() {
        double total = 0.0;

        ComponentGroup coreGroup = new ComponentGroup(Arrays.asList(motherboard, cpu, ram));
        total += coreGroup.calculateTotalPrice();

        ComponentGroup storageGroup = new ComponentGroup(storageDevices);
        total += storageGroup.calculateTotalPrice();

        ComponentGroup peripheralGroup = new ComponentGroup(peripherals);
        total += peripheralGroup.calculateTotalPrice();

        return total;
    }

    public void displaySpecs() {
        System.out.println("=".repeat(50));
        System.out.println("PC: " + pcName);
        System.out.println("=".repeat(50));

        System.out.println("\nCORE COMPONENTS:");
        System.out.println("  - " + motherboard.getName() + " (Rp " + motherboard.getPrice() + ")");
        System.out.println("  - " + cpu.getName() + " (Rp " + cpu.getPrice() + ")");
        System.out.println("  - " + ram.getName() + " (Rp " + ram.getPrice() + ")");

        System.out.println("\nSTORAGE:");
        for (StorageDevice storage : storageDevices) {
            System.out.println("  - " + storage.getName() + " (Rp " + storage.getPrice() + ")");
        }

        System.out.println("\nPERIPHERALS:");
        if (peripherals.isEmpty()) {
            System.out.println("  - (none)");
        } else {
            for (Peripheral peripheral : peripherals) {
                System.out.println("  - " + peripheral.getName() + " (Rp " + peripheral.getPrice() + ")");
            }
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("TOTAL PRICE: Rp " + calculateTotalPrice());
        System.out.println("=".repeat(50));
    }
}
