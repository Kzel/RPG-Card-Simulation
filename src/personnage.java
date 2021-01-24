
import java.util.*;
import java.lang.*;

public abstract class personnage {
	protected Random random0 = new Random();
	protected String nom;
	protected int PV;			 //point de vie 
	protected int attaque = 0;	 //point d'attaque
	protected int soigne = 0;    //point de soigne
	protected int aDis = -1;	 //distance d'attaque	
	protected int sDis = -1;	 //distance d'soigne
	
	protected personnage(String nom, int PV) {
		this.nom = nom;
		this.PV = PV;
	}
	
	protected personnage(String nom, int PV, int PA, int PS,int aR,int sR) {
		this.nom = nom;
		this.PV = PV;
		this.attaque = PA;
		this.soigne=PS;
		this.aDis = aR;
		this.sDis = sR;
	
	}
	public abstract String allInfo();
	
	public void setPV(int PV) {
		this.PV = PV;
		
	}
	
	public int getPV() {
		return this.PV;
	}
	
	public int randDistance() {
		int n = random0.nextInt(50);
		return n;
	}
	
	protected String mess(String act, personnage p) {
		return this.nom + " " + act + " " + p.nom;
	}
	
	public String restPV() {
		return this.nom + " reste "+this.getPV()+" PV";
	}
	
	public String toString(){
		return this.nom; 
	}
}