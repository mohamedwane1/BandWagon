import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	int chelsea;
	int arsenal;
	int manCity;
	int manUtd;
	int liverpool;
	int juventus;
	int barca;
	int realMadrid;
	int bayern;
	int firstMatch;
	int secondMatch;
	int thirdMatch;
	int choice;
	String[] favTeams;
	int[] match;
	String favTeam;
	ArrayList<Integer> teams;
	Main() {
		chelsea = 0;
		arsenal = 0;
		manCity = 0;
		manUtd = 0;
		liverpool = 0;
		juventus = 0;
		barca = 0;
		realMadrid = 0;
		bayern = 0;
		firstMatch = 0;
		secondMatch = 0;
		thirdMatch = 0;
		teams = new ArrayList<Integer>();
		favTeams = new String[3];
		match = new int[3];
	}
	public static void printLine() {
		String line = "";
		for (int i = 0; i <= 120; i++) {
			line += "-";
		}
		System.out.println(line);
	}
	public void firstQuestion() {
		String input = "";
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		while (!isValid) {
		System.out.println("What style of play do you prefer?");
		System.out.println("A) Attacking \nB) Defensive\nC) A bit of both");
		input = sc.next();
		if (input.equalsIgnoreCase("a")) {
			isValid = true;
			arsenal++;
			manCity++;
			liverpool++;
		}
		else if (input.equalsIgnoreCase("b")) {
			isValid = true;
			chelsea++;
			manUtd++;
			juventus++;
		}
		else if (input.equalsIgnoreCase("c")) {
			isValid = true;
			barca++;
			realMadrid++;
			bayern++;
		}
		else {
			System.out.println("Sorry, '" + input + "' is not a valid input. Please try again.");
			printLine();
		}
		}
	}
	
