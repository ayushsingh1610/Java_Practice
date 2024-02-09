// Write a Java program to get specific files with extensions from a specified folder.
import java.io.*;
public class code04 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("C:\\Users\\good\\Documents\\Temporary");
        
        System.out.print("Enter the extension = ");
        String extension = br.readLine();

        String str[] = f.list(new FilenameFilter()  {
            @Override
            public boolean accept(File f, String file) {                // Used to check the file in the directory and return true if it exists.
                if(file.endsWith(extension))                            //so that we can check the specific file extension.
                return true;

                return false;
            }
        });

        for (String string : str) {
            System.out.println(string);
        }
        
    }
}
