
public class enumRunner {

	public static void main(String[] args) {
		
		System.out.println(directionsEnum.NORTH.getMotion());
		
		for(directionsEnum d : directionsEnum.values()) {
			System.out.println(d + " " + d.getMotion());
		}
		
		
		directionsEnum d = directionsEnum.NORTH;
		
		System.out.println(directionsEnum.sameAs(d));

	}


}
