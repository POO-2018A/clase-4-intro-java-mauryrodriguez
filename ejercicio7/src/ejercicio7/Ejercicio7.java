package ejercicio7;

public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] oracion = {"Introduccion", "a", "POO", "con", "Java"};
        int indice = buscarPalabra(oracion,"a");
        System.out.println(indice);
        
    }
    
    public static int buscarPalabra(String[] stringArray, String palabra){
       for(int i = 1; i<=stringArray.length; i++){
           //System.out.println(i);
           if(stringArray[i].equals(palabra)){
               return -i;
           }
               
        }
        return -1;
        
    }
    
}
