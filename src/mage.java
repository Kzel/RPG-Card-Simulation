public class mage extends soigneur {

	public mage(String nom) {
		super(nom, 20, 10, 10);			// PV, PS, sR
	}

	public String allInfo(){
		return this.nom + ": mage (soigneur)\n"+"PV = "+this.PV+"\nPS = "+this.soigne; 	
	}
	
}