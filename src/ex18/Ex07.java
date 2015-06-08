package ex18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import tools.P;

public class Ex07 {
	static String input_file = "e://tmp//input.java";

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(input_file));
			String s;
			LinkedList<String> list = new LinkedList<String>();
			while ((s = br.readLine()) != null)
				list.add(s);

			Iterator<String> iterator = list.descendingIterator();
			while (iterator.hasNext())
				P.lnrint(iterator.next());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
