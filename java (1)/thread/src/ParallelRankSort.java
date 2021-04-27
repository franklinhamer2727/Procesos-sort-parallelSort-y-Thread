import java.util.Random;
import java.util.Scanner;

public class ParallelRankSort {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


		// Obtener argumentos de la línea de comandos 

        System.out.println("<problem_size>: Number of elements of the array to be sorted.");
        int elemQuantity =sc.nextInt();
	
        System.out.println("<number_of_threads>: Number of threads to be used in the parallelization.");

        int threadNum =sc.nextInt();
		if(threadNum == 0) {
			threadNum = Runtime.getRuntime().availableProcessors();
		}

		Boolean random = true;


		// Inicializar matrices 
		int[] readArray = new int[elemQuantity];
		int[] resultArray = new int[elemQuantity];


		// Cree una matriz inicial sin clasificar e imprímala 
		for(int i = 0; i < elemQuantity; i++) {
			if (random) {
				Random rand = new Random();
				readArray[i] = rand.nextInt(elemQuantity) + 1;
			} else {
				readArray[i] = elemQuantity - i;
			}
			resultArray[i] = 0;
		}


		// Iniciar temporizador 
		long start = System.currentTimeMillis();

		// Calcular bloques de operación para hilos
		int blockSize = elemQuantity / threadNum;

		// Iniciar hilos 
		ParallelRankThread threads[] = new ParallelRankThread[threadNum];
		for(int i = 0, j = 0; i < threadNum; i++, j += blockSize) {
			threads[i] = new ParallelRankThread(readArray, resultArray, threadNum, i);
			threads[i].start();
		}

		// Unir hilos 
		try {
			for(int i = 0; i < threadNum; i++) {
				threads[i].join();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Detener temporizador 
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis / 1000F;

		//Imprimiendo el array final
		// System.out.println("\nFinal array:");
		// for(int i = 0; i < elemQuantity; i++) {
		// System.out.print(resultArray[i] + " ");
		// if (i % 10 == 0) {
		// 	System.out.println();
		// 	}
		// }
		// System.out.println();

		// Duración de la impresión 
		System.out.println("Duration: " + elapsedTimeSec + "s");

	}
}