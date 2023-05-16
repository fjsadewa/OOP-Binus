import java.util.ArrayList;
import java.util.Scanner;

public class generictest {

	public static void main(String[] args) {
		printer angka = new printer();
		angka.print(10);
		//angka.print(10.1);

		PrintDouble angkadouble = new PrintDouble(); 
        angkadouble.print(10.2);
	
        PrintString stringnih = new PrintString(); 
        stringnih.print("Apaan Sih");

        PrintSemua<Integer> allinteger = new PrintSemua<>();
        allinteger.print(23);
        
        PrintSemua<Double> alldouble = new PrintSemua<>();
        alldouble.print(23.20);
        
        PrintSemua<String> allString = new PrintSemua<>();
		allString.print("Sarapan skuyyyy!!!");
        
        PrintSemua<Kucing> catkecil = new PrintSemua <>();
        catkecil.print("Gubrax Gubrax");
        
        PrintSemua<Bebek> bebekkecil = new PrintSemua <>();
        bebekkecil.print("Lalalala");
        
        //PrintSemua<Kucing> cat = new ArrayList<>();
        //cat.add(new Kucing();
        
       PrintAnimal<Kucing> cat = new PrintAnimal <>(new Kucing());
       cat.print();
       
       PrintAnimal<Bebek> bebek = new PrintAnimal <>(new Bebek());
       bebek.print();
        
       teriak ("IloveYouu");
       teriak (1000000);
       teriaklagi("Sayyy",20);
       
       ArrayList<Integer> cobaInt = new ArrayList(); 
       cobaInt.add(10); 
       teriakmana(cobaInt);
       
       ArrayList<Bebek> cobaBebek = new ArrayList(); 
       cobaBebek.add(new Bebek());
       teriakmana(cobaBebek);

       
	}

	public static <T> void teriak(T teriakapaaja){
	    System.out.println(teriakapaaja+"!@##$%");
	}

	public static<T,V> void teriaklagi(T teriakapaaja, V teriakdonk){
	     System.out.println(teriakapaaja+"  !@##$%   " + teriakdonk);
	}
	
	public static void teriakmana(ArrayList <?> dataku){
	    System.out.println("Okeeeee  " + dataku);
	}

}


/*
E - Element (used exentsively by the Java Collections Framework)
T – Type
K – Key
N – Number
V – Value

*/
