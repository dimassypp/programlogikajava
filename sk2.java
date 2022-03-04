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
public class sk2 {
       public static void main(String[] args) {
        // TODO code application logic here
        int id [] ={1, 2, 3, 4, 5};
        String nama [] = {"Galuh", "Indro", "Jedi", "Kanu"};
        int golongan [] = {1, 3, 2, 3};
        int admin = 13000;
        int tarifGolongan = 0;
        int jumlahTagihan;
        String ketGol = null;
        
        String [] alamat = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        Scanner a = new Scanner(System.in);
        
        System.out.print("Masukkan id Pelanggan : ");
        String inId = a.nextLine();
        int Idin = Integer.valueOf(inId);
        
        System.out.print("Banyak pemakaian listrik : ");
        int pemakaian = a.nextInt();
        
        switch(golongan[Idin - 1]){
            case 1:
                ketGol = "450 VA";
                tarifGolongan = 1000;
            break;
            case 2:
                ketGol = "1300 VA";
                tarifGolongan = 1300;
            break;
            case 3:
                ketGol = "2200 VA";
                tarifGolongan = 1500;
         }
        
            jumlahTagihan = (pemakaian * tarifGolongan) + admin;
            if(jumlahTagihan < 50000){
                jumlahTagihan = 50000;
            }
            
            System.out.println("Print Out Tagihan Listrik");
            System.out.println("ID Pelanggan : " + inId);
            System.out.println("Nama Pelanggan : " + nama[Idin - 1]);
            System.out.println("Tarif Golongan Per kWh : Rp" + tarifGolongan +",-");
            System.out.println("Jumlah Tagihan : Rp" + jumlahTagihan + ",-");
            System.out.println("Alamat : " + alamat[Idin -1]);
            System.out.println("Keterangan Golongan : " + ketGol );
        
        
    }
}
