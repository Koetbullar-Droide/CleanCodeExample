# DRY (Don't Repeat Yourself) Prinzip in Java

## Projektübersicht
Dieses Java-Projekt demonstriert das Prinzip **Don't Repeat Yourself (DRY)**, indem es zeigt, wie Code-Duplikation vermieden und wiederverwendbare Methoden erstellt werden können. Es enthält zwei Implementierungen:

1. **Schlechtes Beispiel (BadExample)**: Hier wird gegen das DRY-Prinzip verstoßen, indem ähnliche Codeblöcke mehrfach in verschiedenen Methoden wiederholt werden.
2. **Gutes Beispiel (GoodExample)**: Hier wird das DRY-Prinzip korrekt angewendet, indem redundanter Code durch wiederverwendbare Methoden ersetzt wird.

Zusätzlich gibt es eine `Main`-Klasse, die das Programm ausführt und den Unterschied zwischen den beiden Implementierungen demonstriert.

## Projektstruktur
```
DRY_Project/
│── src/
│   ├── BadExample.java
│   ├── GoodExample.java
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

### **Main-Klasse (`Main.java`)**
- Erstellt Instanzen von `BadExample` und `GoodExample`.
- Demonstriert den Unterschied zwischen den beiden Implementierungen.
- Gibt die Benutzer- und Mitarbeiterinformationen für beide Beispiele aus.

## Vorteile der DRY-Umsetzung
✅ Erhöhte **Lesbarkeit** und **Wartbarkeit** des Codes  
✅ Weniger **Fehleranfälligkeit** durch wiederverwendbare Methoden  
✅ Schnellere **Änderungen & Erweiterungen**, da nur eine Methode angepasst werden muss  
✅ **Effizientere Entwicklung**, da weniger redundanter Code geschrieben wird

## Erweiterungsmöglichkeiten
- Verwendung von **Objektorientierung** mit einer `Person`-Basisklasse und einer `Employee`-Unterklasse.
- Nutzung von **Interfaces** für eine flexiblere Implementierung.
- Speicherung und Verarbeitung von Benutzerdaten aus einer **Datenbank** oder einer **JSON-Datei**.

## Fazit
Dieses Projekt zeigt anschaulich, wie das DRY-Prinzip in der Softwareentwicklung angewendet werden kann, um sauberen und wiederverwendbaren Code zu schreiben. Indem Redundanzen vermieden werden, verbessert sich nicht nur die Wartbarkeit des Codes, sondern auch die Entwicklungszeit und die Fehleranfälligkeit wird reduziert.

---

### Autor: Jannik
**Lizenz:** MIT License  
**Letzte Aktualisierung:** 20.02.2025

