package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor ingrese un numero");
        int numero = scan.nextInt();
        if(numero%2==0){
            System.out.println("Su numero PAR");
        }else{
            System.out.println("Su numero es IMPAR");
        }
    }
    
}
