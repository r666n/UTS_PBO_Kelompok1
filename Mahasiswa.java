/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rendra Adnan Farid
 * NIM = 25104410036
 * Kelas = Informatika B
 * 
 */
public class Mahasiswa {
    // deklarasi variable private dengan encapsulation field
    private String nim;
    private String nama;
    private String jurusan;
    private int semester;
    private double ipk;

    // constructor default
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.jurusan = "";
        this.semester = 0;
        this.ipk = 0.0;
    }
    
    // constructor dengan 2 parameter
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = "";
        this.semester = 0;
        this.ipk = 0.0;
    }
    
    // constructor dengan 4 parameter
    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }
    // method tampil data
    void tampilData() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Semester : " + semester);
        System.out.println("IPK : " + ipk);
    }
    // method tampil data dengan header
    void tampilData (boolean denganHeader) {
        if (denganHeader == true) {
            System.out.println("===Data Mahasiswa===");
            tampilData();
        }
    }
    // method lulus (ipk >= 3.0 dan semester == 8)
    boolean isLulus() {
        return this.ipk >= 3.0 && this.semester == 8;
    }
    // method naik semester
    void naikSemester() {
        if (semester < 8) {
            semester++;
        }
    }
    // getter and setter semua atribut dan mencentang encapsulation field
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
}
