public abstract class guerrier extends personnage implements attaquant{
	
	protected guerrier(String nom, int PV, int PA, int aR){
		super(nom, PV, PA, 0, aR, 0);
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
	
}
