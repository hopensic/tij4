package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import tools.P;

public class Redirecting {
	static String input_file = "e://tmp//input.java";
	static String output_file = "e://tmp//test.out";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream conlole = System.out;
		try {
			BufferedInputStream in =
					new BufferedInputStream(new FileInputStream(input_file));
			PrintStream out =
					new PrintStream(new BufferedOutputStream(
							new FileOutputStream(output_file)));
			System.setIn(in);
			System.setOut(out);
			System.setErr(out);
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String s;
			while ((s = br.readLine()) != null)
				// P.lnrint(s);
				System.out.println(s);
			out.close();
			System.setOut(conlole);
			System.out.print(11111);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
