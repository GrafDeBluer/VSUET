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
