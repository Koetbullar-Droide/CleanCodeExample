package org.example;

// Hauptklasse zum Ausführen des Codes
public class Main {
    public static void main(String[] args) {

        System.out.println("--- Schlechtes Beispiel ---\n");
        BadExample bad = new BadExample();

        bad.printUserInfo("Max Mustermann", 30, "max@example.com", "Musterstraße 1, 12345 Stadt");
        bad.printEmployeeInfo("Lisa Meier", 35, "lisa@example.com", "IT", 75000, "Beispielweg 5, 54321 Stadt");
        bad.printProjectInfo("Großes Projekt", 100000.0, 10, "Dr. Projektleiter", "31.12.2025");
        bad.printMeetingInfo("Planungsmeeting", "15.03.2025", "09:00", "Meetingraum 1",
                new String[] { "Max", "Lisa", "Thomas" });

        System.out.println("\n--- Gutes Beispiel ---\n");
        GoodExample good = new GoodExample();

        good.printUserInfo("Max Mustermann", 30, "max@example.com", "Musterstraße 1, 12345 Stadt");
        good.printEmployeeInfo("Lisa Meier", 35, "lisa@example.com", "IT", 75000, "Beispielweg 5, 54321 Stadt");
        good.printProjectInfo("Großes Projekt", 100000.0, 10, "Dr. Projektleiter", "31.12.2025");
        good.printMeetingInfo("Planungsmeeting", "15.03.2025", "09:00", "Meetingraum 1",
                new String[] { "Max", "Lisa", "Thomas" });

        System.out.println("\n--- Singleton Beispiel ---\n");
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        // Konfiguration laden (wird nur einmal aufgerufen)
        config1.loadConfiguration();

        config1.setConfigData("Benutzerdefinierte Konfiguration");

        config2.switchMode(false);

        // Prüfen, ob beide Instanzen identisch sind (sollte "true" sein)
        System.out.println("Sind beide Instanzen gleich? " + (config1 == config2));

        // Prüfen, ob die Konfigurationsänderung in beiden Instanzen sichtbar ist
        config2.loadConfiguration();
    }
}
