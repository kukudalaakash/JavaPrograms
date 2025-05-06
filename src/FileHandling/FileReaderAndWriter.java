package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileReaderAndWriter {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("./resources/sample.txt");
		System.out.println(path.toAbsolutePath());
		List<String> lines = Files.readAllLines(path);
		System.out.println(lines);
		Files.lines(path).forEach(System.out::println);
		Path writepath = Path.of("./resources/writesample.txt");
		Files.writeString(writepath, "Akash\n");
		Files.write(writepath, lines, StandardOpenOption.APPEND);

	}
}
