/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeee;

import java.util.Scanner;

/**
 *
 * @author Acer-pc
 */
public class MainEmployeee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);
        int gajiPokok,a,id,tahunMasuk,jamMasuk,i = 0;
        String nama,istri,anak;
        boolean cekIstri, cekAnak, cek;
        System.out.println("+===============================+");
        System.out.println("|     PROGRAM GAJI PEGAWAI      |");
        System.out.println("+===============================+");
        System.out.println("|1. Manager                     |");
        System.out.println("|2. PNS                         |");
        System.out.println("|3. Honorer                     |");
        System.out.println("+===============================+");
        System.out.print("Masukan Pilihan Anda :");
        a = in.nextInt();
        
        System.out.println("");
        
        Employeee E = new Employeee();
        
        switch(a){
            case 1:
                //test case 1 manager
                System.out.print("Masukan Gaji Pokok     :");
                gajiPokok = in.nextInt();
                Manager M = new Manager(gajiPokok);
                    
                System.out.print("Masukan Nama           :");
                nama = inn.nextLine();
                System.out.print("Masukan ID Kerja       :");
                id = in.nextInt();
                System.out.print("Masukan Tahun Masuk    :");
                tahunMasuk = in.nextInt();
                System.out.print("Mempunyai Istri ?(y/n) :");
                istri = inn.nextLine();
                if(istri.equalsIgnoreCase("y"))
                    cekIstri = true;
                else
                    cekIstri = false;
                System.out.print("Mempunyai Anak  ?(y/n) :");
                anak = inn.nextLine();
                if(anak.equalsIgnoreCase("y"))
                    cekAnak = true;
                else
                    cekAnak = false;
                 
                M.setNama(nama);
                M.setIDKerja(id);
                M.setTahun(tahunMasuk);
                M.setJabatan("Manager");
                M.Bonus((2016-tahunMasuk));
                M.tunjanganLamaKerja((2016-tahunMasuk));
                M.tunjanganJabatan();
                M.tunjanganIstri(cekIstri);
                M.tunjanganAnak(cekAnak);
                System.out.println("=========================================");
                System.out.println("             IDENTITAS PEGAWAI           ");
                System.out.println("=========================================");
                M.display();
                System.out.println("=========================================");
                System.out.println("               RINCIAN GAJI              ");
                System.out.println("=========================================");
                M.totalGaji();
                System.out.println("=========================================");
            break;
            
            case 2 :
                //test case 10 PNS
                PegawaiTetap[] PNS = new PegawaiTetap[10];
                
                do{
                    System.out.print("Masukan Gaji Pokok     :");
                    gajiPokok = in.nextInt();
                    PNS[i] = new PegawaiTetap(gajiPokok);
                    
                    System.out.print("Masukan Nama           :");
                    nama = inn.nextLine();
                    System.out.print("Masukan ID Kerja       :");
                    id = in.nextInt();
                    System.out.print("Masukan Tahun Masuk    :");
                    tahunMasuk = in.nextInt();
                    System.out.print("Mempunyai Istri ?(y/n) :");
                    istri = inn.nextLine();
                    if(istri.equalsIgnoreCase("y"))
                        cekIstri = true;
                    else
                        cekIstri = false;
                    System.out.print("Mempunyai Anak  ?(y/n) :");
                    anak = inn.nextLine();
                    if(anak.equalsIgnoreCase("y"))
                        cekAnak = true;
                    else
                        cekAnak = false;
                    
                    PNS[i].setNama(nama);
                    PNS[i].setIDKerja(id);
                    PNS[i].setTahun(tahunMasuk);
                    PNS[i].setJabatan("PNS");
                    PNS[i].Bonus((2016-tahunMasuk));
                    PNS[i].tunjanganLamaKerja((2016-tahunMasuk));
                    PNS[i].tunjanganIstri(cekIstri);
                    PNS[i].tunjanganAnak(cekAnak);
                    System.out.println("=========================================");
                    System.out.println("             IDENTITAS PEGAWAI           ");
                    System.out.println("=========================================");
                    PNS[i].display();
                    System.out.println("=========================================");
                    System.out.println("               RINCIAN GAJI              ");
                    System.out.println("=========================================");
                    PNS[i].totalGaji();
                    System.out.println("=========================================\n");
                    
                    i++;
                }while(i != 10);
            break;
            
            case 3 :
                //test case 5 Honorer
                PegawaiTidakTetap[] H = new PegawaiTidakTetap[5];
                
                do{
          
                    H[i] = new PegawaiTidakTetap();
                    
                    System.out.print("Masukan Nama            :");
                    nama = inn.nextLine();
                    System.out.print("Masukan ID Kerja        :");
                    id = in.nextInt();
                    System.out.print("Masukan Tahun Masuk     :");
                    tahunMasuk = in.nextInt();
                    System.out.print("Masukan Total Jam Masuk :");
                    jamMasuk = in.nextInt();
                    
                    H[i].setNama(nama);
                    H[i].setIDKerja(id);
                    H[i].setTahun(tahunMasuk);
                    H[i].setJabatan("Honorer");
                    H[i].gajiLembur(jamMasuk);
                    System.out.println("=========================================");
                    System.out.println("             IDENTITAS PEGAWAI           ");
                    System.out.println("=========================================");
                    H[i].display();
                    System.out.println("=========================================");
                    System.out.println("               RINCIAN GAJI              ");
                    System.out.println("=========================================");
                    H[i].totalGaji();
                    System.out.println("=========================================\n");
                    
                    i++;
                }while(i != 5);
            break;
        }
    
    }
    
}