public void secondQuestion() {
	String input = "";
	Scanner sc = new Scanner(System.in);
	boolean isValid = false;
	while (!isValid) {
	System.out.println("What matters more?");
	System.out.println("A) A rich history\nB) Current success\nC) both are important");
	input = sc.next();
	if (input.equalsIgnoreCase("a")) {
		isValid = true;
		manUtd++;
		arsenal++;
		liverpool++;
	}
	else if (input.equalsIgnoreCase("b")) {
		isValid = true;
		chelsea++;
		manCity++;
	}
	else if (input.equalsIgnoreCase("c")) {
		isValid = true;
		barca++;
		realMadrid++;
		bayern++;
		juventus++;
	}
	else {
		System.out.println("Sorry, '" + input + "' is not a valid input. Please try again.");
		printLine();
	}
	}
}
	public void thirdQuestion(){
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isValid = false;
		while (!isValid) {
		System.out.println("What is more important?");
		System.out.println("A) A great atmosphere in the stands\nB) Success on the pitch");
		input = sc.next();
		if (input.equalsIgnoreCase("a")) {
			isValid = true;
			manUtd++;
			liverpool++;
			bayern++;
			barca++;
			juventus++;
		}
		else if (input.equalsIgnoreCase("b")) {
			isValid = true;
			chelsea++;
			manCity++;
			realMadrid++;
			arsenal++;
		}
		else {
			System.out.println("Sorry, '" + input + "' is not a valid input. Please try again.");
			printLine();
		}
		}
	}
	
	public void fourthQuestion() {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isValid = false;
		while (!isValid) {
		System.out.println("How important is it that your team wins it all this season?");
		System.out.println("A) Very important. the season would be a failure otherwise!"
				+ "\nB) Not that important."
				+ " As long as the players give it their all it won't be the end of the world!");
		input = sc.next();
		if (input.equalsIgnoreCase("a")) {
			isValid = true;
			manUtd++;
			bayern++;
			juventus++;
			realMadrid++;
			manCity++;
		}
		else if (input.equalsIgnoreCase("b")) {
			isValid = true;
			arsenal++;
			liverpool++;
			barca++;
			chelsea++;
		}
		else {
			System.out.println("Sorry, '" + input + "' is not a valid input. Please try again.");
			printLine();
		}
		}
	}
	
	public void fifthQuestion() {
		Scanner sc = new Scanner(System.in);
		String input;
		boolean isValid = false;
		while (!isValid) {
		System.out.println("How often do you plan on watching your team?");
		System.out.println("A) Whenever they're playing.\n"
				+ "B) I'll watch them once in a while but it won't be my top priority.\n"
				+ "C) Probably not that often, I'll only watch the big games.");
		input = sc.next();
		if (input.equalsIgnoreCase("a")) {
			isValid = true;
			chelsea++;
			liverpool++;
			arsenal++;
		}
		else if (input.equalsIgnoreCase("b")) {
			isValid = true;
			manUtd++;
			barca++;
			manCity++;
		}
		else if (input.equalsIgnoreCase("c")) {
			isValid = true;
			realMadrid++;
			bayern++;
			juventus++;
		}
		else {
			System.out.println("Sorry, '" + input + "' is not a valid input. Please try again.");
			printLine();
		}
		}
	}
	
	public void findResults() {
		teams.add(chelsea);
		teams.add(arsenal);
		teams.add(manCity);
		teams.add(manUtd);
		teams.add(liverpool);
		teams.add(juventus);
		teams.add(barca);
		teams.add(realMadrid);
		teams.add(bayern);
		for (int i = 0; i < favTeams.length; i++) {
		int max = Collections.max(teams);
		match[i] = max*100/5;
		int maxIndex = 0;
		for (int j = 0; j < teams.size(); j++) {
			if (teams.get(j) == max) {
				maxIndex = j;
				teams.set(j, 0);
				break;
			}
		}
		if (maxIndex == 0) favTeams[i] = "Chelsea F.C";
		else if (maxIndex == 1) favTeams[i] = "Arsenal F.C";
		else if (maxIndex == 2) favTeams[i] = "Manchester City F.C";
		else if (maxIndex == 3) favTeams[i] = "Manchester United F.C";
		else if (maxIndex == 4) favTeams[i] = "Liverpool F.C";
		else if (maxIndex == 5) favTeams[i] = "Juventus";
		else if (maxIndex == 6) favTeams[i] = "F.C Barcelona";
		else if (maxIndex == 7) favTeams[i] = "Real Madrid S.C";
		else if (maxIndex == 8) favTeams[i] = "F.C Bayern Munchen";
		}
	}
	public static void main(String[] args) {
		Main user1 = new Main();
		Scanner sc = new Scanner(System.in);
		boolean isValid = true;
		printLine();
		System.out.println("Welcome to the BandWagon!");
		printLine();
		user1.firstQuestion();
		printLine();
		user1.secondQuestion();
		printLine();
		user1.thirdQuestion();
		printLine();
		user1.fourthQuestion();
		printLine();
		user1.fifthQuestion();
		printLine();	
		System.out.println("The results are in: ");
		user1.findResults();
		System.out.println("1. " + user1.favTeams[0] + " (" + user1.match[0] + "% match)"
		+ "\n2. " + user1.favTeams[1] + " (" + user1.match[1] + "% match)"  
		+ "\n3. "+ user1.favTeams[2] + " (" + user1.match[2] + "% match)");
		do {
		printLine();
		System.out.println("Which team would you like to support?");
		user1.choice = sc.nextInt();
		if (user1.choice == 1) {
			isValid = true;
			user1.favTeam = user1.favTeams[0];
		}
		else if (user1.choice == 2) {
			isValid = true;
			user1.favTeam = user1.favTeams[1];
		}
		else if (user1.choice == 3) {
			isValid = true;
			user1.favTeam = user1.favTeams[2];
		}
		else {
			isValid = false;
			System.out.println("That is not a valid choice. Please try again.");
		}
		}while (!isValid);
		printLine();
		System.out.println("You picked " + user1.favTeam + "! Welcome to the club!");
		sc.close();
	}

}
