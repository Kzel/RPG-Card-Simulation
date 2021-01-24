
public abstract class soigneur extends personnage implements soignant{
	
	protected soigneur(String nom, int PV, int PS, int sR){
		super(nom, PV, 0, PS, 0, sR);
		
	}
	
	public void soigner(personnage p){
			int distance=this.randDistance();
			
			if (distance>=0 && distance <=this.sDis){
				System.out.println(mess("soigne",p)+" + "+ this.soigne + " PV");
				p.setPV(p.getPV() + this.soigne);
				System.out.println(p.restPV());
			}else {
				System.out.println(mess("soigne", p)+ "avec distance très proche");
		}
	}
	
	
}
