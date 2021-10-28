package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream foutPipe = new FileOutputStream("C:\\Users\\Cashify\\Desktop\\test.txt");
			foutPipe.write(50);
			foutPipe.close(); //closing the pipe
			System.out.println("Success...");
			
		
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}//   \\is escape sequence \"
		
	}

}
