package controller;

import Abstraction.interface_kendaraan;
import allobject.modelAll;
import entity.entity_kendaraan;

import java.util.ArrayList;

public class controller_kendaraan implements interface_kendaraan{
    @Override
    public ArrayList<entity_kendaraan> read() {
        return modelAll.Databasekendaraan.read();
    }

    @Override
    public boolean cari(int stnk, int i, entity_kendaraan kendaraan) {
        modelAll.Databasekendaraan.caridata(stnk,i, kendaraan);
        return true;
    }

}
