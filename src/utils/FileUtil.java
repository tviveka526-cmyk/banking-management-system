package utils;

import java.io.*;

/**
 * Utility class for file operations
 */
public class FileUtil {
    
    /**
     * Write content to file
     */
    public static void writeToFile(String fileName, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(content);
        }
    }
    
    /**
     * Read content from file
     */
    public static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
    
    /**
     * Check if file exists
     */
    public static boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }
    
    /**
     * Delete file
     */
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        return file.delete();
    }
}
