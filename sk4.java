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
public class sk4 {
static int hitung(int asal, int tujuan, int gol){
        int tarif = 0;
        if(asal == 1 && tujuan == 2){ // Dupak - Waru
            if(gol ==  1){
                tarif = 5000;
            }
            else if(gol == 2 || gol == 3){
                tarif = 8500;
            }
        }
        else if(asal == 2 && tujuan == 3){ // Waru - Sidoarjo
            if(gol ==  1){
                tarif = 6000;
            }
            else if(gol == 2 || gol == 3){
                tarif = 9000;
            }
        }
        else if(asal == 2 && tujuan == 4){ // Waru-Porong
            if(gol ==  1){
                tarif = 9000;
            }
            else if(gol == 2 || gol == 3){
                tarif = 14000;
            }
        }
        else if(asal == 3 && tujuan == 2){ //Sidoarjo-Waru
            if(gol ==  1){
                tarif = 6000;
            }
            else if(gol == 2 || gol == 3){
                tarif = 9000;
            }
        }
        else if(asal == 3 && tujuan == 4){ // Sidoarjo-Porong
            if(gol ==  1){
                tarif = 5500;
            }
            else if(gol == 2 || gol == 3){
                tarif = 8500;
            }
        }
        else if(asal == 4 && tujuan == 2){ // Porong-Sidoarjo
            if(gol ==  1){
                tarif = 5500;
            }
            else if(gol == 2 || gol == 3){
                tarif = 8500;
            }
        }
        else if(asal == 4 && tujuan == 2){// Porong-Waru
             if(gol ==  1){
                tarif = 9000;
            }
            else if(gol == 4 || gol == 2){
                tarif = 14000;
            }
        }
        else if(asal == 4 && tujuan == 5){// Porong-Kejapanan
             if(gol ==  1){
                tarif = 6000;
            }
            else if(gol == 4 || gol == 2){
                tarif = 8500;
            }
        }
        else if(asal == 4 && tujuan == 5){// Kejapanan-Gempol
             if(gol ==  1){
                tarif = 6000;
            }
            else if(gol == 4 || gol == 2){
                tarif = 8500;
            }
        }
        else{
            tarif = 0;
        }
        return tarif;
    }
        
    
    public static void main(String[] args) {
        int kodeDaerah[] = {1, 2, 3, 4, 5, 6};
        String namaDaerah[] = {"Dupak" , "Waru" , "Sidoarjo" , "Porong" , "Kejapanan" , "Gempol"};
        
        System.out.println("Inputkan kode daerah asal: (1-6)");
        System.out.println("Kode 1: Dupak");
        System.out.println("Kode 2: Waru");
        System.out.println("Kode 3: Sidoarjo");
        System.out.println("Kode 4: Porong");
        System.out.println("Kode 5: Kejapanan");
        System.out.println("Kode 6: Gempol");
        Scanner asal = new Scanner(System.in);
        String as = asal.nextLine();
        int asalIn = Integer.valueOf(as);
        System.out.println("Inputkan kode daerah tujuan: ");
        Scanner tujuan = new Scanner(System.in);
        String tu = tujuan.nextLine();
        int tujuanIn = Integer.valueOf(tu);
        System.out.println("Inputkan kode daerah asal: (1-3)");
        System.out.println("Golongan 1: Sedan, Jip, Pick Up");
        System.out.println("Golongan 2: Truk dengan 2 sumbu roda");
        System.out.println("Golongan 3: Truk dengan 3 sumbu roda");
        Scanner golongan = new Scanner(System.in);
        String gol = golongan.nextLine();
        int golonganIn = Integer.valueOf(gol);
        
        System.out.println("Daerah Asal: " + namaDaerah[asalIn-1]);
        System.out.println("Daerah Tujuan: " + namaDaerah[tujuanIn-1]);
        System.out.println("Golongan Kendaraan: " + golonganIn);
        int total = hitung(asalIn, tujuanIn, golonganIn);
        if(total ==0) {
            System.out.println("Tarif Tol: Tidak ada ruas jalan tsb");
        }
        else {
            System.out.println("Tarif Tol: " + total);
        }
        
        
    }
    
}    

