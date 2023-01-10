package model;

import entity.entity_samsat;

import java.util.ArrayList;

public class model_samsat {
    private ArrayList<entity_samsat> samsat;

    public model_samsat() {
        samsat = new ArrayList<entity_samsat>();
    }

    public void createsamsat(entity_samsat staff){
        this.samsat.add(staff);
    }
    public ArrayList<entity_samsat> read(){
        return samsat;
    }
    public void ceklogin(String username, int pin){
        boolean cek;
        int i=0;
        do {
            if (!username.equals(samsat.get(i).getUsername())){
                cek = false;
                i++;
                if (pin!=samsat.get(i).getPin()){
                }
            }else if (pin != samsat.get(i).getPin()) {
                cek = false;
                i++;
            }else{
                cek = true;
            }
        }while(cek!=true);
    }
}
