package suhu;

public class Fahrenheit extends Satuan implements Konversi {
    private double suhu;
    
    public Fahrenheit(String satuan, double suhu) {
        super(satuan);
        this.suhu = suhu;
    }
    
    @Override
    public double toFahrenheit() {
        return suhu;
    }
    
    @Override
    public double toCelcius() {
        double c = (suhu - 32) * 5/9;
        return c;
    }   
    
    @Override
    public double toReamur() {
        double r = (suhu - 32) * 4/9;
        return r;
    }
    
    @Override
    public double toKelvin() {
        double k = (suhu - 32) * 5/9 + 273.15;
        return k;
    }
    
    public void info() {
        System.out.println("Suhu dalam " + getSatuan()+" = "+this.suhu);
        System.out.println("Celcius : " + toCelcius());
        System.out.println("Reamur  : " + toReamur());
        System.out.println("Kelvin  : " + toKelvin() + "\n");
    }    
}
