
public class BodyMassIndex {

	 public static void main(String[] Args){
	        BMI partisipan1 = new BMI();
	        partisipan1.Setdata("Fauzan",1.64,50);
	 
	 System.out.println(partisipan1.getName()+" "+partisipan1.getTinggi()+" "+partisipan1.getBerat()+" "+ partisipan1.BMIStatus());
	 }
	
	 
}

class BMI {
	private String name;
	private double tinggi;
	private double berat;
	private double bmi;
	
	BMI (){
		this.name = name;
		this.tinggi = tinggi;
		this.berat = berat;
	}
	
	public String getName() {
		return name;
	}
	
	public double getTinggi() {
		return tinggi;
	}
	
	public double getBerat() {
		return berat;
	}
	
	public double BMIStatus() {
		bmi = berat / (tinggi*tinggi);
		return bmi;
	}
	
	public void Setdata (String name, double tinggi, double berat) {
		this.name = name;
		this.tinggi = tinggi;
		this.berat = berat;
	}
}