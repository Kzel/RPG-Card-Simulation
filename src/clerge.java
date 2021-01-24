
public class clerge extends soigneur {
	
	public clerge(String nom) {
		super(nom, 30, 5, 10);	 // PV, PS, sR
	}
	
	public String allInfo(){
		return this.nom + ": clerge (soigneur)\n"+"PV = "+this.PV+"\nPA = "+this.attaque+"\nPS = "+this.soigne; 
	}
	
}
