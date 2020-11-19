import java.util.Scanner;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 

public class Proses extends Pln
{ 	private int bayar;
	private int harga;
	private char blok;
	private int tipe;
    
	public Proses(String nama, String alamat ){
		
		super(nama,alamat);
		this.bayar = bayar;	
		this.harga = harga;
		this.blok = blok;
		this.tipe = tipe;
	}

	public int getBayar(){
		return bayar;
	}
	public int getHarga(){
		return harga;
	}
	public char getBlok(){
		return blok;
	}
	public int getTipe(){
		return tipe;
	}
	public String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    
    public String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
	

	public void pilihan(){
		
		Scanner input = new Scanner(System.in);
		boolean loop=true;
		
		while(loop){
		System.out.print("Masukkan tipe(36/37) : ");
		tipe = input.nextInt();
		
		
		if(tipe == 36){
	
		while(loop){
			System.out.print("Masukkan blok(A/B) : ");
			blok = input.next().charAt(0);
			
		switch(blok){
			case 'A':
			 
			 harga = 500000;
			 System.out.println("Harga yang harus dibayar : "+ harga);
			 loop=false;
		
			 
			break;
			
			case 'B' :
			
			harga = 300000;
			System.out.println("Harga yang harus dibayar : "+ harga);
		    loop=false;
			
			break;
				
			default:
			System.out.println("maaf input anda salah");
			break;
			
			 
		}
	}
		
		
}			else if(tipe == 37){
			while(loop){
			
			System.out.print("Masukkan blok(A/B) : ");
			blok = input.next().charAt(0);
			
			
			switch(blok){
			case 'A':
			 
			 harga = 800000;
			 System.out.println("Harga yang harus dibayar : "+ harga);
		     loop=false;
			 
			break;
			
			case 'B' :
			
			harga = 600000;
			System.out.println("Harga yang harus dibayar : "+ harga);
		
			loop=false;
			break;
			
			default:
			System.out.println("maaf input anda salah");
			break;
			
		}
	}	
}			else
		{
			System.out.println("Maaf input anda salah");
		}

	}	
}
	
	public void pembayaran()
	{
		Scanner input = new Scanner(System.in);
    	
    	System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<harga){
			
			if(bayar<harga){
				System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
			
				}
				else{
					System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
				}
	
		
		}
	}
		
}			
	

