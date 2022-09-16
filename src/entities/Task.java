package entities;

public class Task extends Lesson {

	String description;
	int questionCount;

	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}

	@Override
	public int duration() {
		return 60 * (questionCount * 5);
	}

}
