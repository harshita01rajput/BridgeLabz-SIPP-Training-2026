import java.util.*;

public class SmartAttendanceTracker {

    static HashMap<String, HashSet<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new HashSet<>());

        if (attendance.get(subject).add(student)) {
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " already marked present in " + subject);
        }
    }

    public static void displayAttendance() {

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject: " + subject);

            for (String student : attendance.get(subject)) {
                System.out.println(student);
            }

            System.out.println("Total Students Present: " 
                    + attendance.get(subject).size());
        }
    }

    public static void searchStudent(String subject, String student) {

        if (attendance.containsKey(subject) &&
                attendance.get(subject).contains(student)) {

            System.out.println(student + " is present in " + subject);

        } else {
            System.out.println(student + " is absent in " + subject);
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Harshita");
        markAttendance("Java", "Amit");
        markAttendance("Java", "Harshita");

        markAttendance("SQL", "Riya");
        markAttendance("SQL", "Amit");

        System.out.println("\nAttendance Record:");
        displayAttendance();

        System.out.println("\nSearch Attendance:");
        searchStudent("Java", "Harshita");
        searchStudent("SQL", "Neha");
    }
}