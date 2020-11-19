import java.util.Scanner;

class utama{
	
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		volume v = new volume();
		hitung h = new hitung();
		
		System.out.print("masukkan nilai jari-jari :");
		h.jari2 = input.nextInt();
		
		h.hitung();
		
		
		
	}
}