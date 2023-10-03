import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Valores{
    // Declaración del bufer parea recibir datos de entrada
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    // Declaración del método para almacenar los valores en el arreglo 
    public static int[] leerNumeros(int num) throws IOException{
        int[] numero = new int[num];
        System.out.println("Escriba un numero: ");
        for(int i = 0; i < num; i++){
            System.out.println("Escriba el numero con el id: "+ i +":");
            entrada = bufer.readLine();
            numero[i] = Integer.parseInt(entrada);
        }
        return numero;
    }
    
    /**
    * @param args the command line arguments
    * @throws java.io.IOException
    */

    public static void main(String[] args) throws IOException {
        //Declaracion de variables
        int t;
        int numayor = 0; 
        int numenor = 0;
        
        //Leer el tamaño del arreglo
        System.out.println("__________________________________________________");
        System.out.println("| Escribe el tamaño del arreglo:                 |");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        System.out.println("__________________________________________________");
        
        //Delcaración del arreglo
        int[] numero;

        // Llamado al metodo donde se almacena los datos del arreglo, y se guardan en mismo arreglo
        numero = leerNumeros(t);
        
        // Imprimir los valores del arreglo 
        System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
        System.out.println("Los números son: ");
        for(int unNumero: numero){
            System.out.print("  " + unNumero + "  ");
        }
        System.out.println(" ");
        System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
        
        //Identificar en numero mayor y menor con el arreglo
        for (int i = 1; i < numero.length; i++){
            if (numero[i] > numayor)
                numayor = numero[i];
            else
                numenor = numero[i];
        }

        // Imprimir los valores del numero mayor y menor
        System.out.println(" ");
        System.out.println("///////////////////////////");
		System.out.println("// El numero mayor es: "+ numayor + " //");
        System.out.println("// El numero menor es: "+ numenor + " //");
        System.out.println("///////////////////////////");
    }
}