package entities;

public abstract class Lesson {

	String title;

	public Lesson(String title) {
		this.title = title;
	}

	public abstract int duration();

}
