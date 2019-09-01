import java.util.*;
import java.math.*;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosContados = new int[10];
        
        System.out.print("Introduce el numero de repeticiones: ");
        int numeroDeRepeticiones = sc.nextInt();

        for(int i = 0; i < numeroDeRepeticiones; i++){
            numerosContados[((int)(Math.random()*10))]++;
        }

        System.out.println("Ley de los Grandes Numeros");
        for (int i = 0; i < numerosContados.length; i++) {
            System.out.printf("Numero %d tuvo: %d su probabilidad es de %.2f \n", (i+1),numerosContados[i],((double)numerosContados[i]/(double)numeroDeRepeticiones));
        }

        System.out.println();
        System.out.print("Introduce el numero de tiros para calcular la media: ");
        int numeroDeTiros = sc.nextInt();

        int[][] valores = new int[numeroDeTiros][numeroDeRepeticiones];
        int[] medias = new int[numeroDeTiros];

        //llenar muestras
        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores[0].length; j++){
                valores[i][j] = ((int)(Math.random()*10)+1);
            }
        }


        //llenar medias
        for(int i = 0; i < valores.length; i++){
            int sum = 0;
            for(int j = 0; j < valores[0].length; j++){
                sum += valores[i][j];
            }
            medias[i] = sum;
        }
        
        System.out.println("Teorema del eje central");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Media %d tuvo: %.2f de media \n", (i+1),((double)medias[i]/(double)numeroDeRepeticiones));
        }
    }   
}