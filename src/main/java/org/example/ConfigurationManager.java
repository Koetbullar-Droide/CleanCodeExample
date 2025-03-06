package org.example;

// Singleton Design Pattern - Anwendung für DRY-Prinzip
// Das Singleton-Pattern stellt sicher, dass nur eine einzige Instanz einer Klasse existiert.
// Es hilft dabei, redundante Objekterstellungen zu vermeiden und eine zentrale Steuerung zu ermöglichen.

// Singleton-Klasse zur Verwaltung einer gemeinsamen Datenbankverbindung oder Konfiguration
class ConfigurationManager {
    // Private statische Instanz der Klasse (wird nur einmal erstellt)
    private static ConfigurationManager instance;

    // Private Konstruktor, um direkte Instanziierung zu verhindern
    private ConfigurationManager() {
        System.out.println("Konfigurationsmanager initialisiert.");
    }

    // Öffentliche Methode zur Rückgabe der einzigen Instanz
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Beispielmethode, um eine Konfiguration zu laden
    public void loadConfiguration() {
        System.out.println("Lade Konfiguration...");
    }
}

// Beispielklasse zur Demonstration der Nutzung des Singleton-Patterns in der Main Class


