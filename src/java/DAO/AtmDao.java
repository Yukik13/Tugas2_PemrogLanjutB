/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author Pribadi
 */
public interface AtmDao {
    int getSaldo();
    
    int cekTransaksi(int w);
    
    void tambahSaldo(int w);
    
    void tarikSaldo(int w);
    
    boolean cekBatasSaldo(); 
}   
 
