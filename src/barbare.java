public class barbare extends guerrier {
	
	public barbare(String nom) {
		super(nom, 60, 7, 30);	// PV, PA, aR 
	}
	
	public String allInfo(){
		return this.nom + ": barbare (guerrier)\n"+"PV = "+this.PV+"\nPA = "+this.attaque; 
	}
	
}