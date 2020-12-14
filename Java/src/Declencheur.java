
public abstract class Declencheur {
	
	protected boolean state = true;
	public abstract void declencher();

	public boolean isState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
}
