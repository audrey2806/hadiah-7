import java.util.Scanner;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

class Proses extends Pln{
    	Scanner input = new Scanner(System.in);
	
private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    
private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
	
public void input(){
		System.out.println("Masukkan nama anda : ");
		nama = input.nextLine();
		System.out.println("Masukkan alamat rumah anda : ");
		alamat = input.nextLine();
		
}
public void proses()
	{
		
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
			
}
		else{
			System.out.println("Maaf input anda salah");
		}
	}		
	
}

public void pembayaran(){
    	
    	
    	System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<harga){
			
			if(bayar<harga){
				System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
			
				}else{
					System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
				}
	
		
		}
    	
}

public void cetak(){
		System.out.println("");
		System.out.println("=====Cetak Hasil Pembayaran=====");
		System.out.println("Tanggal : "+getTanggal()+"  "+" Waktu sekarang : "+getWaktu());
		System.out.println("Nama pelanggan           : "+ nama);
		System.out.println("Alamat pelanggan         : "+ alamat);
		System.out.println("Harga yang harus dibayar : "+"Rp."+ harga);
		System.out.println("Jumlah uang yg diberikan : "+"Rp."+ bayar);
		System.out.println("Kembaliaan               : "+"Rp."+ (bayar-harga));
		System.out.println("=====Cetak Hasil Pembayaran=====");
		
	}
 
	
}