
package employeee;

/**
 *
 * @author Acer-pc
 */
public class PegawaiTidakTetap extends Employeee{
    
    private int gajiLembur;
    
    public PegawaiTidakTetap(){
        
    }
    
    public double gajiLembur(int jamKerja){
        if(jamKerja > 10)
            gajiLembur = (jamKerja - 10)* 10000;
        else
            gajiLembur = 0;
        
        return gajiLembur;
    }
    
     public void totalGaji(){
        System.out.println("Gaji Pokok           :Rp"+getGajiPokok());
        System.out.println("Bonus Lembur         :Rp"+gajiLembur);
        System.out.println("=========================================");
        System.out.println("TOTAL GAJI           :Rp"+(getGajiPokok()+gajiLembur));
    }
    
    
    
    
}
