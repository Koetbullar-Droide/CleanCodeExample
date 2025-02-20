package org.example;

// Schlechtes Beispiel (Verstoß gegen DRY)
class BadExample {
    public void printUserInfo(String name, int age, String email) {
        System.out.println("=== Benutzerinformationen ===");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("E-Mail: " + email);
    }

    public void printEmployeeInfo(String name, int age, String email, String department, double salary) {
        System.out.println("=== Mitarbeiterinformationen ===");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("E-Mail: " + email);
        System.out.println("Abteilung: " + department);
        System.out.println("Gehalt: " + salary);
    }
}