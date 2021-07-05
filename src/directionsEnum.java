
public enum directionsEnum {
	
	NORTH("FORWARD"),
	EAST("RIGHT"),
	WEST("LEFT"),
	SOUTH("BACKWARD");
	
	private final String motion;

	directionsEnum(String motion) {
		this.motion = motion;
	}

	public String getMotion() {
		return motion;
	}
	
	public static String sameAs(directionsEnum d) {
		
		
		String text = d + " is the same as " + d.getMotion();
		return text;
		
	}

}
