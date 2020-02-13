package ua.lviv.logos;

public class Application {
	
	public static void main(String[] args) {
		
		//8 типів змінних - примітивних типів даних
		int a;
		long lg;
		double e;
		byte b;
		char c;
		boolean n;
		float f;
		short s;
		
		
		// Вивести максимальне та мінімальне значення типів даних
		 System.out.println("Int max = " + Integer.MAX_VALUE);
	     System.out.println("Int min = " + Integer.MIN_VALUE);
	     System.out.println("Long max = " + Long.MAX_VALUE);
	     System.out.println("Long min = " + Long.MIN_VALUE);
	     System.out.println("Double max = " + Double.MAX_VALUE);
	     System.out.println("Double min = " + Double.MIN_VALUE);
		 System.out.println("Byte max = " + Byte.MAX_VALUE);
	     System.out.println("Byte min = " + Byte.MIN_VALUE);
	     System.out.println("Chat max = " + Character.MAX_RADIX);
	     System.out.println("Char min = " + Character.MIN_RADIX);
	     System.out.println("Boolean = " + Boolean.TRUE);
	     System.out.println("Boolean = " + Boolean.FALSE);
	     System.out.println("Float max = " + Float.MAX_VALUE);
	     System.out.println("Float min = " + Float.MIN_VALUE);
	     System.out.println("Short max = " + Short.MAX_VALUE);
	     System.out.println("Short min = " + Short.MIN_VALUE);
	     
	     
		
	     
	     // Знайти найбільше та найменше значення масиву
	     System.out.println("Завдання 3");
	     int[] array={33,7,-77,89,23,30,67,78,56,27};
	     int max=array[0];
	     int min=array[0];
	     for (int i = 0; i < array.length; i++)
	     if (max<array[i]) {
	     max=array[i];
	     }
	     System.out.println("Найбільше значення масиву ");
	     System.out.println(max);
	     for (int l = 0; l < array.length; l++)

	     if(min > array[l]) {
	     min=array[l];
	     }
	     System.out.println("Найменше значення масиву ");
	     System.out.println(min);

	
	
	     
	}
	
	
}
