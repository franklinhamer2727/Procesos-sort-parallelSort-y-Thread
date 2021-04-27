import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public  class Parallelsort{
    static long tiempoInicio;
    static long tiempoFinal;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cabtidad de numeros que se van a ordenar");
        int  cantidad = sc.nextInt();
        Random rnd = new Random();
        int [] numeros = new int[cantidad];
        for(int i = 0; i<cantidad; i++){
            numeros[i]= rnd.nextInt(cantidad +1);
        }

        tiempoInicio= System.nanoTime();
        Arrays.parallelSort(numeros);
        //1000Arrays.parallelSort
        tiempoFinal= System.nanoTime();
        System.out.println("El tiempo de ejecucion es "+(tiempoFinal-tiempoInicio)+" nanosegundos");
    }
}