package parte2;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Modificado usando lambda para ""escribir menos""
		 */
		BiFunction<Integer, Integer, Integer> suma2 = (x,y) -> x+y;
		
		System.out.println(suma2.apply(5, 5));
		
		System.out.println("Creando repo local como administrador");


	}

}
