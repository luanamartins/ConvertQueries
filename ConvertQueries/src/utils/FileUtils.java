package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class FileUtils {

	private static FileUtils instance = null;

	public static FileUtils getInstance() {
		if (instance == null) {
			instance = new FileUtils();
		}
		return instance;
	}

	public static String readFile(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));

		StringBuffer buffer = new StringBuffer();
		while (reader.ready()) {
			buffer.append(reader.readLine());
		}
		reader.close();
		return buffer.toString();

	}

}
