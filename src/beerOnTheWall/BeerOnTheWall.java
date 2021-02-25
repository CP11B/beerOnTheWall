package beerOnTheWall;

public class BeerOnTheWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bottlesOfBeer();
	}
	
	public static void bottlesOfBeer() {
		for (int beer = 100; beer>0; beer--) {
			System.out.println(beer + " bottles of beer on the wall, " + beer + " bottles of beer.");	
			int lessBeer = beer - 1;
			System.out.println("Take one down, pass it around, " + lessBeer + " bottles of beer on the wall.");
			System.out.print( "\n\n" );
		}
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
		
		
	}
}
