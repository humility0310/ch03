package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		// 기반스트림(표준입력 system.in(byte 기반))
		// 보조스트림(바이트->char로)
		BufferedReader br = null;
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");

			br = new BufferedReader(isr);

			String inputLine = null;
			while ((inputLine = br.readLine()) != null) {
				if ("exit".equals(inputLine) == true) {
					return;
				}

				System.out.println(">>" + inputLine);
			}
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("error:" + e);
			}
		}
	}

}
