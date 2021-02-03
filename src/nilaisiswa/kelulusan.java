/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

/**
 *
 * @author Yuliana
 */
public class kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat object
        siswa pelajar = new siswa();
        
        //pengisian atribut
        pelajar.nama = "Anya";
        pelajar.nilai = 80;
        
        //menjalankan method
        pelajar.cetaknilai();
        
        //menentukan lulus
        if(pelajar.lulus()){
            System.out.println("Selamat anda lulus");
        }else if (pelajar.tidaklulus()){
            System.out.println("Anda harus belajar lebih giat lagi");
        }
    }
    
}
