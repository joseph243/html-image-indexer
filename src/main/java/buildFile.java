import java.io.PrintWriter;

public class buildFile {

    private String bigString = "";
    private PrintWriter writer;

    public void setupFile(String inPath, String inHTMLName){
        try {
            writer = new PrintWriter(inPath + "\\" + inHTMLName, "UTF-8");
        }
        catch (Exception e) {
            System.out.println("error initializing file:" + e);
        }
    }

    public void addLineBreak() {
        bigString += htmValues.lineBreak;
    }

    public void addPrefix() {
        bigString += htmValues.filePrefix;
    }

    public void addFile(String inFileName) {
        String line = htmValues.imgPrefix + inFileName + htmValues.imgSuffix;
        bigString += line;
    }

    public void addSuffix() {
        bigString += htmValues.fileSuffix;
    }

    public void saveAndClose() {
        writer.println(bigString);
        writer.close();
    }



}
