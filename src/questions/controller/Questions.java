package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner scan;
	
	public Questions()
	{
		scan = new Scanner(System.in);
	}
	
	public void start()
	{
		//askQuestions();
		askQuestionsGUI();
		//moreQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What would you like to eat?");
		String answer = scan.nextLine();
		if(answer.equals("nothing"))
		{
			System.out.println("Well that's not very healthy!");
		}
		else
		{
		System.out.println("Wow, "+ answer +" sounds like a great meal!");
		}
		System.out.println("Where do you work?");
		answer = scan.nextLine();
		System.out.println("Nice! "+ answer +" sounds like a great place to work!");
		System.out.println("What is your favorite video game?");
		answer = scan.nextLine();
		System.out.println("Cool, "+ answer +" is a fantastic video game!");
		System.out.println("What is your favorite sport?");
		answer = scan.nextLine();
		if(answer.equals("soccer"))
		{
			System.out.println("Awe.. That's a bummer..");
		}
		else
		{
			System.out.println("Great! "+ answer +" is a very fun sport :D");
		}
	}
		
		private void askQuestionsGUI()
		{
			String myAnswer = JOptionPane.showInputDialog(null, "What do you want for breakfast?");
			JOptionPane.showMessageDialog(null, "Oh is that so? I do not think that " + myAnswer + " is a good choice");
			String myAnswer2 = JOptionPane.showInputDialog(null, "What is your favorite video game?");
			JOptionPane.showMessageDialog(null, "Oh nice! " + myAnswer2 + " is a great game! My favorite is Halo 3");
			myAnswer = JOptionPane.showInputDialog(null, "What is your favorite sport?");
			if(myAnswer.equals("soccer"))
			{
				JOptionPane.showMessageDialog(null, "Eww "+ myAnswer + " is a boring sport");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Nice! "+ myAnswer + " is a fantastic sport! :D");
			}
			myAnswer = JOptionPane.showInputDialog(null, "What is your favorite car?");
			JOptionPane.showMessageDialog(null, "Cool! "+ myAnswer + " is a wonderful car!");
			
		}
		
		private void moreQuestions()
		{
			System.out.println("What is your favorite number?");
			int answer2 = scan.nextInt();
			System.out.println("Nice! "+ answer2 +" is a great number!");
			System.out.println("What is your least favorite number?");
			answer2 = scan.nextInt();
			System.out.println("I dont like "+ answer2 + " either");
			System.out.println("How old are you?");
			answer2 = scan.nextInt();
			System.out.println("Cool!");
			System.out.println("How old is you grandpa?");
			answer2 = scan.nextInt();
			System.out.println("Wow, He is old!");
			System.out.println("What is 10 plus 7?");
			answer2 = scan.nextInt();
			if(answer2 == 17)
			{
				System.out.println("WOW, you are a genius!");
			}
			else
			{
				System.out.println("Wrong, you really have to work on your math skills...");
			}
			
		}

}
