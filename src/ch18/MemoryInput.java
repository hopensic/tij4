package ch18;

import java.io.IOException;
import java.io.StringReader;

import tools.P;

public class MemoryInput {
	static String input_file = "e://tmp//input.java";

	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(BufferedInputFile.read(input_file));
		int c;
		while ((c = in.read()) != -1)
			P.rint((char) c);
	}

}
