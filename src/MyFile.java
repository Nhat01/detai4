import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MyFile {

    private String fileName;

    public MyFile(){}

    public MyFile(String fileName){
        this.fileName = fileName;
    }

    public boolean addStr2File(String str){
        try {
            FileWriter fw = new FileWriter(this.fileName);
            // add str to the file.
            fw.write(str);
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }



    public boolean appendStr2File( String str){
        try{
            File file =new File(this.fileName);
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter    pw = new PrintWriter(bw);
            
            // append str to the file in new lines.
            pw.println(str);
            pw.close();
            
            return true;
            
            }catch(Exception e) {
                System.out.println(e);
                return false;
            }
    }







}
