import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;


import static java.nio.file.StandardCopyOption.*;

public class Main {
	public static void main(String[] args) throws IOException {
		if (args.length == 4) {
			int i = 0;
			String workspaceName = "defaultName";
			File configFile = new File("/Users/mderri/Desktop/java_CRUD_Framework/starter/configFile.txt");
			final Path fromPath = Paths.get("/Users/mderri/Desktop/java_CRUD_Framework/starter");

			if (configFile.createNewFile()) {
				System.out.println("File created: " + configFile.getName());
				FileWriter fillConfigFile = new FileWriter("/Users/mderri/Desktop/java_CRUD_Framework/starter/configFile.txt");
				for (String s : args) {
					fillConfigFile.write(s);
					fillConfigFile.write("\n");
					if (i == 3)
						workspaceName = new String(s);
					i++;
				}
				String newWorkspaceName = new String(workspaceName);
				fillConfigFile.close();

        		Files.walk(fromPath).forEach(source -> copySourceToDest(fromPath, source, newWorkspaceName));
				System.out.println("Workspace for CRUD created successefully in /Users/mderri/Desktop/" + workspaceName + " and ready to be used ");
				
			} else {
				System.out.println("File already exists.");
				System.exit(1);
			}
		}
		else {
			System.out.println("Usage : java Main <db username> <db password> <db host> <workspace name>");
		}
		
	}

	private static void copySourceToDest(Path fromPath, Path source, String workspaceName) {
        Path destination = Paths.get("/Users/mderri/Desktop/" + workspaceName, source.toString()
                                                      .substring(fromPath.toString()
                                                                         .length()));
        try {
            Files.copy(source, destination);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
