package ch03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반스트림(파일리더)
			FileReader fr = new FileReader("./src/ch03/BufferedReaderTest.java");
			// 보조스트림(버퍼드리더)
			br = new BufferedReader(fr);

			String line = null;
			int index = 0;
			while ((line = br.readLine()) != null) {
				System.out.print(++index);
				System.out.print(":");
				System.out.print(line);
				System.out.print("\n");
			}
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("error : " + e);

			}
		}
	}

}
