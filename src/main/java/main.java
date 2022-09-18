import java.io.File;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===HTML IMAGE INDEXER START===");
        System.out.println("this will build an .html file of all images in a directory");
        System.out.print("INPUT WORKING PATH: ");
        String path = in.nextLine();
        System.out.print("INPUT DESIRED HTML FILE NAME, NO FILE EXTENSION: ");
        String htmlName = in.nextLine();
        System.out.println("trying: " + path);

        File folder = new File(path);

        buildFile build = new buildFile();
        build.setupFile(path, htmlName);
        build.addPrefix();
        int i = 0;
        for (File a : folder.listFiles()) {
            if (isJPG(a)) {
                System.out.println("Adding file: " + a.getName());
                build.addFile(a.getName());
            }
//            if (i % 2 == 0) {
//                build.addLineBreak();
//            }
            i++;
        }
        System.out.println("Added " + i + " images to the new file.  Finishing file...");
        build.addSuffix();
        build.saveAndClose();
        System.out.println("File finished and saved:");
        System.out.println(path + " \\ " + htmlName);
        System.out.print("End");
        in.nextLine();
    }

    public static boolean isJPG(File inFile) {
        return (inFile.getName().contains(".JPG")
                || inFile.getName().contains(".jpg"));
    }

}
