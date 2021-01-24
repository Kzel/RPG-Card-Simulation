public class archer extends guerrier {
	
	public archer(String nom) {
		super(nom, 50, 5, 50);	// PV, PA, aR 
	}
	
	public String allInfo(){
		return this.nom + ": archer (guerrier)\n"+"PV = "+this.PV+"\nPA = "+this.attaque; 
	}
	
}