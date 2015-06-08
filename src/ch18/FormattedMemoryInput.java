package ch18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import tools.P;

public class FormattedMemoryInput {
	static String input_file = "e://tmp//input.java";

	public static void main(String[] args) {
		try {
			DataInputStream in =
					new DataInputStream(new ByteArrayInputStream(
							BufferedInputFile.read(input_file).getBytes()));
			while (true)
				P.rint((char) in.readByte());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
