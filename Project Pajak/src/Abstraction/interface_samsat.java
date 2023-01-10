package Abstraction;

import entity.entity_samsat;

import java.util.ArrayList;

public interface interface_samsat {
    ArrayList<entity_samsat> read();
    boolean tambahsamsat(entity_samsat samsat);
    boolean cekLogin(String username,int pin);
}
