package com.company;

public class Employee {
    public int gaji;
    public String kode;
    public String nama;
    public String jenis;
    public String jabatan;

    public Employee() {
    }

    public Employee(String kode, String nama, String jenis, String jabatan, int gaji) {
        this.gaji = gaji;
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
        this.jabatan = jabatan;
    }

    public Employee(Employee E) {
        gaji = E.gaji;
        kode= E.kode;
        nama = E.nama;
        jenis = E.jenis;
        jabatan = E.jabatan;
    }

    public void printarr() {
        System.out.println("Kode Karyawan:" + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Karyawan: " + gaji);
        System.out.println("-------------------------------------------");

    }
    public void setGaji (String jabatan){
        if (jabatan.equals("Manager")){
        gaji = 8000000;
        }if (jabatan.equals("Supervisor"));
        gaji = 6000000;
        if (jabatan.equals("Manager"));
        gaji = 4000000; 
        }

    }