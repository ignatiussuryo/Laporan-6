/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeee;

/**
 *
 * @author Acer-pc
 */
public class Manager extends Employeee {
    private double bonus, tunjanganJabatan, tunjanganLamaKerja, tunjanganIstri, tunjanganAnak;
    
    public Manager(int gaji){
        super(gaji);
    }
    public double Bonus(int lamaKerja){
        if(lamaKerja < 5){
            bonus = 0;
        }
            
        else if(lamaKerja > 5 && lamaKerja < 11){
            bonus = 0.05 * lamaKerja * getGajiPokok();
        }
            
        else{
            bonus = 0.1 * lamaKerja * getGajiPokok();
        }
        return bonus; 
    }
    
    public double tunjanganLamaKerja(int lamaKerja){
        if(lamaKerja > 10)
            tunjanganLamaKerja = 0.1 * lamaKerja * getGajiPokok();
        else
            tunjanganLamaKerja = 0;
        
        return tunjanganLamaKerja;
    }
    
    public double tunjanganJabatan(){
        tunjanganJabatan = 0.1 * (getGajiPokok()+bonus+tunjanganLamaKerja);
       
        return tunjanganJabatan;     
    }
    
    public double tunjanganIstri(boolean cek){
        if(cek == true)
            tunjanganIstri = 0.1 * (getGajiPokok()+bonus+tunjanganLamaKerja);
        else
            tunjanganIstri = 0;
        
        return tunjanganIstri;     
    }
    
    public double tunjanganAnak (boolean cek){
        if(cek == true)
            tunjanganAnak = 0.15 * (getGajiPokok()+bonus+tunjanganLamaKerja);
        else
            tunjanganAnak = 0;
        
        return tunjanganAnak; 
    }
    
     public void totalGaji(){
        System.out.println("Gaji Pokok           :Rp"+getGajiPokok());
        System.out.println("Bonus Lama Kerja     :Rp"+bonus);
        System.out.println("Tunjangan Jabatan    :Rp"+tunjanganJabatan);
        System.out.println("Tunjangan Lama Kerja :Rp"+tunjanganLamaKerja);
        System.out.println("Tunjangan Istri      :Rp"+tunjanganIstri);
        System.out.println("Tunjangan Anak       :Rp"+tunjanganAnak);
        System.out.println("=========================================");
        System.out.println("TOTAL GAJI           :Rp"+(getGajiPokok()+bonus+tunjanganJabatan+tunjanganLamaKerja+tunjanganIstri+tunjanganAnak));
    }
    
}
