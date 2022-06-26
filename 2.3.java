/*
 *  Номер зачетной книжки 21-676
 *	Автор: Кузьмин Илья Викторович
 *	Дата: 17.06.2022
 *	Практическая 2. Задание 3. Вариант 19. Определить матрицу (двумерный массив) и ее заполнить случайными значениями. Определить минимальный элемент в каждой строке матрицы среди положительных элементов.
 * 
 */


public class main {
	
	public static void main(String[] name) {
		int a [] [] = new int[10][10];
		int Min [] = {100,100,100,100,100,100,100,100,100,100};
		int k = 0;
		
		System.out.println("Одномерный массив:");
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				a[i][j] = (int) (Math.random() * 100 - 50);
				System.out.print(a[i][j] + "\t");
				if (a[i][j] > 0)
				{
					if (a[i][j] < Min[k])
					{
					Min[k] = a[i][j];
					}
				}
			}
			k++;
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Минимальные положительные элементы строк:");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Min[i] + "\t");
		}
	}
}