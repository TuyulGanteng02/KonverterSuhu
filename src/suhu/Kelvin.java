package suhu;

public class Kelvin extends Satuan implements Konversi {
    private double suhu;
    
    public Kelvin(String satuan, double suhu) {
        super(satuan);
        this.suhu = suhu;
    }
    
    @Override
    public double toKelvin() {
        return suhu;
    }
    
    @Override
    public double toCelcius() {
        double c = suhu - 273.15;
        return c;
    }
    
    @Override
    public double toReamur() {
        double r = (suhu - 273.15) * 4/5 ;
        return r;
    }
    
    @Override
    public double toFahrenheit() {
        double f = (suhu - 273.15) * 9/5 + 32;
        return f;
    }       
    
    public void info() {
        System.out.println("Suhu dalam " + getSatuan()+" = "+this.suhu);
        System.out.println("Celcius    : " + toCelcius());
        System.out.println("Reamur     : " + toReamur());
        System.out.println("Fahrenheit : " + toFahrenheit() + "\n");
    }    
}
