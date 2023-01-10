package controller;

import Abstraction.interface_pajak;
import entity.entity_pajak;
import allobject.modelAll;

import java.util.ArrayList;

public class controller_pajak implements interface_pajak {
    @Override
    public ArrayList<entity_pajak> read() {
        return modelAll.Databasepajak.read();
    }

    @Override
    public boolean tambahpajak(entity_pajak pajak) {
        try{
            modelAll.Databasepajak.create(pajak);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean hapuspajak(int idpajak) {
        try{
            modelAll.Databasepajak.hapuspajak(idpajak);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean updatepajak(int idpajak, entity_pajak pajak) {
        try{
            modelAll.Databasepajak.editpajak(idpajak, pajak);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
