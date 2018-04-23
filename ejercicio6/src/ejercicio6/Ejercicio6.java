package ejercicio6;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean estaNevando = false;
        boolean estaLloviendo = true;
        double temperatura = 15.0;
        if(estaNevando == true || estaLloviendo == true || temperatura < 10){
            System.out.println("Nos quedamos en casa");
        }else{
            System.out.println("Vamos afuera");
        }
    }
    
}
