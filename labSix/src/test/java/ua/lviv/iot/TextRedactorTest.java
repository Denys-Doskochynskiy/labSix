package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TextRedactorTest {
	private String text;

	@Test
	public void replaceNumberTest() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pleas type your sentence");
		text = scanner.nextLine();
		TextRedactor redactor = new TextRedactor();
		assertEquals("«KAZKA» _ український музичний гурт, який виконує поп_музику з елементами електро_фолку.",
				redactor.replaceNumbers(redactor, text));
		System.out.println("_ _ _ _ _Your text after redactor_ _ _ _ _");
		System.out.println(redactor.replaceNumbers(redactor, text));
		scanner.close();
	}
	//«KAZKA» — український музичний гурт, який виконує поп-музику з елементами електро-фолку.
	
}