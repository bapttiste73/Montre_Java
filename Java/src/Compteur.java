import java.text.DecimalFormat;

public class Compteur {
	private int val;
	private int borneInf;
	private int borneSup;
	private int pas;
	
	public Compteur() {
		this(0,Integer.MAX_VALUE,1);
	}
	
	public Compteur(int borneInf, int borneSup, int pas) {
		this.borneInf = borneInf;
		this.borneSup = borneSup;
		this.pas = pas;
		
	}
	public void incrementer() {
		this.val = this.val + this.pas;
	}
	
	public void RAZ() {
		this.val = borneInf;
	}
	public boolean fini() {
		if(this.getVal() >= this.getBornesup()) {
			this.RAZ();
			return true;
		}
		else
			return false;
	}
		
	public int getVal() {
		return val;
	}
	public int getBorneinf() {
		return borneInf;
	}
	public int getBornesup() {
		return borneSup;
	}
	public int getPas() {
		return pas;
	}
	
	@Override
    public String toString() {
        return "" + new DecimalFormat("00").format(this.getVal()); // Format avec 2 chiffres
    }
}
