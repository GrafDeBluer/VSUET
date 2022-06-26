/*
 *  Номер зачетной книжки 21-676
 *	Автор: Кузьмин Илья Викторович
 *	Дата: 17.06.2022
 *	Практическая 2. Задание 3. Вариант 19. Дан двумерный массив А, размером (nxn) (или квадратная матрица А).Найти среднее геометрическое положительных элементов, нижней треугольной матрицы, расположенной ниже главной диагонали, включая саму главную диагональ.
 * 
 */


public class main {
	
	public static void main(String[] name) {
		final int n = 5;
		int a [] [] = new int[n][n];
		double SredGeom = 1, k = 0;
		
		System.out.println("Двумерный массив:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = (int) (Math.random() * 100 - 50);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Треугольная матрица под главной диагональю:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(a[i][j] + "\t");
				if (a[i][j] > 0)
				{
					SredGeom *= a[i][j];
					k++;
				}
			}
			System.out.println();
		}
		
		SredGeom = Math.pow(SredGeom, 1/k);
		System.out.println("Среднее геометрическое положительных элементов: " + SredGeom);
/*		System.out.println("Минимальные положительные элементы строк:");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Min[i] + "\t");
		}*/
	}
}