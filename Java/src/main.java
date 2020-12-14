public class main {

	public static void main(String[] args) throws InterruptedException{
				
		Reveil reveil = new Reveil(0,1);
		
		/*Declencheur[] ds = reveil.getDeclencheurs();
		ds[0].setState(false);*/
		
		reveil.tourner();
	}
}

