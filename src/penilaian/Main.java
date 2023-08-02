
package penilaian;


public class Main {
     public static void main(String[] args) {
        NilaiAkhir nilai = new NilaiAkhir("2110010445", "Muhammad Erlangga Pranansa", 80,80,85);
      
         System.out.println("NPM:   " + nilai.getNpm());
         System.out.println("Nama:   " + nilai.getNama());
         System.out.println("Uts:   " + nilai.getUts());
         System.out.println("Uas:   " + nilai.getUas());
         System.out.println("Tugas:   " + nilai.getTugas());
        
         double NilaiAkhir = nilai.hitungNilaiAkhir();
         System.out.println("Nilai Akhir:  " + NilaiAkhir);    
     }
    
}
