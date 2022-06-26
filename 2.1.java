/*
 *  Номер зачетной книжки 21-676
 *	Автор: Кузьмин Илья Викторович
 *	Дата: 17.06.2022
 *	Практическая 2. Задание 1. Вариант 19. Определить одномерный массив и заполнить его случайными значениями. НАйти максимальный элемент и переставить его с 1-м элементом массива.
 * 
 */


public class main {
	static int cont;
	static int ind;
	
	public static void main(String[] name) {
		int mas [] = new int[10];
		int Max = -10; 
		
		System.out.println("Одномерный массив:");
		for (int i = 0; i < 10; i++)
		{
			mas[i] = (int) (Math.random() * 100 - 50);
			System.out.print(mas[i] + " ");
			if (mas[i] >= Max)
			{
				Max = mas[i];
				ind = i;
			}
		}
		
		cont = mas[0];
		mas[0] = Max;
		mas[ind] = cont;
		
		System.out.println();
		
		System.out.println("Одномерный измененный массив:");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(mas[i] + " ");
		}
	}
}
