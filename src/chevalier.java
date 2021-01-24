
public class chevalier extends paladin {
	
	public chevalier(String nom) {
		super(nom, 40, 5, 5, 20, 20);	// PV, PA, PD, aR, sR
	}
	
	public String allInfo(){
		return this.nom + ": chevalier (paladin)\n"+"PV = "+this.PV+"\nPA = "+this.attaque+"\nPS = "+this.soigne; 
	}
	
}
