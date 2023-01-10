package controller;

import Abstraction.interface_samsat;
import allobject.modelAll;
import entity.entity_samsat;

import java.util.ArrayList;

public class controller_samsat implements interface_samsat {
    @Override
    public ArrayList<entity_samsat> read() {
        return modelAll.Databasesamsat.read();
    }

    @Override
    public boolean tambahsamsat(entity_samsat samsat) {
        try{
            modelAll.Databasesamsat.createsamsat(samsat);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean cekLogin(String username, int pin) {
        try{
            for(int i=0;i<modelAll.samsat.size();i++) {
                modelAll.Databasesamsat.ceklogin(username, pin);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
