package suhu;

public class KonverterSuhu {
    public static void main(String[] args) {
        Celcius c = new Celcius("Celcius", 30);
        c.info();
        Reamur r = new Reamur("Reamur", 30);
        r.info();
        Fahrenheit f = new Fahrenheit("Fahrenheit", 95);
        f.info();
        Kelvin k = new Kelvin("Kelvin", 300.15);
        k.info();
    }    
}
