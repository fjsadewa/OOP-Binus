import java.util.Scanner;

public class main {
	public static void Status () {
		System.out.println("1. Admin");
		System.out.println("2. Student");
		System.out.println("3. Exit");
		System.out.println("Kamu sebagai apa nih?");
	}
	
	public static void list () {
		System.out.println("Menu");
		System.out.println("1. Pencarian");
		System.out.println("2. Pesananku");
		System.out.println("3. Kembali");
		System.out.println("Pilih menu apa?");
	}
	
	public static void browse() {
		System.out.println("\nMenu Pencarian");
		System.out.println("1. Materi Kuliah");
		System.out.println("2. Soal Ujian Tahun Lalu");
		System.out.println("3. Latihan Soal");
		System.out.println("4. Kembali");
		System.out.println("Pilihanmu ");
	}
	
	public static void matkul() {
		System.out.println("\n Mata Kuliah");
		System.out.println("1. Object Oriented Programming");
		System.out.println("2. User Experience");
		System.out.println("3. Mobile Programming ");
		System.out.println("4. Kembali");
		System.out.println("Pilih Matkul apa ?");
	}
	
	public static void Admin() {
		System.out.println("1. Tambahkan Data");
		System.out.println("2. Edit Data");
		System.out.println("3. Hapus Data");
		System.out.println("4. Kembali");
		System.out.println("Apa yang mau kamu lakukan ?");
	}
	

	
	public static void main(String[] args) {
		//Scanner
		Scanner baca = new Scanner (System.in);
		PracPaper aPractice = new PracPaper(0, null, 0, 0);
		PrevExam aPreExam = new PrevExam(0,null,0,0);
		LecModule aLecModule = new LecModule(0,null,0,0);
		
		//Variable
		int role,conf,verif,menu1, menu2,menu3,menuAdm;
		int exit = 0;
		do {
		//program
		System.out.println("Crated by Filipus Junio Sadewa - 2440100121");
		System.out.println("Selamat Datang di E-Smartplace");
		System.out.println("==============================");
		
		//pick role
		Status();
		role = baca.nextInt();
		
				// Admin
				switch (role) {
				case 1:
					do {
					System.out.println("\nHalo Admin!");
					System.out.println("1. Verifikasi");
					System.out.println("2. Kembali");
					conf = baca.nextInt();
					//vertifikasi
					if (conf == 1) {
						do {
							System.out.println("Masukkan 3 digit awal NIM :");
							verif = baca.nextInt();
								if (verif != 244) {
									System.out.println("Silahkan coba lagi");
									System.out.println("Hint : Ada di paling atas!\n");
								}
						}while (verif != 244);
						
						do {
						// Manage Product
						System.out.println("\nMenu Admin");
						System.out.println("1. Materi Kuliah");
						System.out.println("2. Soal Ujian Tahun Lalu");
						System.out.println("3. Latihan Soal");
						System.out.println("4. Kembali");
						System.out.println("Pilihanmu ");
						menu1 = baca.nextInt();
						switch (menu1) {
							case 1 :
								do {
								System.out.println("Materi Kuliah");
								Admin();
								menu2 = baca.nextInt();
									switch (menu2) {
									case 1 :
										//tambahkan data materi
										System.out.println("maaf fitur ini belum tersedia");
										break;
									case 2 :
										//edit data materi
										System.out.println("maaf fitur ini belum tersedia");
										break;
									case 3 :
										//hapus data materi
										System.out.println("maaf fitur ini belum tersedia");
										break;
									}
								}while (menu2 !=4);
								break;
							case 2 :
								do {
								System.out.println("Soal ujian tahun lalu");
								Admin();
								menu2 = baca.nextInt();
									switch (menu2) {
									case 1 :
										//tambahkan data exam
										aPreExam.DisplayExam();
										aPreExam.addExam();
										break;
									case 2 :
										//edit data exam
										aPreExam.DisplayExam();
										aPreExam.UpdateExam();
										break;
									case 3 :
										//Hapus data exam
										aPreExam.DisplayExam();
										aPreExam.RemoveExam();
										break;
									}
								}while (menu2 !=4);
								break;
							case 3 :
								do {
								System.out.println("\nLatihan Soal");
								Admin();
								menu2 = baca.nextInt();
									switch (menu2) {
									case 1 :
										//tambah data practice
										aPractice.DisplayPractice();
										aPractice.addPractice();
										break;
									case 2 :
										//edit data practice
										aPractice.DisplayPractice();
										aPractice.UpdatePractice();
										
										break;
									case 3 :
										//hapus data practice
										aPractice.DisplayPractice();
										aPractice.RemovePractice();
										break;
									}
								}while (menu2 !=4);
								break;
							}
						}while (menu1 !=4);
					}
					}while (conf != 2);
					break;
				//User
				case 2:
					System.out.println("\nHalo Student! Ada yang bisa kami bantu?");
					list();
					menu1 = baca.nextInt();			
					switch (menu1) 
					{
						case 1 :
							do {
							//Browse
							browse();
							menu2 = baca.nextInt();
								switch(menu2) 
								{	
									case 1 :									
										//materi
										System.out.println("maaf fitur ini belum tersedia");
										break;
									case 2 :
										//exam
										System.out.println("");
										aPreExam.DisplayExam();
										aPreExam.CountPriceExam();
										break;
									case 3 :
										//practice'
										System.out.println("");
										aPractice.DisplayPractice();
										aPractice.CountPricePractice();
										break;
								}
							}while (menu2!=4);
							break;
						case 2 :
							//Shopping Cart	
							System.out.println("Keranjang pesananku! :");
							
							break;
					}
					break;
				}
			}while(role!=3);
		System.out.println("Selamat Tinggal");
	}

}
