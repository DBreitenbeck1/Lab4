import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entry;
		int square;
		int cube;
		int multi;
		int a =1;
		String mult = String.format("%40s", "Multiplication Table");
		String Num = "Number";
		String sq = String.format("%9s", "Squared");
		String cu = String.format("%7s", "Cubed");
		String ls = String.format("%8s", "======");
		String multLs = String.format("%40s", "======================"); 
		boolean loop1 = true;
		String header = (Num + sq + cu + mult);
		String lines = ("======" +ls + " " + ls);
		do {
		System.out.println("Enter number:");
		entry = scanner.nextInt();
		
		System.out.println(header);
		System.out.print(lines);
		System.out.println(multLs);
		System.out.println();
		
		for (int i = 1; i<=entry; ++i) {
			square = i * i;
			cube = i * i * i;
			System.out.print(i);
			System.out.format("%10d", square);
			System.out.format("%10d", cube);
			System.out.print("     |");
			for (a=1;a<=entry;++a) {
				multi=a*i;
				System.out.format("%6d", multi);
			}
			System.out.println();
		}
		System.out.println("Do you wish to contine? [y/n]");
		loop1 = scanner.next().toLowerCase().startsWith("y");
		}while (loop1);
	
		System.out.println("Farewell!");
	
		scanner.close();	
		
	}
	
}
