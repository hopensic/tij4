package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	static String output_file = "e://tmp//out.txt";
	static String input_file = "e://tmp//input.java";

	public static void main(String[] args) throws IOException {
		BufferedReader in =
				new BufferedReader(new StringReader(
						BufferedInputFile.read(input_file)));
		PrintWriter out =
				new PrintWriter(new BufferedWriter(new FileWriter(output_file)));
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null)
			out.println(lineCount++ + ":" + s);
		out.close();
	}

}
