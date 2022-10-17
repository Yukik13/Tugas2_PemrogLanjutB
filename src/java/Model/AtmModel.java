/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Dao.AtmDao;
/**
 *
 * @author Pribadi
 */
public class AtmModel implements AtmDao{

    InisialisasiSaldo saldo;
    
    public AtmModel(){
        this.saldo = InisialisasiSaldo.getInstance();
    }
    
    public int limitSaldo(){
        return this.saldo.batasSaldo;
    }
    
    @Override
    public int getSaldo() {
        return this.saldo.getSaldoAwal(); 
    }

    @Override
    public int cekTransaksi(int w) {
        if(w % 50000 == 0){
            return 1;
        } else {
            return 0; 
        }
    } 

    @Override
    public void tambahSaldo(int w) {
        saldo.setSaldoAwal(saldo.getSaldoAwal()+w);
    }

    @Override
    public void tarikSaldo(int w) {
        saldo.setSaldoAwal(saldo.getSaldoAwal()-w);
    }

    @Override
    public boolean cekBatasSaldo() {
        if(this.saldo.getSaldoAwal() <= this.saldo.batasSaldo){
            return true;
        } else {
            return false;
        }
    }
}    
   