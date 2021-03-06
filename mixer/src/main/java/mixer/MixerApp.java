package mixer;

public class MixerApp {

	public static void main(String[] args) {
		Mixer myDrink = new Mixer();
		myDrink.mix(); 
		Mixer myMargarita = new Margarita();
		myMargarita.mix();
		Mixer myWhiteRussian = new WhiteRussian();
		myWhiteRussian.mix();
		
		System.out.println("Let the bartender handle the mixing!");
		Bartender myBartender = new Bartender();
		Mixer newMargarita = new Margarita();
		myBartender.handleMixing(newMargarita);
		myBartender.handleMixing(myWhiteRussian);
		
		Mixer mySaltRimmed = new saltRimmedMargarita();
		myBartender.handleMixing(mySaltRimmed);
		myBartender.handleRemoveGarnish(mySaltRimmed);
		myBartender.handleRemoveGarnish(myWhiteRussian);

		
	}

}
