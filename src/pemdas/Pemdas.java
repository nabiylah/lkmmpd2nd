/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemdas;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Pemdas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("==============MENGHITUNG BERAT KOPER===============");
        
        double beratLaptop = 850.56;
        double beratBuku = 250.11;
        double beratJaket = 25.31;
        double beratHp = 200.00;
        
        System.out.print("input jumlah laptop : ");
        double laptop = scan.nextDouble();
         
        System.out.print("input jumlah buku : ");
        double buku = scan.nextDouble();
        
        System.out.print("input jumlah jaket : ");
        double jaket = scan.nextDouble();
        
        System.out.print("input jumlah hp : ");
        double hp = scan.nextDouble();
        
        if (buku <0 || laptop <0 || jaket <0 || hp <0) {
            System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
        }
        
        double totalLaptop = beratLaptop * laptop;
        double totalBuku = beratBuku * buku;
        double totalJaket = beratJaket * jaket;
        double totalHp = beratHp * hp;
        
        double beratKoper = totalLaptop+totalBuku+totalJaket+totalHp;
        
        int indeks;
        if ( beratKoper > 2000 ) {
            indeks= 5;
        } else if ( beratKoper >=1500 && beratKoper <=2000 ) {
            indeks= 4; 
        } else if ( beratKoper >=1000 && beratKoper <1500) {
            indeks= 3;
        } else if ( beratKoper >= 500 && beratKoper <1000 ) {
            indeks= 2;
        } else if ( beratKoper >0 && beratKoper <500 ) {
            indeks= 1;
        } else  { 
            indeks= 0;
        }
        
        if (indeks >= 1 && indeks <=5) {
            System.out.println("indeks = " + indeks);
        }
        
        if ( indeks >= 5 ) {
            System.out.println("Berat barang melebihi ketentuan");
        } else if ( indeks >= 1 && indeks < 5 ) {
            System.out.println("Bawaan barang tidak melebihi ketentuan, aman masbro");
        }
                
       }     
    }
    