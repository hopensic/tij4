package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tools.P;

public class Echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader stdin =
				new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			while ((s = stdin.readLine()) != null && s.length() != 0)
				P.lnrint(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
