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
public class array {
    static int hitung (int kwh){
        int bayar=0;
        int golongan = 0;
        int nilai = 0;
        
        if (golongan == 1){
            if{
                bayar=50000;
            }
            else{
                bayar = kwh*1000;
            }
        }
        if (golongan == 2){
            if(kwh <= 10){
                bayar=50000;
            }
            else{
                bayar = kwh*1300;
            }
        }
        if (golongan == 3){
            if(kwh <= 10){
                bayar=50000;
            }
            else{
                bayar = kwh*1500;
            }
        }
        return bayar;
    }
        
    
    public static void main(String[] args) {
        String[][] namaPelanggan = {{"Galuh","1"},{"Indro","3"},{"Jedi","2"},{"Galuh","3"}};
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan");
        String idIn = scan.nextLine();
        int iId=Integer.valueOf(idIn);
 
        System.out.println("Masukkan kwh");
        String tagihan = scan.nextLine();
        int iTagihan = Integer.valueOf(tagihan);
            
       
        
        if (iTagihan<10) {iTagihan=50000;}
        else {iTagihan=hitung(iTagihan);}

        iTagihan=iTagihan+13000;
        
        System.out.println("Print Out Tagihan");
        System.out.println("ID\t:" + idIn);
        System.out.println("Nama\t:" + namaPelanggan[iId-1]);
        System.out.println("Tagihan\t:Rp." + iTagihan+",-");
    }
}

