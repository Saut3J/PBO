package com.mycompany.student;

public class Student {

    private String studentId;
    private String studentName;
    private double score1;
    private double score2;
    private double score3;

    public Student() {
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setScore1(double score1) {
        if (score1 >= 0 && score1 <= 100) {
            this.score1 = score1;
        } else {
            System.out.println("Nilai 1 harus antara 0 - 100");
        }
    }

    public void setScore2(double score2) {
        if (score2 >= 0 && score2 <= 100) {
            this.score2 = score2;
        } else {
            System.out.println("Nilai 2 harus antara 0 - 100");
        }
    }

    public void setScore3(double score3) {
        if (score3 >= 0 && score3 <= 100) {
            this.score3 = score3;
        } else {
            System.out.println("Nilai 3 harus antara 0 - 100");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public double calculateAverage() {
        return (score1 + score2 + score3) / 3;
    }
}
