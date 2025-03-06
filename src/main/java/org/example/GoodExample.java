package org.example;

// Gutes Beispiel (DRY-konform)
class GoodExample {
    // Private Helper-Methode zur Ausgabe von generischen Infos
    private void printSectionHeader(String header) {
        System.out.println("=== " + header + " ===");
    }

    // Private Helper-Methode zur Ausgabe eines allgemeinen Hinweises
    private void printInfoFooter(String note) {
        System.out.println("Hinweis: " + note);
        System.out.println("---------------------------------------------");
    }

    // DRY: Reusable Methode zur Info-Ausgabe
    private void printBasicFields(String... fields) {
        for (String f : fields) {
            System.out.println(f);
        }
    }

    public void printUserInfo(String name, int age, String email, String address) {
        printSectionHeader("Benutzerinformationen");
        printBasicFields(
                "Name: " + name,
                "Alter: " + age,
                "E-Mail: " + email,
                "Adresse: " + address);
        printInfoFooter("Nutzer hat keinen speziellen Status.");
    }

    public void printEmployeeInfo(String name, int age, String email,
            String department, double salary, String address) {
        printSectionHeader("Mitarbeiterinformationen");
        printBasicFields(
                "Name: " + name,
                "Alter: " + age,
                "E-Mail: " + email,
                "Abteilung: " + department,
                "Gehalt: " + salary,
                "Adresse: " + address);
        printInfoFooter("Nutzer hat keinen speziellen Status.");
    }

    public void printProjectInfo(String projectName, double budget, int teamSize,
            String projectManager, String deadline) {
        printSectionHeader("Projektinformationen");
        printBasicFields(
                "Projektname: " + projectName,
                "Budget: " + budget,
                "Teamgröße: " + teamSize,
                "Projektleiter: " + projectManager,
                "Deadline: " + deadline);
        printInfoFooter("Projektstatus noch in Planung.");
    }

    public void printMeetingInfo(String title, String date, String time,
            String location, String[] participants) {
        printSectionHeader("Meetinginformationen");
        System.out.println("Titel: " + title);
        System.out.println("Datum: " + date);
        System.out.println("Uhrzeit: " + time);
        System.out.println("Ort: " + location);
        System.out.print("Teilnehmer: ");
        for (String participant : participants) {
            System.out.print(participant + ", ");
        }
        System.out.println();
        printInfoFooter("Tagesordnung wird vorbereitet.");
    }
}