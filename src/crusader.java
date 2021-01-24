
public class crusader extends paladin {
	
	public crusader(String nom) {
		super(nom, 40, 5, 3, 20, 20);	// PV, PA, PD, aR, sR
	}
	
	public String allInfo(){
		return this.nom + ": crusader (paladin)\n"+"PV = "+this.PV+"\nPA = "+this.attaque+"\nPS = "+this.soigne; 
	}
	
}
