
public class PrintAnimal <T extends Animal> {
	T Yangdicetak;
	
	public PrintAnimal (T Yangdicetak) {
		  this.Yangdicetak = Yangdicetak; 
	}
	
	public void print(){
		System.out.println("BumBum");
	    Yangdicetak.berbunyi();
	        
	    }

	
}
