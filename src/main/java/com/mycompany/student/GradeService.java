package com.mycompany.student;

public class GradeService {
    public void printResult(Student s) {

        System.out.println("\n===== HASIL NILAI =====");
        System.out.println("Nama Mahasiswa : " + s.getStudentName());
        System.out.println("Rata-rata Nilai: " + s.calculateAverage());

    }
}
