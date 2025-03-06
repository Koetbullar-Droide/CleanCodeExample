# DRY (Don't Repeat Yourself) Prinzip in Java

## Projektübersicht
Dieses Java-Projekt demonstriert das Prinzip **Don't Repeat Yourself (DRY)**, indem es zeigt, wie Code-Duplikation vermieden und wiederverwendbare Methoden erstellt werden können. Es enthält zwei Implementierungen:

1. **Schlechtes Beispiel (BadExample)**: Hier wird gegen das DRY-Prinzip verstoßen, indem ähnliche Codeblöcke mehrfach in verschiedenen Methoden wiederholt werden.
2. **Gutes Beispiel (GoodExample)**: Hier wird das DRY-Prinzip korrekt angewendet, indem redundanter Code durch wiederverwendbare Methoden ersetzt wird.

Zusätzlich gibt es eine `Main`-Klasse, die das Programm ausführt und den Unterschied zwischen den beiden Implementierungen demonstriert.

### **Erweiterung: Design Pattern - Singleton**
Neben dem DRY-Prinzip wird auch das **Singleton Design Pattern** in diesem Projekt demonstriert.

**Was ist ein Design Pattern?**
Ein **Design Pattern** ist eine bewährte Lösung für ein häufig auftretendes Problem in der Softwareentwicklung. Das **Singleton-Pattern** wird verwendet, um sicherzustellen, dass eine Klasse nur eine einzige Instanz hat und eine globale Zugriffsmöglichkeit auf diese Instanz bietet.

**Warum Singleton?**
- Verhindert mehrfaches Erstellen von Objekten.
- Ideal für Konfigurationsmanagement, Datenbankverbindungen oder Logging.
- Stellt sicher, dass es eine einzige Quelle der Wahrheit gibt.

## Projektstruktur
```
DRY_Project/
│── src/
│   ├── BadExample.java
│   ├── GoodExample.java
│   ├── ConfigurationManager.java
│   ├── Main.java
│── README.md
│── pom.xml (falls Maven verwendet wird)
│── build.gradle (falls Gradle verwendet wird)
```

## Voraussetzungen
- **JDK 8 oder höher**
- Optional: **Maven oder Gradle** für Build-Management

## Installation & Ausführung
### 1. Kompilieren & Ausführen mit der Kommandozeile
Falls du keine IDE verwendest, kannst du das Projekt manuell kompilieren und ausführen:
```sh
javac Main.java
java Main
```

### 2. Ausführen in einer IDE (z. B. IntelliJ IDEA oder Eclipse)
1. Öffne das Projekt in deiner bevorzugten IDE.
2. Führe die `Main.java`-Datei aus.

## Code-Erklärung
### **Schlechtes Beispiel (`BadExample.java`)**
- Enthält redundante Codeblöcke.
- Wiederholte `System.out.println`-Aufrufe in mehreren Methoden.
- Mangelnde Modularität und Wiederverwendbarkeit.

### **Gutes Beispiel (`GoodExample.java`)**
- Verwendet eine gemeinsame Methode `printPersonInfo()`, um redundanten Code zu vermeiden.
- Erhöht die Lesbarkeit und Wartbarkeit des Codes.
- Vermeidet doppelte Logik durch Methodenaufrufe.

### **Singleton-Pattern (`ConfigurationManager.java`)**
- Nutzt das Singleton-Pattern, um eine einzige Instanz der Konfigurationsverwaltung bereitzustellen.
- Verhindert redundante Objekterstellungen für eine zentrale Konfiguration.
- Beispielhafte Methode `loadConfiguration()` demonstriert die zentrale Steuerung.

### **Main-Klasse (`Main.java`)**
- Erstellt Instanzen von `BadExample` und `GoodExample`.
- Demonstriert den Unterschied zwischen den beiden Implementierungen.
- Testet das Singleton-Pattern, indem es überprüft, dass nur eine Instanz von `ConfigurationManager` existiert.

## Vorteile der DRY-Umsetzung & Singleton-Pattern
✅ Erhöhte **Lesbarkeit** und **Wartbarkeit** des Codes  
✅ Weniger **Fehleranfälligkeit** durch wiederverwendbare Methoden  
✅ Schnellere **Änderungen & Erweiterungen**, da nur eine Methode angepasst werden muss  
✅ **Effizientere Entwicklung**, da weniger redundanter Code geschrieben wird  
✅ Singleton reduziert Speicherverbrauch und stellt sicher, dass es nur eine Instanz gibt

## Erweiterungsmöglichkeiten
- Verwendung von **Objektorientierung** mit einer `Person`-Basisklasse und einer `Employee`-Unterklasse.
- Nutzung von **Interfaces** für eine flexiblere Implementierung.
- Speicherung und Verarbeitung von Benutzerdaten aus einer **Datenbank** oder einer **JSON-Datei**.
- Verwendung des Singleton-Patterns für eine zentrale **Datenbankverwaltung**.

## Fazit
Dieses Projekt zeigt anschaulich, wie das DRY-Prinzip und das Singleton-Pattern in der Softwareentwicklung angewendet werden können, um sauberen, wiederverwendbaren und effizienten Code zu schreiben. Durch die Vermeidung von Redundanzen und die Einführung eines zentralen Konfigurationsmanagements verbessert sich die Wartbarkeit, die Entwicklungszeit wird reduziert und Fehler werden minimiert.

---

### Autor: Jannik
**Lizenz:** MIT License  
**Letzte Aktualisierung:** 20.02.2025
