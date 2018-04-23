package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor ingrese su edad");
        int edad = scan.nextInt();
        if(edad<=17){
            System.out.println("Ud es menor de edad");
        }else{
            System.out.println("Ud es mayor de edad");
        }
    }
    
}
