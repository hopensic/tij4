package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import tools.P;

public class StoringAndRecoveringData {
	static String output_file = "e://tmp//Data.txt";

	public static void main(String[] args) {
		try {
			DataOutputStream out =
					new DataOutputStream(new BufferedOutputStream(
							new FileOutputStream(output_file)));
			out.writeDouble(3.14159);
			out.writeUTF("That was pi");
			out.writeDouble(1.41413);
			out.writeUTF("Square root of 2");
			out.close();
			DataInputStream in =
					new DataInputStream(new BufferedInputStream(
							new FileInputStream(output_file)));
			P.lnrint(in.readDouble());
			P.lnrint(in.readUTF());
			P.lnrint(in.readDouble());
			P.lnrint(in.readUTF());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
