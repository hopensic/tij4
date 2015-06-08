package ch18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import tools.P;

public class BufferedInputFile {
	static String input_file = "e://tmp//input.java";
	public static String read(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while ((s = in.readLine()) != null) {
			sb.append(s + "\n");
		}
		in.close();
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		P.lnrint(read(input_file));

	}

}
