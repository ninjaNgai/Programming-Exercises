import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private int id;
    private String name;
    private double cgpa;

    // Constructor
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        // Create a Priority Queue with a custom Comparator
        PriorityQueue<Student> studentQueue = new PriorityQueue<Student>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // sort GPA (descending) first
                int cgpaDifference = Double.compare(s2.getCGPA(), s1.getCGPA());
                if (cgpaDifference != 0)
                    return cgpaDifference;

                // sort alphabetically on names second
                int nameDifference = (s1.getName()).compareTo(s2.getName());
                if (nameDifference != 0)
                    return nameDifference;

                // sort on IDs (ascending) last
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        for (String event : events) {
            String[] tokens = event.split(" ");

            if (tokens[0].equals("ENTER")) {
                Student student = new Student(Integer.parseInt(tokens[3]), // id
                        tokens[1], // name
                        Double.parseDouble(tokens[2])); // cgpa)
                studentQueue.add(student);
            } else if (tokens[0].equals("SERVED")) {
                studentQueue.poll();
            }
        }

        /* Build a list of students still in the queue, in priority order */
        List<Student> studentsInPriorityOrder = new ArrayList<>();

        while (studentQueue.size() > 0) {
            studentsInPriorityOrder.add(studentQueue.poll());
        }

        return studentsInPriorityOrder;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}