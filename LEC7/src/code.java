import java.util.Scanner;
 class bujursangkar {
	int sisi;
	int luas;
	
	bujursangkar(){
		this.sisi = 0;
	}
	
	public bujursangkar(int sisi){
		this.sisi = sisi;
	}
	
	public int hitungluas() {
		luas = sisi * sisi;
		return luas;
	}
}

class segitiga{
	int alas;
	int tinggi;
	int luas_segitiga;
	
	public segitiga(int alas, int tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public int hitung_luas() {
		luas_segitiga = (alas * tinggi)/2;
		return luas_segitiga;
	}
}


class student {
	static int jumlah = 0; //static dapat diubah ketika ada object baru
	private String nama;
	private double ipk; //private hanya bisa digunakan didalam class ini saja
	int angka=0;
// kalau pake public tidak perlu setter dan getter
	
	student(){ //constructor harus sama dengan nama classnya
		nama = " ";
		ipk = 0.0;
		jumlah++;
		angka++;
	}
	
	void setstudent (String nama, double ipk) {// setter berfungsi memberikan nilai
		this.nama=nama;
		this.ipk=ipk;
	}
	
	String getnama() { //getter mereturn value, harus satu satu
		return nama;
	}
	
	double getipk() {
		return ipk;
	}
}


public class code {

	public static void main(String[] args) {
		
		bujursangkar bujur = new bujursangkar(5);
		int luas = bujur.hitungluas();
		System.out.println("luas di main = "+luas+" luas di object = "+bujur.luas);

		segitiga segit= new segitiga(3,4);
		int luas_segitiga = segit.hitung_luas();
		System.out.println(luas_segitiga+segit.luas_segitiga);
	
		Scanner baca = new Scanner(System.in);
/*		
		String tempnama;
		double tempipk;
		
		student Mhs1 = new student();
		
		Mhs1.setstudent("Amin",3.0);
//		System.out.println("Nama : "+ Mhs1.nama);
		
		System.out.println("Nama : "+ Mhs1.getnama());
		System.out.println("jumlah : "+Mhs1.jumlah);
		System.out.println("angka : "+Mhs1.angka);
		
		student Mhs2 = new student();
		
		Mhs2.setstudent("Tono",4.0);
		System.out.println("Nama : "+ Mhs2.getnama());
		System.out.println("jumlah : "+Mhs2.jumlah);
		System.out.println("angka : "+Mhs2.angka);
		
		student Mhs3 = new student();
		System.out.println("Masukkan Mahasiswa ke 3 :");
		tempnama = baca.nextLine();
		
		System.out.println("Masukkan IPK ke 3 :");
		tempipk = baca.nextInt();
		
		Mhs3.setstudent(tempnama,tempipk);
		System.out.println("Nama : "+ Mhs3.getnama());
		System.out.println("jumlah : "+Mhs3.jumlah);
		System.out.println("angka : "+Mhs3.angka);
	*/	
	}

}
