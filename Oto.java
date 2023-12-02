
public class Oto {
	String carName;
	String country;
	int cost;
	
	public  Oto(String carName, String country, int cost){
		this.carName = carName;
		this.country = country;
		this.cost = cost;
	}
	
	public String Oto() {
		return "CaName :"+" " +carName+"\n"+ "Made By :"+country+"\n"+ "Cost :"+" " +cost;
	}
	public static void main(String[] args){
		Oto oto1 = new Oto("Ford", "America", 20000);
		System.out.println(oto1.Oto());
		
	}
}
	
		
	
	
	