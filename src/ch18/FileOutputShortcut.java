package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import tools.P;

public class FileOutputShortcut {
	static String input_file = "e://tmp//input.java";
	static String output_file = "e://tmp//FileOutputShortcut.out";

	public static void main(String[] args) {
		try {
			BufferedReader br =
					new BufferedReader(new StringReader(
							BufferedInputFile.read(input_file)));
			PrintWriter out = new PrintWriter(output_file);
			int lineCount = 1;
			String s;
			while ((s = br.readLine()) != null)
				out.print(lineCount++ + ": " + s);
			out.close();
			P.lnrint(BufferedInputFile.read(input_file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
