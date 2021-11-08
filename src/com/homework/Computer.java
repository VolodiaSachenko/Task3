package com.homework;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 08.11.21
 */

public class Computer {
    String cpu;
    String ram;
    String video;
    int id;
    int ssdSpace;

    static Computer[] computers = new Computer[5];

    public Computer(String cpu, String ram, String video, int id, int ssdSpace) {
        this.cpu = cpu;
        this.ram = ram;
        this.video = video;
        this.id = id;
        this.ssdSpace = ssdSpace;
    }

    public static void main(String[] args) {
        computers[0] = new Computer("Intel Core i5-11400 Processor", "8GB DDR4 2666 (PC4 21333) RAM" +
                "(1 8GB DIMM)", "Integrated Intel HD Graphics", 12329, 512);
        computers[1] = new Computer("Intel Core i7-Processor", "4GB DDR4 RAM",
                "Integrated Iris HD Graphics", 3229, 1024);
        computers[2] = new Computer("Intel Celeron N4020", "4GB DDR3", "Radeon AMD",
                654244, 256);
        computers[3] = new Computer("AMD EPYC", "16GB DDR3", "Radeon AMD Graphics",
                99543, 512);
        computers[4] = new Computer("Intel Core i9", "32GB DDR4", "8‑core GPU", 88742,
                1024);

        for (Computer computer : computers) {
            System.out.println("CPU: " + computer.cpu);
            System.out.println("RAM: " + computer.ram);
            System.out.println("Video adapter: " + computer.video);
            System.out.println("Id: " + computer.id);
            System.out.println("SSD space: " + computer.ssdSpace);
            System.out.println("\n----------------------\n");
        }
    }
}
