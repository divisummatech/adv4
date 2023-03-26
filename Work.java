package javaadvanced._4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            Files.createFile(MY_PATH);

            // Your code here

            private static void exercise1() {
                System.out.println("Exercise 1: ");
                String myString = """
            The quick brown fox jumps over the lazy dog
            """;

                try {
                    Files.write(MY_PATH, myString.getBytes());
                    System.out.println("File written successfully!");
                } catch (Exception exception) {
                    System.err.println("There was an error!");
                    exception.printStackTrace();
                    System.exit(0);
                }
            }

            //


            /**
             * 2:
             * Write a method that reads the file from exercise 1
             * then prints it out
             */
            private static void exercise2() {
                System.out.println("\nExercise 2: ");
                try {
                    List<String> lines = Files.readAllLines(MY_PATH);
                    for (String line : lines) {
                        System.out.println(line);
                    }
                } catch (Exception exception) {
                    System.err.println("There was an error!");
                    exception.printStackTrace();
                    System.exit(0);
                }


            }

            /**
             * 3:
             * Write a method that reads a file and print the number of lines in the file
             */
            private static void exercise3() {
                System.out.println("\nExercise 3: ");
                // Write code here to read the file and return the number of lines "\n", string.split

                try {
                    Path filePath = Paths.get("file.txt");
                    long lineCount = Files.lines(filePath).count();
                    System.out.println("The file has " + lineCount + " lines.");
                } catch (Exception exception) {
                    System.err.println("There was an error!");
                    exception.printStackTrace();
                    System.exit(0);
                }
            }

            /**
             * 4:
             * Write a method that reads a file and returns the number of words in the file
             *
             * Then deletes the previous file with Files.delete() use inside the try block
             *
             */
            private static void exercise4() {
                System.out.println("\nExercise 4: ");
                try {

                    String content = Files.readString(MY_PATH);

                    String[] words = content.split("\\s+");
                    System.out.println("Number of words in file: " + words.length);
//non capisco deletes the previous... cosa devo fare??
                } catch (Exception exception) {
                    System.err.println("There was an error!");
                    exception.printStackTrace();
                    System.exit(0);
                }
            }

            /**
             * 5:
             * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
             */
            private static void exercise5() {
                System.out.println("\nExercise 5: ");
                Path myDirectoryPath = Path.of("mydirectory");

                try {
                    Files.createDirectory(myDirectoryPath);
                    Files.writeString(myDirectoryPath.resolve(PATH_IN_A_FOLDER), "Why am I in a folder?");
                    Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
                } catch (Exception exception) {
                    System.err.println("There was an error!");
                    exception.printStackTrace();
                    System.exit(0);
                }
            }
        }