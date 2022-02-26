package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gaji;
        String kode, nama, jenis, jabatan;
        ArrayList<Employee> Arr = new ArrayList<Employee>();
        Employee E = new Employee();

        int choice = 0;
        do {
            System.out.println("1. Insert Data Karyawan");
            System.out.println("2. View Data Karyawan");
            System.out.println("3. Update Data Karyawan");
            System.out.println("4. Delete Data Karyawan");
            System.out.println("0. Exit");
            System.out.println("Masukkan pilihan: ");
            choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.println("Kode Karyawan: ");
                kode = scan.nextLine();
                System.out.println("Nama Karyawan: ");
                nama = scan.nextLine();
                System.out.println("Jenis Kelamin: ");
                jenis = scan.nextLine();
                System.out.println("Jabatan: ");
                jabatan = scan.nextLine();
                System.out.println("Gaji Karyawan: ");
                gaji = scan.nextInt();
                Employee input = new Employee(kode, nama, jenis, jabatan, gaji);
                input.kode = kode;
                input.nama = nama;
                input.jenis = jenis;
                input.jabatan = jabatan;
                input.gaji = gaji;
                Arr.add(input);
            } else if (choice == 2) {
                for (Employee i : Arr) {
                    i.printarr();
                }
            } else if (choice == 3) {
                
            	System.out.println("Kode Karyawan: ");
            	kode = scan.nextLine();
                System.out.println("Nama Karyawan: ");
                nama = scan.nextLine();
                System.out.println("Jenis Kelamin: ");
                jenis = scan.nextLine();
                System.out.println("Jabatan: ");
                jabatan = scan.nextLine();
                System.out.println("Gaji Karyawan: ");
                gaji = scan.nextInt();
                Employee input = new Employee(kode, nama, jenis, jabatan, gaji);
                input.kode = kode;
                input.nama = nama;
                input.jenis = jenis;
                input.jabatan = jabatan;
                input.gaji = gaji;
                

            } else if (choice == 4) {
                
            }


        } while (choice != 0);

    }
}