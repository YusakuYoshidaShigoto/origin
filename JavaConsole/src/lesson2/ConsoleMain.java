package lesson2;

import java.io.IOException;

public class ConsoleMain {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		ConsoleInput ci = new ConsoleInput();

		String inputValue = ci.getConsole(args[0]);

		System.out.println(args[1] + inputValue);
	}

}
