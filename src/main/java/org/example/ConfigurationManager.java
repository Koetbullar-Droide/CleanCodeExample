package org.example;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configData;
    private boolean isDevelopmentMode;

    // Privater Konstruktor, um direkte Instanziierung zu verhindern
    private ConfigurationManager() {
        System.out.println("Konfigurationsmanager initialisiert.");
        configData = "Standardkonfiguration";
        isDevelopmentMode = true; // Standardmäßig Entwicklungsmodus
    }

    // Öffentliche Methode zur Rückgabe der einzigen Instanz
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Beispielmethode zum Laden einer Konfiguration
    public void loadConfiguration() {
        System.out.println("Lade Konfiguration: " + configData);
        if (isDevelopmentMode) {
            System.out.println("Achtung: Entwicklungsmodus ist AKTIV.");
        } else {
            System.out.println("Läuft im Produktivmodus.");
        }
    }

    // Methode zur Änderung der Konfiguration
    public void setConfigData(String newConfig) {
        configData = newConfig;
        System.out.println("Neue Konfiguration gesetzt: " + configData);
    }

    // Methode zum Umschalten zwischen Entwicklungs- und Produktionsmodus
    public void switchMode(boolean devMode) {
        isDevelopmentMode = devMode;
        System.out.println("Modus gewechselt: " + (isDevelopmentMode ? "Entwicklung" : "Produktion"));
    }
}