package model;

import allobject.modelAll;
import entity.entity_kendaraan;

import java.util.ArrayList;

public class model_kendaraan {
    private ArrayList<entity_kendaraan> data_kendaraan;

    public model_kendaraan() {
        data_kendaraan = new ArrayList<entity_kendaraan>();
    }

    public ArrayList<entity_kendaraan> read(){
        return data_kendaraan;
    }
    public void caridata(int nostnk, int i, entity_kendaraan kendaraan) {
        if (nostnk == modelAll.pajak.get(i).getId_pajak()) {
            data_kendaraan.add(i,kendaraan);
        }

    }
}
