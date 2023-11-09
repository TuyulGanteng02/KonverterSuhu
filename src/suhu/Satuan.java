package suhu;

abstract class Satuan {
    private String satuan;

    public Satuan(String satuan) {
        this.satuan = satuan;
    }
    
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    
    public String getSatuan() {
        return satuan;
    }
}
