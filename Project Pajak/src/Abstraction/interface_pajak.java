package Abstraction;

import java.util.ArrayList;
import entity.entity_pajak;
public interface interface_pajak {
    ArrayList<entity_pajak> read();
    boolean tambahpajak(entity_pajak pajak);
    boolean hapuspajak(int idpajak);
    boolean updatepajak(int idpajak, entity_pajak pajak);
}
