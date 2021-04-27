import java.util.*;


public class ArraySort{
  static long tiempoInicio;
  static long tiempoFinal;
  public static void main(String [] args){

    Boolean random = true;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de numeros a ordenar");
    int elemQuantity =sc.nextInt();
    int[] readArray = new int[elemQuantity];
	  int[] resultArray = new int[elemQuantity];
    for(int i = 0; i < elemQuantity; i++) {
  	if (random) {
	  	Random rand = new Random();
		  readArray[i] = rand.nextInt(elemQuantity) + 1;
	  } 
    else {
	    readArray[i] = elemQuantity - i;
	  }
	  resultArray[i] = 0;
	  }
    tiempoInicio = System.nanoTime();
    Arrays.sort(readArray);
    tiempoFinal = System.nanoTime();
    System.out.println("Tiempo: " + (tiempoFinal-tiempoInicio) + " nanosegundos.");

  }


}