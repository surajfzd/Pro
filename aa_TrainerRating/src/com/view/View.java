package com.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.bean.Trainer;
import com.service.FeedbackService;
import com.service.IFeedbackService;

public class View {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IFeedbackService service = new FeedbackService();

		Trainer trainer = new Trainer();
		while (true) {
			System.out.println("Choose option");
			System.out.println("1. Enter user details");
			System.out.println("2. Enter rating to view trainers");
			System.out.println("3. exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				/*
				 * System.out.println("Enter trainer name"); String name=sc.nextLine();
				 * trainer.setName(name);
				 * 
				 * System.out.println("Enter course name"); String course=sc.nextLine();
				 * trainer.setCourseName(course);
				 * 
				 * 
				 * 
				 * System.out.println("Enter Start date: "); String userInput=sc.nextLine();
				 * DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
				 * LocalDate date = LocalDate.parse(userInput, dateFormat);
				 * trainer.setStartDate(date);
				 * 
				 * System.out.println("Enter End date: "); String userInput2=sc.nextLine();
				 * dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy"); date =
				 * LocalDate.parse(userInput2, dateFormat); trainer.setEndDate(date);
				 * 
				 * System.out.println("Enter trainer rating"); int rating=sc.nextInt();
				 * trainer.setRating(rating);
				 */
				trainer = new Trainer("A", "asa", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 1), 2);
				service.addFeedback(trainer);
				Trainer trainer1 = new Trainer("B", "asa", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 1), 2);
				service.addFeedback(trainer1);
				Trainer trainer2 = new Trainer("C", "asa", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 1), 4);
				service.addFeedback(trainer2);
				Trainer trainer3 = new Trainer("D", "asa", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 1), 2);
				service.addFeedback(trainer3);
				System.out.println(trainer);
				System.out.println(trainer1);
				System.out.println(trainer2);
				System.out.println(trainer3);
				break;
			case 2:
				System.out.println("Enter rating");
				int rate = sc.nextInt();
				System.out.println(service.getTrainerList(rate));
				break;
			default:
				System.out.println("You entered wrong choice");

			}
		}

	}

}

// System.out.println("Enter Start date: ");
// System.out.println(" starting day: ");
// int d1=sc.nextInt();
// System.out.println(" starting month: ");
// int m1=sc.nextInt();
// System.out.println(" starting year: ");
// int y1=sc.nextInt();
//
// System.out.println("Enter end date: ");
// System.out.println(" starting day: ");
// int d2=sc.nextInt();
// System.out.println(" starting month: ");
// int m2=sc.nextInt();
// System.out.println(" starting year: ");
// int y2=sc.nextInt();
//
// LocalDate startDate=LocalDate.of(d1, m1, y1);
// trainer.setStartDate(startDate);
// LocalDate endDate=LocalDate.of(d2, m2, y2);
// trainer.setEndDate(endDate);
