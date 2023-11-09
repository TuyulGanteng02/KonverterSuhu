package suhu;

public class Celcius extends Satuan implements Konversi {
    private double suhu;
    
    public Celcius(String satuan, double suhu) {
        super(satuan);
        this.suhu = suhu;
    }
    
    @Override
    public double toCelcius() {
        return suhu;
    }
    
    @Override
    public double toFahrenheit() {
        double f = suhu * 9 / 5 + 32;
        return f;
    }
    
    @Override
    public double toKelvin() {
        double k = suhu + 273.15;
        return k;
    }
    
    public void info() {
        System.out.println(getSatuan()+" = "+this.suhu);
        System.out.println("Fahrenheit  : " + toFahrenheit());
        System.out.println("Kelvin      : " + toKelvin());
    }    
}
