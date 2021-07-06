package generics;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {
	
private T entitys;

//	private List<T> entitys = new ArrayList<T>();
	
	
	public Cage(T entitys) {
		super();
		this.entitys = entitys;
	}

	public Cage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void add(T entity) {
		
		this.entitys = entity;
	}
	
	public String get() {	
		
		return this.entitys.getName();
	}

	@Override
	public String toString() {
		return "Cage [entitys=" + entitys + ", get()=" + get() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	
}