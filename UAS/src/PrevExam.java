import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrevExam extends Item{

	protected PrevExam(int id, String subject, double PrintedPrc, double DigitalPrc) {
		super(id, subject, PrintedPrc, DigitalPrc);
	}

	private ArrayList <Item> prevExam = new ArrayList<Item>();
	private Scanner baca = new Scanner (System.in);
	
	private Item searchExam (int id) {
		Iterator<Item> itr = prevExam.iterator();
		Item item;
		while (itr.hasNext()) {
			item = new Item(itr.next());
			if (item.getId() == id) return item;
		}
		return null;
	}
	
	public void addExam() {
		// variable
		int ID;
		String aSubject;
		double Pp,Dp;
		Item check;
		
		System.out.println("Masukkan ID :");
		ID = baca.nextInt();
		check = searchExam(ID);
		if (check == null) {
			System.out.println("Masukkan Nama Mata kuliah :");
			aSubject = baca.next();
			System.out.println("Masukkan Harga Print :");
			Pp = baca.nextDouble();
			System.out.println("Masukkan Harga Digital :");
			Dp = baca.nextDouble();	
			
			prevExam.add(new Item(ID, aSubject, Pp, Dp));
		}
		else if (check != null) System.out.println("ID telah digunakan!");
	}
	
	public void DisplayExam() {
		System.out.println("\nLatihan Soal yang tersedia :");
		for(Item Exam:prevExam)
		Exam.dislpay(); 
		System.out.println("");
	}
	
	public void UpdateExam() {
		//variable
		int ID;
		String aSubject;
		double Pp,Dp;
		Item check;
		
		System.out.println("Masukkan ID :");
		ID = baca.nextInt();
		check = searchExam(ID);
		if (check != null) {
			System.out.println("Masukkan Nama Mata kuliah yang baru :");
			aSubject = baca.next();
			check.setSubject(aSubject);
			System.out.println("Masukkan Harga Print yang baru :");
			Pp = baca.nextDouble();
			check.setPP(Pp);
			System.out.println("Masukkan Harga Digital yang baru :");
			Dp = baca.nextDouble();	
			check.setDP(Dp);
			
			System.out.println("Data berhasil di update!");
			
		}
		else if (check == null) System.out.println("ID tidak ditemukan!");
	}
	
	public void RemoveExam() {
		int ID;
		Item check;
		
		System.out.println("Masukkan ID :");
		ID = baca.nextInt();
		check = searchExam(ID);
		if (check != null) {
			prevExam.remove(ID);
			System.out.println("Data berhasil di hapus");
		}
		else if (check == null) System.out.println("ID tidak ditemukan!");
	}
	
	public void CountPriceExam() {
		int choose, ID;
		double hprint = 0,dprint= 0,jumlah,Total;
		
		System.out.println("Masukkan ID yang ingin kamu beli :");
		ID = baca.nextInt();
		System.out.println("1. Printed \n2. Digital");
		System.out.println("Mau yang mana ? : ");
		choose = baca.nextInt();
		if (choose == 1 ) {
			System.out.println("Jumlah yang di beli : ");
			jumlah = baca.nextInt();
			for (Item Exam:prevExam) 
				hprint = getPP();
			Total = jumlah * hprint;
			System.out.println(Total);
		}else if (choose == 2) {
			getDP();
			System.out.println("Jumlah yang di beli : ");
			jumlah = baca.nextInt();
			for (Item Exam:prevExam) 
				dprint = getDP();
			Total = jumlah * dprint;
			System.out.println(Total);
		}
	}
}
