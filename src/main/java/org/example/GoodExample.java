package org.example;

// Gutes Beispiel (DRY-konform)
class GoodExample {
    private void printPersonInfo(String title, String name, int age, String email) {
        System.out.println("=== " + title + " ===");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("E-Mail: " + email);
    }

    public void printUserInfo(String name, int age, String email) {
        printPersonInfo("Benutzerinformationen", name, age, email);
    }

    public void printEmployeeInfo(String name, int age, String email, String department, double salary) {
        printPersonInfo("Mitarbeiterinformationen", name, age, email);
        System.out.println("Abteilung: " + department);
        System.out.println("Gehalt: " + salary);
    }
}
