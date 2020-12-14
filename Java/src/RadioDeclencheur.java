
public class RadioDeclencheur extends Declencheur implements iRadio{
	
	protected Radio radio;
	
	public RadioDeclencheur() {
		this.radio = new Radio();
	}
	
	public void declencher() {
		allumerRadio();
	}
	
	public void allumerRadio() {
		radio.allumerRadio();
	}
}
