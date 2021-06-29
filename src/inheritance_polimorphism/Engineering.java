package inheritance_polimorphism;

public class Engineering extends Student {
	
	private String modules;
	private String coursetype;
	
	
	
	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public String getCoursetype() {
		return coursetype;
	}

	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}


	@Override
	public void studentGreet() {
	System.out.println("Hello i am Engineering Student");
	}
}
