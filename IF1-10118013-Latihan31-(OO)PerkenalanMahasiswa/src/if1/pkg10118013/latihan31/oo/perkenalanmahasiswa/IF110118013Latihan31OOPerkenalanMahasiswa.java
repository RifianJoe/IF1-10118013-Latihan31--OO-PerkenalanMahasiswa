/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan31.oo.perkenalanmahasiswa;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menampilkan Nama dan Nim Mahasiswa
 */
public class IF110118013Latihan31OOPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nim = "10110269";
        mahasiswa.nama = "Rizki Adam Kurniawan";
        mahasiswa.perkenalanDiri();
        
        mahasiswa.nim = "10110270";
        mahasiswa.nama= "Indra Tiola";
        mahasiswa.perkenalanDiri();
        
        mahasiswa.nim = "10110271";
        mahasiswa.nama= "Robi Tansil Ganefi";
        mahasiswa.perkenalanDiri();
        
        mahasiswa.nim = "10110269";
        mahasiswa.nama= "Muhammad Nur Awaludin";
        mahasiswa.perkenalanDiri();
                
    }
    
}
