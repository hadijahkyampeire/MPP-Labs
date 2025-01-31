package inclassPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Address add1 = new Address("500 E Broadway Ave", "Fairfield", "IA", 52556);
        Address add2 = new Address("103 W Adams Ave", "Fairfield", "IA", 52556);

        Section cs545_1 = new Section(900, "CS545");
        Section cs545_2 = new Section(901, "CS545");
        Section cs401 = new Section(902, "CS401");
        Section cs221 = new Section(903, "CS221");

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(111, "Yasmeen", new ArrayList<>(Arrays.asList(3.9, 4.0, 3.7)), add1,
                        new ArrayList<>(Arrays.asList(cs545_1, cs401))),
                new Student(112, "Mira", new ArrayList<>(Arrays.asList(4.0, 4.0, 3.9)), add1,
                        new ArrayList<>(Arrays.asList(cs545_2, cs401, cs221))),
                new Student(113, "Zaina", new ArrayList<>(Arrays.asList(3.6, 3.3, 3.7)), add1,
                        new ArrayList<>(Arrays.asList(cs221, cs401))),
                new Student(114, "Khaled", new ArrayList<>(Arrays.asList(3.0, 2.8, 3.1)), add2)
        ));

        // Test 1
        System.out.println(studentsInCourse(students, "CS545"));
        // Test 2
        System.out.println(studentAddress(students, "CS401"));
        }
        // Find all the students that are taking a given course
        public static List<Student> studentsInCourse(List<Student> studentsList, String course) {
            return studentsList.stream()
                    .filter(student -> hasCourse(student.getSections(), course))
                    .collect(Collectors.toList());
        }

        public static boolean hasCourse(List<Section> sections, String course) {
            return Optional.ofNullable(sections).orElse(Collections.emptyList())
                    .stream()
                    .anyMatch(s -> s.getCourseCode().equals(course));
        }

        // Get the address of any student that is taking a given course (e.g., "CS401")
        public static Address studentAddress(List<Student> students, String course) {
            return students.stream().filter(s -> hasCourse(s.getSections(), course))
                    .map(student -> student.getAddress()).toList().get(0);
        }

        // Calculate the GPA for a given student

        // Find the student with the highest GPA

        // Get a list of all unique courses taken by students

        // Find all students who live in a given city (e.g., "Fairfield") sorted in alphabetical order

        // Count the number of students enrolled in a specific course (e.g., "CS401")

        // Get a list of students in a specific section

        //  Get the names of students who have enrolled in more than a given number of courses (e.g., more than 2 courses)

        // Get a list of unique course names taken by students who live in a given city (e.g., "Fairfield")

        // Get a list of distinct addresses of students who are taking a specific course (e.g., "CS401")

        // Get a mapping of students' names to the list of courses they are taking

}
