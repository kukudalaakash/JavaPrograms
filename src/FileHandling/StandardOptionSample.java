package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class StandardOptionSample {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("./resources/writersample.txt");
		Files.writeString(p, "Hello/n World", StandardOpenOption.CREATE);
	}
}
