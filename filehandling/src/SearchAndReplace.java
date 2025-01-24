import java.io.*;

public class SearchAndReplace {
    public static void main(String[] args) {
       String old="run";

     String   newone="raniedd";
     String filedata="";
        try {

            BufferedReader fr = new BufferedReader(new FileReader("/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/copy.txt"));

            String s1;
            while ((s1 = fr.readLine()) != null) {

                    filedata+=s1+"\n";

            }

                System.out.println(filedata);
                String changed = filedata.replace(old, newone);


                BufferedWriter fw = new BufferedWriter(new FileWriter("/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/copy.txt"));
                fw.write(changed);
                fw.newLine();
                fw.close();


        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

