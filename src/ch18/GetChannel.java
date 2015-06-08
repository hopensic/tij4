package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
	static String output_file = "e://tmp//data.txt";
	private static final int BSIZE = 1024;

	public static void main(String[] args) {
		// Write a file:
		try {
			FileChannel fc = new FileOutputStream(output_file).getChannel();
			fc.write(ByteBuffer.wrap("Some text".getBytes()));
			fc.close();
			// 写到文件的结尾
			fc = new RandomAccessFile(output_file, "rw").getChannel();
			fc.position(fc.size());
			fc.write(ByteBuffer.wrap("Some more".getBytes()));
			fc.close();
			fc = new FileInputStream(output_file).getChannel();
			ByteBuffer buff = ByteBuffer.allocate(BSIZE);
			fc.read(buff);
			buff.flip();
			while (buff.hasRemaining()) {
				System.out.print((char) buff.get());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
