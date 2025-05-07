package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class StandardOptionSample {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("./resources/writersample.txt");
//		Files.writeString(p, "Hello World", StandardOpenOption.CREATE_NEW,);//  java.nio.file.FileAlreadyExistsException: ./resources/writersample.txt
		Files.writeString(p, "Hello World", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		Files.writeString(p, "Added 2nd Time", StandardOpenOption.APPEND);
		Files.writeString(p, "Added 3rd Time", StandardOpenOption.APPEND);
//		Files.writeString(p, "Added 4th Time", StandardOpenOption.READ); java.lang.IllegalArgumentException: READ not allowed
	}
	
}
