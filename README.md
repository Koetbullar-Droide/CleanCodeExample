# DRY (Don't Repeat Yourself) Prinzip in Java

## Projektübersicht

Dieses Java-Projekt demonstriert das **Don't Repeat Yourself (DRY)**-Prinzip, indem es zeigt, wie Code-Duplikation vermieden werden kann. Dazu existieren zwei Varianten:

1. **Schlechtes Beispiel** (`BadExample`): Verstößt gegen DRY, indem ähnliche Logik und Ausgaben mehrfach in verschiedenen Methoden vorkommen.
2. **Gutes Beispiel** (`GoodExample`): Setzt das DRY-Prinzip konsequent um, indem mehrfach verwendeter Code in private Helper-Methoden ausgelagert wird.

Ergänzend habe ich das **Singleton Design Pattern** implementiert (`ConfigurationManager`), um das Thema Clean Code weiter zu vertiefen. Die `Main`-Klasse führt den Code aus und zeigt die Unterschiede zwischen schlecht und gut umgesetztem DRY, sowie das Singleton im Einsatz.

---

## Design Principle: DRY

Das DRY-Prinzip besagt, dass Informationen innerhalb eines Softwaresystems nur **einmal** vorkommen sollten. Jeder Codeblock, der mehr als einmal existiert, kann schnell zu Inkonsistenzen und erhöhtem Wartungsaufwand führen. Das Ziel ist es, Wiederholungen zu minimieren und stattdessen zentrale, wiederverwendbare Methoden oder Klassen zu erstellen.

### Warum DRY?

- **Bessere Wartbarkeit**: Änderungen müssen nur an einer Stelle vorgenommen werden.
- **Weniger Fehler**: Redundanter Code führt schnell zu Inkonsistenzen.
- **Übersichtlichere Struktur**: Gemeinsam genutzter Code ist zentral organisiert.

## Schlechtes Beispiel (`BadExample.java`)

Im **schlechten Beispiel** werden für verschiedene Zwecke (Benutzer, Mitarbeiter, Projekte, Meetings) **jeweils ähnliche Methoden** angelegt, die alle nahezu dieselben Abläufe beinhalten:

- Mehrfache `System.out.println`-Statements
- Redundante Hinweise bzw. Footer-Informationen
- Keine zentrale Wiederverwendung

**Warum ist das schlecht?**  
Diese Vorgehensweise **verstößt gegen das DRY-Prinzip**, weil dieselbe Logik (z.B. das Ausgeben von Kopfzeilen und Hinweisen) in jeder Methode **kopiert** wird. Bei Änderungen muss man diese Stellen **alle** anfassen, was fehleranfällig und aufwendig ist.

## Gutes Beispiel (`GoodExample.java`)

Im **guten Beispiel** wird **wiederkehrende Logik** in private Helper-Methoden ausgelagert:

- `printSectionHeader(String header)`: Ausgabe einer einheitlichen Überschrift
- `printInfoFooter(String note)`: Ausgabe von Hinweisen und Trennern
- `printBasicFields(String... fields)`: Dynamisches Ausgeben mehrerer Felder

So existiert der Code für Kopfzeilen, Hinweise und Felder nur **einmal**, was die **Wartung** erleichtert. Neue Ausgabemethoden lassen sich schnell hinzufügen, indem sie einfach auf diese Helfer-Methoden zurückgreifen.

---

## Design Pattern: Singleton (`ConfigurationManager.java`)

**Was ist ein Singleton?**  
Ein **Singleton** ist ein Entwurfsmuster, das sicherstellt, dass eine Klasse nur **eine einzige Instanz** hat und eine globale Zugriffsmöglichkeit darauf bietet.

### Warum dieses Pattern?

Bei Konfigurationsverwaltung (z.B. `ConfigurationManager`) soll nur eine zentrale Instanz existieren, um **Redundanz** zu vermeiden und sicherzustellen, dass alle Komponenten dieselbe Konfiguration nutzen.

### Nutzen für das DRY-Prinzip

- **Vermeidet doppelte Objekterzeugung**: Statt mehrere Konfigurationsobjekte zu erstellen, nutzen alle Teile des Programms dieselbe Instanz.
- **Zentrale Steuerung**: Änderungen, wie das Umschalten zwischen Entwicklungs- und Produktionsmodus, werden an einer einzigen Stelle verwaltet.

## Hauptklasse (`Main.java`)

- Ruft zuerst das **schlechte Beispiel** auf und demonstriert die redundante Code-Struktur.
- Zeigt anschließend das **gute Beispiel**, in dem Helper-Methoden redundante Logik verhindern.
- **Singleton-Beispiel**: Erstellt zwei Variablen, die beide auf dieselbe Singleton-Instanz verweisen, lädt die Konfiguration und zeigt, dass Änderungen (z.B. `switchMode(false)`) systemweit gelten.

---

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
```

## Voraussetzungen

- **JDK 8 oder höher**
- Optional: **Maven** für Build-Management

## Installation & Ausführung

### Ausführen in einer IDE (z. B. IntelliJ IDEA oder Eclipse)

1. Öffne das Projekt in deiner bevorzugten IDE.
2. Führe die `Main.java`-Datei aus.

## Fazit

Durch das **DRY-Prinzip** wird in diesem Projekt gezeigt, wie man doppelten Code vermeidet und so die Wartbarkeit erhöht. Das **Singleton-Pattern** bietet darüber hinaus eine elegante Lösung, um nur **eine** Instanz einer Klasse zu verwalten, was im Sinne des DRY-Prinzips ebenfalls redundante Objekterstellungen und Konfigurationsfehler verhindert.

---

### Autor: Jannik

**Lizenz:** MIT License  
**Letzte Aktualisierung:** 06.03.2025
