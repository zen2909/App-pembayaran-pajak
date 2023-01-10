package entity;

public class entity_pajak {
    public int id_pajak;
    public int cc;
    public int biaya_pajak;
    public int tenggat;
    public int denda_pajak;

    public entity_pajak(int id_pajak, int cc, int biaya_pajak, int tenggat, int denda_pajak) {
        this.id_pajak = id_pajak;
        this.cc = cc;
        this.biaya_pajak = biaya_pajak;
        this.denda_pajak = denda_pajak;
        this.tenggat = tenggat;
    }

    public int getId_pajak() {
        return id_pajak;
    }

    public void setId_pajak(int id_pajak) {
        this.id_pajak = id_pajak;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getBiaya_pajak() {
        return biaya_pajak;
    }

    public void setBiaya_pajak(int biaya_pajak) {
        this.biaya_pajak = biaya_pajak;
    }

    public int getDenda_pajak() {
        return denda_pajak;
    }

    public void setDenda_pajak(int denda_pajak) {
        this.denda_pajak = denda_pajak;
    }

    public int getTenggat() {
        return tenggat;
    }

    public void setTenggat(int tenggat) {
        this.tenggat = tenggat;
    }
}
