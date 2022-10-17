/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author Pribadi
 */
public class InisialisasiSaldo {

    private int saldoAwal = 500000; 
    public int batasSaldo = 100000;
    
    
    private static InisialisasiSaldo instance = new InisialisasiSaldo();
    
    public static InisialisasiSaldo getInstance(){   
        return instance;
    } 
    
    public int getSaldoAwal(){
        return saldoAwal; 
    }
    
    public void setSaldoAwal(int saldoAwal){
        this.saldoAwal = saldoAwal;
    }
}    
