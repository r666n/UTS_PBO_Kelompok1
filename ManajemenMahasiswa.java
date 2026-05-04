
import java.util.Scanner;
import org.w3c.dom.css.Counter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @ketua Rendra Adnan Farid (25104410036)
 * @anggota M. Rizki Desca Firmansyah (25104410041), Ema Netasari(25104410052), Gladis Ayu Diapitaloka(25104410073)
 * Kelas = Informatika B
 * 
 */
public class ManajemenMahasiswa {
    public static void main(String[] args) {
        //array of objek yang menampung mahasiswa sebanyak 10
        Mahasiswa[] daftarMhs = new Mahasiswa[10];
        // penghitung supaya user tidak melebihi 10 
        int counter = 0, pilihan;
        // input user
        Scanner sc = new Scanner(System.in);
        // untuk mengecek apakah tanda berhasil ditemukan atau tidak
        boolean lapor = false;
        
        // bagian menu
        do {            
            System.out.println("==Menu Manajemen Mahasiswa==");
            System.out.println("1. Tambah Mahasiswa ");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Mahasiswa yang Lulus");
            System.out.println("5. Naikkan Semester Semua Mahasiswa");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = sc.nextInt();
            //supaya enter tidak menjalankan kode berikutnya
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    // menambah mahasiswa
                    System.out.println("\n==Tambah Mahasiswa==");
                    
                    if (counter >= 10) {
                        System.out.println("- Maaf data sudah mencapai limit (Maks 10), tidak bisa input lagi");
                    } else {
                        //input data mahasiswa dengan memanggil setter (encapsulasi)
                        System.out.print("Masukkan NIM : ");
                        String setNim = sc.nextLine();
                    
                        if (setNim.isEmpty()) {
                            System.out.println("invalid");
                        } else {
                            System.out.print("Masukkan nama : ");
                            String setNama = sc.nextLine();
                        
                            System.out.print("Masukkan jurusan : ");
                            String setJurusan = sc.nextLine();
                        
                            System.out.print("Masukkan semester : ");
                            int setSemester = sc.nextInt();
                            sc.nextLine();
                        
                        if (setSemester < 0 || setSemester > 8) {
                            System.out.println("Invalid");
                        } else {
                            System.out.print("Masukkan IPK : ");
                            double setIPK = sc.nextDouble();
                            sc.nextLine();
                            
                            if (setIPK < 0.0 || setIPK > 4.0) {
                                System.out.println("invalid");
                            } else {
                                // objek baru dan disimpan ke array, membuat fungsi counter, memanggil constructor overloading
                                daftarMhs[counter] = new Mahasiswa(setNim, setNama, setJurusan, setSemester, setIPK);
                                counter++;
                                System.out.println("- Data mahasiswa berhasil ditambahkan\n");
                            }
                        }
                    }
                }
                    break;
                case 2:
                    // menampilkan data seluruh mahasiswa
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        //lihat data mahasiswa dengan for loop
                    for (Mahasiswa lihatMhs : daftarMhs) {
                        // Validasi agar tidak error NullPointerException
                        if (lihatMhs !=null) {
                            System.out.println("");
                            lihatMhs.tampilData();
                            System.out.println("");
                            lapor = true;
                        }
                    }   
                    if (!lapor) {
                            System.out.println("- Maaf data yang anda cari tidak ada\n");
                        }
                    }
                    break;
                case 3:
                    // mencari mahasiswa berdasarkan nim
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        System.out.println("\n==Cari Mahasiswa Berdasarkan NIM==");
                        System.out.print("Masukkan NIM : ");
                        String nimTemp = sc.nextLine();
                    
                            for (int i = 0; i < counter; i++) {
                                //encapsulasi : mengakses atribut nim melalui getNim
                                if (daftarMhs[i].getNim().equals(nimTemp)) {
                                daftarMhs[i].tampilData();
                                lapor = true;
                                System.out.println("");
                            } 
                        }
                        if (!lapor) {
                            System.out.println("- Maaf data yang anda cari tidak ada\n");
                        }
                    }
                    break;
                case 4:
                    // menampilkan mahasiswa lulus
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        for (int y = 0; y < counter; y++) {
                            //memanggil method lulus
                            if (daftarMhs[y].isLulus()) {
                                daftarMhs[y].tampilData();
                                lapor = true;
                            } 
                        }
                        if (!lapor) {
                            System.out.println("- Maaf data yang anda cari tidak ada\n");
                        }
                    }
                    break;    
                case 5:
                    // menaikkan semester semua mahasiswa
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        for (int j = 0; j < counter; j++) {
                            // memanggil method getSemester
                            if (daftarMhs[j].getSemester() < 8) {
                                daftarMhs[j].naikSemester();
                                 System.out.println("\n- Semester semua mahasiswa berhasil dinaikkan\n");
                            }
                         }
                     }
                    break;    
                case 6:
                    //keluar
                    System.out.println("\nTerima kasih telah menggunakan program kami\n");
                    break;
                default:
                    throw new AssertionError();
            }
            // ulangi program dalam do selama input bukan 6
        } while (pilihan !=6);
    }
}
    
