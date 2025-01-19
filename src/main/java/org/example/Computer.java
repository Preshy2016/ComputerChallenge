package org.example;

public class Computer {
    private String name;
    private String HDD;
    private String RAM;
    private String OS;

    public Computer(String name, String HDD, String RAM, String OS) {
        this.name = name;
        this.HDD = HDD;
        this.RAM = RAM;
        this.OS = OS;

    }

    public String getName() {
        return name;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getOS() {
        return OS;
    }
}

