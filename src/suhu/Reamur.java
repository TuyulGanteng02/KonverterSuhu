package suhu;

public class Reamur extends Satuan implements Konversi {
    private double suhu;
    
    public Reamur(String satuan, double suhu) {
        super(satuan);
        this.suhu = suhu;
    }
    
    @Override
    public double toReamur() {
        return suhu;
    }
    
    @Override
    public double toCelcius() {
        double c = suhu * 5/4;
        return c;
    }   
    
    @Override
    public double toFahrenheit() {
        double f = suhu * 9/4 + 32;
        return f;
    }
    
    @Override
    public double toKelvin() {
        double k = suhu * 5/4 + 273.15;
        return k;
    }
    
    public void info() {
        System.out.println("Suhu dalam " + getSatuan()+" = "+this.suhu);
        System.out.println("Celcius    : " + toCelcius());
        System.out.println("Fahrenheit : " + toFahrenheit());
        System.out.println("Kelvin     : " + toKelvin() + "\n");
    }    
}
