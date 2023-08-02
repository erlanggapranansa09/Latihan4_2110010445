
package penilaian;


public class NilaiAkhir extends Mahasiswa {
     int uts, uas, tugas;
   
    public NilaiAkhir(String npm, String nama, int uts, int uas, int tugas){
        super(npm, nama);
        this.uts = uts;
        this.uas = uas;
        this.tugas =tugas;
    }
    
    public int getUts(){
        return uts;
    }
    
    public void setUts(int Uts){
        this.uts = uts;
    }
    
    public int getUas(){
        return uas;
    }
    
    public void setUas(int Uas){
        this.uas = uas;
    }
    
    public int getTugas(){
        return tugas;
    }
    
    public void setTugas(int Tugas){
        this.tugas = tugas;
    }
    
    public float hitungNilaiAkhir(){


        return (uts*30/100)+(uas*30/100)+(tugas*40/100);
    }
    
    
     
    
}
