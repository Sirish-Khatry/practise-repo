package inheritance_polimorphism;

public class Student extends User {
	
	private String course;
	private String fee;
	private int startyear;
	
	
	
	public void studentGreet() {
		System.out.println("Hello i am a student");
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public int getStartyear() {
		return startyear;
	}

	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}


}
