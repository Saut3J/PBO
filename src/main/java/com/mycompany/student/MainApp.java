package com.mycompany.student;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM NILAI MAHASISWA ===");

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM Mahasiswa: ");
        String id = input.nextLine();

        Student student = new Student(id, nama);

        System.out.print("Masukkan Nilai 1: ");
        double n1 = input.nextDouble();
        student.setScore1(n1);

        System.out.print("Masukkan Nilai 2: ");
        double n2 = input.nextDouble();
        student.setScore2(n2);

        System.out.print("Masukkan Nilai 3: ");
        double n3 = input.nextDouble();
        student.setScore3(n3);

        GradeService service = new GradeService();
        service.printResult(student);
    }
}
