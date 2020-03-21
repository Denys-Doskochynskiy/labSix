package ua.lviv.iot;

public class TextRedactor {
	public String replaceNumbers(TextRedactor redactor, String text) {
		return text.replaceAll("—", "_").replaceAll("-", "_");
	}
}