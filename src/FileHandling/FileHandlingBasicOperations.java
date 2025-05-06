package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class FileHandlingBasicOperations {
	public static void main(String[] args) throws IOException {
		Path curDir = Paths.get("./");
		// Files.list(curDir).forEach(System.out::println);
		// Files.walk(curDir, 3).filter(e ->
		// e.toString().contains(".java")).forEach(System.out::println);
//		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> path.toString().contains(".java");
//		Files.find(curDir, 4, matcher).forEach(System.out::println);
		BiPredicate<Path, BasicFileAttributes> dirmatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(curDir, 2, dirmatcher).forEach(System.out::println);
}
}
