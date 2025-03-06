package org.example;

// Schlechtes Beispiel (Verstoß gegen DRY)
class BadExample {
    // Benutzerinformationen
    public void printUserInfo(String name, int age, String email, String address) {
        System.out.println("=== Benutzerinformationen ===");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("E-Mail: " + email);
        System.out.println("Adresse: " + address);
        System.out.println("Hinweis: Nutzer hat keinen speziellen Status.");
        System.out.println("---------------------------------------------");
    }

    // Mitarbeiterinformationen
    public void printEmployeeInfo(String name, int age, String email,
            String department, double salary, String address) {
        System.out.println("=== Mitarbeiterinformationen ===");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("E-Mail: " + email);
        System.out.println("Abteilung: " + department);
        System.out.println("Gehalt: " + salary);
        System.out.println("Adresse: " + address);
        // Wiederholte Logik (wieder der gleiche Hinweis)
        System.out.println("Hinweis: Nutzer hat keinen speziellen Status.");
        System.out.println("---------------------------------------------");
    }

    // Projektinformationen
    public void printProjectInfo(String projectName, double budget, int teamSize,
            String projectManager, String deadline) {
        System.out.println("=== Projektinformationen ===");
        System.out.println("Projektname: " + projectName);
        System.out.println("Budget: " + budget);
        System.out.println("Teamgröße: " + teamSize);
        System.out.println("Projektleiter: " + projectManager);
        System.out.println("Deadline: " + deadline);
        // Wiederholte Logik
        System.out.println("Hinweis: Projektstatus unbekannt.");
        System.out.println("---------------------------------------------");
    }

    // Meetinginformationen
    public void printMeetingInfo(String title, String date, String time,
            String location, String[] participants) {
        System.out.println("=== Meetinginformationen ===");
        System.out.println("Titel: " + title);
        System.out.println("Datum: " + date);
        System.out.println("Uhrzeit: " + time);
        System.out.println("Ort: " + location);
        System.out.print("Teilnehmer: ");
        for (String participant : participants) {
            System.out.print(participant + ", ");
        }
        System.out.println();
        // Wiederholte Logik
        System.out.println("Hinweis: Tagesordnung nicht definiert.");
        System.out.println("---------------------------------------------");
    }
}