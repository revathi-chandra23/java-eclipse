import java.io.*;



public class CopyFileToAnother {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader fr= new BufferedReader(new FileReader("/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/output.txt"));
        BufferedWriter fw= new BufferedWriter(new FileWriter("/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/copy.txt"));
        while((line=fr.readLine())!=null) {
            fw.write(line+"\n");
        }
        fw.close();
    }
}
