/*
 *  Номер зачетной книжки 21-676
 *	Автор: Кузьмин Илья Викторович
 *	Дата: 17.06.2022
 *	Практическая 2. Задание 2. Вариант 19. Дан одномерный массив а(n), в котором находится единственный элемент равный 5. Найти где он находится , и упорядочить по убыванию элементы, расположенные перед ним. Выдать на экран номер элемента и упорядоченный массив.
 * 
 */


public class main {
	static int ind;
	
	public static void main(String[] name) {
		Integer a [] = new Integer[10];
		boolean Flag = false;
		
		System.out.println("Одномерный массив:");
		for (int i = 0; i < 10; i++)
		{
			a[i] = (int) (Math.random() * 15 - 5);
			if (a[i] == 5)
			{
				if (Flag)
				{
					a[i]++;
					continue;
				}
				else
				{
					ind = i;
					Flag = true;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i = ind-1 ; i >= 0 ; i--)
		{
	        for(int j = 0 ; j < i ; j++)
	        {
	            if(a[j] < a[j+1])
	            {
	                int tmp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = tmp;
	            }
	        }
		}
		
		System.out.println("Одномерный измененный массив:");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}