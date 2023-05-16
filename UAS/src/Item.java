
public class Item {
	private final int id;
	private String subject;
	private double PrintedPrc,DigitalPrc;
	
	
	protected Item (int id, String subject, double PrintedPrc, double DigitalPrc) {
		this.id = id;
		this.subject = subject;
		this.PrintedPrc = PrintedPrc;
		this.DigitalPrc = DigitalPrc;
	}
	
	public Item(Item item) {
		this.id = item.id;
		this.subject = item.subject;
		this.PrintedPrc = item.PrintedPrc;
		this.DigitalPrc = item.DigitalPrc;
	}
	//getter
	public int getId () {
		return id;
	}
	
	public String getSub() {
		return subject;
	}
	
	public double getPP () {
		return PrintedPrc;
	}
	
	public double getDP () {
		return DigitalPrc;
	}
	
	//setter
	public void setSubject(String aSubject) {
		this.subject = aSubject;
	}
	
	public void setPP(double Pp) {
		this.PrintedPrc = Pp;
	}
	
	public void setDP(double Dp) {
		this.DigitalPrc = Dp;
	}
	
	public void dislpay () {
		System.out.println("ID = "+ id);
		System.out.println("Mata kuliah = "+ subject);
		System.out.println("Harga Print = "+ PrintedPrc);
		System.out.println("Harga Digital = "+ DigitalPrc+"\n");
	}
	
}
