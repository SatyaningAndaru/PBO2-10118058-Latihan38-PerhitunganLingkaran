/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210118058Latihan38PerhitunganLingkaran {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lingkaran bundar = new Lingkaran();
        System.out.println("=======Perhitungan Lingkaran=======");
        bundar.validasiInput();
        bundar.hasilPerhitungan(bundar.diameter); 
        System.out.println("Developed by Satyaning Andaru");
    }
    
}
