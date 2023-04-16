package IOpackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	FileReader in = null;
	FileWriter out = null;
	
	public CharacterStream() throws IOException {
		try {
			in = new FileReader("E:\\javafiles\\input.txt");
			in = new FileReader("E:\\javafiles\\input.txt");
			int ch;
			while (( ch = in.read()) != -1) {
				out.write(ch);
			}
			
		} catch (IOException ex0 ) {
			
		} finally {
			in.close();
			out.close();
		}
	}
}
