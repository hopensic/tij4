package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TransferTo {
	static String in_file = "e://tmp//data.txt";
	static String out_file = "e://tmp//data_output.txt";
	private static final int BSIZE = 1024;

	public static void main(String[] args) {
		FileChannel in;
		try {
			in = new FileInputStream(in_file).getChannel();
			FileChannel out = new FileOutputStream(out_file).getChannel();
			in.transferTo(0, in.size(), out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
