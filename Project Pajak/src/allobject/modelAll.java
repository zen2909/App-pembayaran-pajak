package allobject;
import controller.controller_kendaraan;
import controller.controller_pajak;
import controller.controller_samsat;
import entity.entity_kendaraan;
import entity.entity_pajak;
import entity.entity_samsat;
import model.*;

import java.util.ArrayList;

public class modelAll {
    public static model_pajak Databasepajak = new model_pajak();
    public static model_samsat Databasesamsat = new model_samsat();
    public static model_kendaraan Databasekendaraan = new model_kendaraan();
    public static controller_pajak controllerpajak = new controller_pajak();
    public static controller_samsat controllersamsat = new controller_samsat();
    public static controller_kendaraan controllerKendaraan = new controller_kendaraan();
    public static ArrayList<entity_samsat> samsat = controllersamsat.read();
    public static ArrayList<entity_pajak> pajak = controllerpajak.read();
    public static ArrayList<entity_kendaraan> kendaraan = controllerKendaraan.read();

}
