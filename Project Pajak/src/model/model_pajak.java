package model;

import entity.entity_kendaraan;
import entity.entity_pajak;

import java.util.ArrayList;

public class model_pajak {
    private ArrayList<entity_pajak> data_pajak;

    public model_pajak(){
        data_pajak = new ArrayList<entity_pajak>();
    }

    public void create(entity_pajak pajak){

        this.data_pajak.add(pajak);
    }

    public ArrayList<entity_pajak> read(){

        return data_pajak;
    }

    public void hapuspajak(int idpajak){
        this.data_pajak.remove(idpajak);
    }

    public void editpajak(int idpajak,entity_pajak pajak){
        this.data_pajak.add(idpajak,pajak);
    }

}
