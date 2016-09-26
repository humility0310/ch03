package ch03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			// 기반스트림 (소스에 연결)
			FileOutputStream fos = new FileOutputStream("01234.txt");
			// 보조스트림(기반스트림)
			for (int i = '0'/* 아스키로 48 */; i <= '9'/* 아스키로57 */; i++) {
				bos = new BufferedOutputStream(fos, 5);// 버퍼가
				// 5가 되면
				// 플러쉬
				bos.write(i);
				bos.flush();// 내부버퍼비움(파일에쓰기)
			}
		} catch (FileNotFoundException e) {
			System.out.println("error : " + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
