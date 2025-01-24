import java.io.*;


public class MergeFile {
    public static void main(String[] args) throws IOException {
        String[] files= {
                "/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/output.txt",
                "/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/movies.txt",
                "/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/numbers.txt",
                "/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/alphabets.txt"
        };
String line;
        BufferedWriter fw= new BufferedWriter(new FileWriter("/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/merge.txt"));
for(String filetoMerge:files) {
    BufferedReader fr = new BufferedReader(new FileReader(filetoMerge));


    while ((line = fr.readLine()) != null) {
        fw.write(line );
        fw.newLine();
    }
}
        fw.close();
    }
}
