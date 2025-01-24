import java.io.*;

public class CountsofcharsWordsLines {
    public static void main(String[] args) throws IOException {


       // C:\Users\RevathiTannidi\IdeaProjects\java-eclipse\filehandling\src\output.txt



                FileReader fr=new FileReader("/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/output.txt");
        BufferedWriter fw= new BufferedWriter(new FileWriter("/Users/RevathiTannidi/IdeaProjects/java-eclipse/filehandling/src/dataofcouts.txt"));
                BufferedReader br=new BufferedReader(fr);
                int lines=0;
                int word=0;
                int characters=0;
                try
                {
                    String line;
                    while((line=br.readLine())!=null){
                        lines++;
                        characters+=line.length();
                        String[] words = line.split(" ");
                        word += words.length;
                    }
                    System.out.println(lines);
                    System.out.println(characters);
                    System.out.println(word);
                }


                catch (Exception e) {
                    throw new RuntimeException(e);
                }

// moving the file from one to another
                fw.write("lines are in another file "+lines);
                fw.write("\nwords in the another file "+word);
                fw.write("\ncharacters in the another file "+characters);
             fw.close();

            }

        }

