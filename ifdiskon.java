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
public class ifdiskon {
    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        // proses
        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan >= 20000) {
                diskon = 2000;
            } else if (belanjaan > 70000) {
                diskon = 31500;
            } else {
                diskon = 0;
            }

        } else {
            if (belanjaan > 1) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }

        
        bayar = belanjaan - diskon;
        System.out.println("Total Bayar: Rp " + bayar);
            }
    }
        
    