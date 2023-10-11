package com.jdc.chat;

import java.util.Scanner;

/**
 * 
 */
public class ChatController {

	private Scanner scanner;

	private ChatBot bot;
	
	public ChatController() {
		this.bot = new ChatBot();
	}

	public void start() {
		showWelcomeMessage();

		while (true) {
			var userInput = getUserInput();

			if ("exit".equalsIgnoreCase(userInput)) {
				break;
			}else { 
			var message = bot.talk(userInput);
			System.out.println("Bot > %S".formatted(message));
			}
		}
		showEndMessage();

	}

	private void showWelcomeMessage() {

		System.out.println("""
				===========================
				Welcome to Chat bot Program
				===========================
				""");

	}

	private String getUserInput() {
		System.out.print("You >");
		scanner = new Scanner(System.in);
        return scanner.nextLine();

	}

	/**
	 * 
	 */
	private void showEndMessage() {
		System.out.println("""
				===========================
				Thanks for using my program!
				===========================
				""");

	}

}