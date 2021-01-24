public abstract class paladin extends personnage implements attaquant , soignant {

	protected paladin(String nom, int PV, int PA, int PS, int aR, int sR) {
		super(nom, PV, PA, PS, aR, sR);
	}
	
	public void attaquer(personnage p){
		int distance=this.randDistance();
		if (distance>=0 && distance <=this.aDis){
			System.out.println(mess("attaque",p)+" - "+ this.attaque + " PV");
			p.setPV(p.getPV() - this.attaque);
			System.out.println(p.restPV());
			if (p.getPV() <= 0) {
				System.out.println(p.toString() + " est mort(e)");
			}
		}else {
			System.out.println(mess("attaque", p)+ "avec distance très proche");
		}
	}
	
	public void soigner(personnage p){
		int distance=this.randDistance();
		
		if (distance>=0 && distance <=this.sDis){
			System.out.println(mess("soigne",p)+" - "+ this.soigne + " PV");
			p.setPV(p.getPV() + this.soigne);
			System.out.println(p.restPV());
		}else {
			System.out.println(mess("soigne", p)+ "avec distance très proche");
		}
	}
	
}