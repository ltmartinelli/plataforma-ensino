package application;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> lessonList = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Dados da " + i + "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t): ");
			char lessonType = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Título: ");
			String title = sc.nextLine();

			if (lessonType == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				System.out.println();
				Lesson lesson = new Video(title, url, seconds);
				lessonList.add(lesson);

			} else {
				System.out.print("Descrição da tarefa: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de Questões: ");
				int questionCount = sc.nextInt();
				System.out.println();
				Lesson lesson = new Task(title, description, questionCount);
				lessonList.add(lesson);
			}

		}

		sc.close();
		totalDuration(lessonList);

	}

	public static void totalDuration(List<Lesson> lessonList) {

		int totalDuration = 0;

		for (Lesson lesson : lessonList) {
			totalDuration += lesson.duration();
		}

		System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " SEGUNDOS");

	}

}
