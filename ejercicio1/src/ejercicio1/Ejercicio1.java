package ejercicio1;

public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fahrenheit = (Math.random()*100+1);
        //System.out.println(fahrenheit);
        double celsius = ((fahrenheit - 32)*5)/9;
        System.out.println(celsius);
    }
}
