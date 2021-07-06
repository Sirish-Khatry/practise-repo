package generics;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {
	
	private List<T> entitys = new ArrayList<T>();
	
	
	public Cage(List<T> entitys) {
		super();
		this.entitys = entitys;
	}

	public Cage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void add(T entity) {
		
		entitys.add(entity);
	}
	
	public Animal get() {	
		
		for(Animal a : entitys) {
		
		return a;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Cage [entitys=" + entitys + ", get()=" + get() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	
}