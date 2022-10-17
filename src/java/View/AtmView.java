/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.AtmModel;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.bean.ManagedBean;

@ManagedBean(name = "Panggil") 
@RequestScoped 

public class AtmView {
    private AtmModel model;
    private String responSetor;
    private String responTarik;
    private int w;
    
    public AtmView() {
        model = new AtmModel();
    }

    public String getResponSetor() {
        if(model.cekTransaksi(w)==1){
            model.tambahSaldo(w);
            return "Setor tunai anda berhasil";
        } else{
            return ("Setor tunai harus kelipatan 50000!");
        }
    } 

    public String getResponTarik() {
                
        if((model.getSaldo()> w) && (model.cekTransaksi(w) == 1)){
            model.tarikSaldo(w);
            return "Tarik tunai anda berhasil";
        } else if((model.getSaldo()- w)< model.limitSaldo()){
            return "Jumlah Penarikan melebihi limit penarikan";
        } else if(model.cekBatasSaldo()){
            return "Saldo Anda Mencapai Limit";
        } else{
            return  "Tarik tunai harus kelipatan 50000!";
        }  
        
    
    }  
    
    public int cekSaldo(){
        return model.getSaldo();
    }

    public int getJumlah() {
        return w;
    }

    public void setJumlah(int jumlah) {
        this.w= jumlah;
    }
   
}     