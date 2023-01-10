package Abstraction;

import entity.entity_kendaraan;

import java.util.ArrayList;

public interface interface_kendaraan {
    ArrayList<entity_kendaraan> read();
    boolean cari(int stnk,int i, entity_kendaraan kendaraan);
}
