import java.util.*;
import java.util.stream.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Complete the code
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator<Student> compareByGPA = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // sort GPA (descending) first
                int cgpaDifference = Double.compare(s2.getCgpa(), s1.getCgpa());
                if (cgpaDifference != 0)
                    return cgpaDifference;

                // sort alphabetically on names second
                int nameDifference = (s1.getFname()).compareTo(s2.getFname());
                if (nameDifference != 0)
                    return nameDifference;

                // sort on IDs (ascending) last
                return Integer.compare(s1.getId(), s2.getId());
            }
        };

        List<Student> studentList2 = studentList.stream().sorted(compareByGPA).collect(Collectors.toList());

        for (Student st : studentList2) {
            System.out.println(st.getFname());
        }
    }
}
