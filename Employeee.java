
package employeee;

/**
 *
 * @author Acer-pc
 */
public class Employeee {
    private String nama;
    private int idKerja;
    private String jabatanEmployee;
    private int tahunMasuk;
    private final double GajiPokok;
    
    public Employeee(){
        GajiPokok = 1000000;
    }
    
    public Employeee(double gp){
        GajiPokok = gp;
    }
    
    public void setNama(String n){
        nama = n;
    }
    
    public void setIDKerja(int id){
        idKerja = id;
    }
    
    public void setJabatan(String j){
        jabatanEmployee = j;
    }
    
    public void setTahun(int y){
        tahunMasuk = y;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getIDKerja(){
        return idKerja;
    }
    
    public String getJabatanEmployee(){
        return jabatanEmployee;
    }
    
    public int getTahunMasuk(){
        return tahunMasuk;
    }
    
    public double getGajiPokok(){
        return GajiPokok;
    }
    
    public void display(){
        System.out.println("Nama        :"+nama);
        System.out.println("ID Kerja    :"+idKerja);
        System.out.println("Jabatan     :"+jabatanEmployee);
        System.out.println("Tahun Masuk :"+tahunMasuk);
    }
    
     
}

