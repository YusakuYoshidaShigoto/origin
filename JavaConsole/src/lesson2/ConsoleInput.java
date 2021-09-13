package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
	BufferedReader buf = new BufferedReader(
			new InputStreamReader(System.in));

	public String getConsole(String outputConsole) throws IOException {
		System.out.println(outputConsole);

		String inputValue = buf.readLine();

		return inputValue;
	}
}
