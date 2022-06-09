import java.io.File;

public class main {


    public static void main(String[] args) {
        File folder = new File("C:\\com.josephvanderzwart\\images\\dogs2022");
        buildFile build = new buildFile();
        build.setupFile();
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
        build.addSuffix();
        build.saveAndClose();
    }

    public static boolean isJPG(File inFile) {
        return inFile.getName().contains(".jpg");
    }

}
