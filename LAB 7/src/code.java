import java.util.Scanner;


public class code {

	public static void list () {
		System.out.println("Menu");
		System.out.println("1. Add Sick Pet");
		System.out.println("2. View Sick List");
		System.out.println("3. Update pet health");
		System.out.println("4. Treat Pet ");
		System.out.println("5. Exit Program");
		System.out.println("");
		System.out.println("Choose");
	}
	
	public static void main(String[] args){
		Scanner baca = new Scanner (System.in);
		
		Pet hewan[] = new Pet[5];
		int jumlah_hewan = 3;
		int exit;
		list();
		exit = baca.nextInt();
		do {
			switch (exit) {
			case 1:
				System.out.println("3x input data:");
				for (int i= 0 ;i < jumlah_hewan;i++) {
				hewan[i]= new Pet();
				hewan[i].addpet();
				}
				list();
				exit = baca.nextInt();
				break;
			case 2:
				//list pet
				System.out.println("Name \t| Type \t| Sound | Health ");
				for (int i= 0 ;i < jumlah_hewan;i++) {
				hewan[i].listPet();
				}
				list();
				exit = baca.nextInt();
				break;
			case 3:
				//update pet
				list();
				exit = baca.nextInt();
				break;
				
			case 4:	
				//treat pet
				list ();
				exit = baca.nextInt();
			}	
		}while (exit!=5);
		System.out.println("Thankyou for using BJ-vet program");
	}

}

class Pet {
	static int jumlah = 0;
	private String name;
	private String type;
	private String sound;
	private int health;
	int jumlah_hewan = 1;
	
	Scanner baca = new Scanner(System.in);
	
	Pet (){
		this.name = name;
		this.type = type;
		this.sound = sound;
		this.health = health;
		jumlah ++;
	}
	
	public void addpet () {
		do {
			System.out.println("Input your pet name [5-15 characters] :");
			this.name = baca.nextLine();
		}while(name.length()<5 || name.length()>15);
		
		do{
			System.out.println("Input pet health [1-90] :");
			this.health = baca.nextInt();
		}while (health < 1 || health > 90);
		
/*		do {
			System.out.println("Input pet type [kit | puppy | kitten]");
			this.type = baca.nextLine();
		}while(type != "kit" || type != "puppy" || type != "kitten" );
*/	
		System.out.println("Pet Successfully added to the list");

		//concatName(name, type);
		SetPet(name,type,health);
	}
	
	public void SetPet (String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		jumlah ++;
	}
	
	public String getName (){
		return name;
	}
	
	public String getType (){
		return type;
	}
	
	public String getSound (){
		return sound;
	}
	
	public int getHealth (){
		return health;
	}
	
	public void concatName (String name,String type) {
		String t1 = "Rabbit";
		String t2 = "Dog";
		String t3 = "Cat";
		
		if (type == "kit") {
			this.sound = "clucking";
			this.name = t1.concat(name);
		}
		else if (type == "puppy") {
			this.sound = "bark bark";
			this.name = t2.concat(name);
		}
		else if (type == "kitten") {
			this.sound = "meow meow";
			this.name = t3.concat(name);
		}
		SetPet(name,type,health);
	}
	
	public void listPet () {
		System.out.println(name+"\t|"+ type +"\t|"+ sound +"\t|"+health);
	}
	
	public void treatpet () {
		
	}
}

