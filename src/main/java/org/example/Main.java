package org.example;

// Hauptklasse zum Ausführen des Codes
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Schlechtes Beispiel ---");
        BadExample bad = new BadExample();
        bad.printUserInfo("Max Mustermann", 30, "max@example.com");
        bad.printEmployeeInfo("Lisa Meier", 35, "lisa@example.com", "IT", 75000);

        System.out.println("\n--- Gutes Beispiel ---");
        GoodExample good = new GoodExample();
        good.printUserInfo("Max Mustermann", 30, "max@example.com");
        good.printEmployeeInfo("Lisa Meier", 35, "lisa@example.com", "IT", 75000);
    }
}