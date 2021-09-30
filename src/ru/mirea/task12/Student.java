package ru.mirea.task12;

public class Student implements Comparable<Student> {
    private final int studentId;
    private final String firstName;
    private final String lastName;
    private final double gpaScore;

    public Student(int studentId, String firstName, String lastName, double gpaScore) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpaScore = gpaScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpaScore() {
        return gpaScore;
    }

    @Override
    public String toString() {
        return "{" + this.studentId + " ," + this.gpaScore + "}";
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.studentId, student.studentId);
    }
}
