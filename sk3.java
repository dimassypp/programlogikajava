/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DYPe
 */
import java.util.Scanner;
public class sk3 {
public static void main (String[]args){
    Scanner a = new Scanner(System.in);
       int gol []= {1, 2, 3, 4, 5};
       String keterangan [] = {"Sedan, Jip, Pick up", "Truk dengan sumbu 2 roda", "Truk dengan sumbu 3 roda", "Truk dengan sumbu 4 roda", "Truk dengan sumbu 5 roda"};
       String daerah = null;
       int tarif = 0;
       
       System.out.print("Inputkan ID Daerah Masuk - Keluar : ");
       int idDaerah = a.nextInt();
       
       System.out.print("Inputkan Golongan Kendaraan : ");
       int golongan = a.nextInt();
       
       if(idDaerah == 1){
           daerah = "Dupak - Waru";
           if(golongan == gol[0]){
               tarif = 5000;
           }else if(golongan == gol [1]){
               tarif = 8000;
           }else if(golongan == gol[2]){
               tarif = 8000;
           }else if(golongan == gol[3]){
               tarif = 10500;
           }else if(golongan == gol[4]){
               tarif = 10500;
           }
           
      }else if(idDaerah == 2){
          daerah = "Waru - Sidoarjo";
           if(golongan == gol[0]){
               tarif = 6000;
           }else if(golongan == gol [1]){
               tarif = 9000;
           }else if(golongan == gol[2]){
               tarif = 9000;
           }else if(golongan == gol[3]){
               tarif = 12000;
           }else if(golongan == gol[4]){
               tarif = 12000;
           }
           
      }else if(idDaerah == 3){
          daerah = "Waru - Porong";
           if(golongan == gol[0]){
               tarif = 9000;
           }else if(golongan == gol [1]){
               tarif = 14000;
           }else if(golongan == gol[2]){
               tarif = 14000;
           }else if(golongan == gol[3]){
               tarif = 18500;
           }else if(golongan == gol[4]){
               tarif = 18500;
           }
                  
      }else if(idDaerah == 4){
          daerah = "Sidoarjo - Waru";
           if(golongan == gol[0]){
               tarif = 6000;
           }else if(golongan == gol [1]){
               tarif = 9000;
           }else if(golongan == gol[2]){
               tarif = 9000;
           }else if(golongan == gol[3]){
               tarif = 12000;
           }else if(golongan == gol[4]){
               tarif = 12000;
           }
           
      }else if(idDaerah == 5){
          daerah = "Sidoarjo - Porong";
           if(golongan == gol[0]){
               tarif = 5500;
           }else if(golongan == gol [1]){
               tarif = 8500;
           }else if(golongan == gol[2]){
               tarif = 8500;
           }else if(golongan == gol[3]){
               tarif = 11500;
           }else if(golongan == gol[4]){
               tarif = 11500;
           }
           
      }else if(idDaerah == 6){
          daerah = "Porong - Sidoarjo";
           if(golongan == gol[0]){
               tarif = 5500;
           }else if(golongan == gol [1]){
               tarif = 8500;
           }else if(golongan == gol[2]){
               tarif = 8500;
           }else if(golongan == gol[3]){
               tarif = 11500;
           }else if(golongan == gol[4]){
               tarif = 11500;
           }
           
      }else if(idDaerah == 7){
          daerah = "Porong - Waru";
           if(golongan == gol[0]){
               tarif = 9000;
           }else if(golongan == gol [1]){
               tarif = 14000;
           }else if(golongan == gol[2]){
               tarif = 14000;
           }else if(golongan == gol[3]){
               tarif = 18500;
           }else if(golongan == gol[4]){
               tarif = 18500;
           }
           
      }else if(idDaerah == 8){
          daerah = "Porong - Kejapanan";
           if(golongan == gol[0]){
               tarif = 6000;
           }else if(golongan == gol [1]){
               tarif = 8500;
           }else if(golongan == gol[2]){
               tarif = 8500;
           }else if(golongan == gol[3]){
               tarif = 11500;
           }else if(golongan == gol[4]){
               tarif = 11500;
           }
           
      }else if(idDaerah == 9){
          daerah = "Kejapanan - Gempol";
           if(golongan == gol[0]){
               tarif = 3000;
           }else if(golongan == gol [1]){
               tarif = 5000;
           }else if(golongan == gol[2]){
               tarif = 5000;
           }else if(golongan == gol[3]){
               tarif = 6500;
           }else if(golongan == gol[4]){
               tarif = 6500;
           }
      }
       
        System.out.println("\n =============== Print Tagihan Tol ==================");
        System.out.println("ID Daerah Masuk - Keluar : " + idDaerah);
        System.out.println("Golongan Kendaraan : " + golongan);
        System.out.println("Keterangan Golongan Kendataan : " + keterangan[golongan-1]);
        System.out.println("Daerah Masuk - Keluar : " + daerah);
        System.out.println("Tarif tol : Rp" + tarif + ",-");
        
}
}