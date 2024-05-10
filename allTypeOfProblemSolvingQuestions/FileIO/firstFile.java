import java.io.File;
import java.io.FileWriter;

public class firstFile {
    public static void main(String[] args) {
        // try{
        //     File myfile=new File("myfirstfile.txt");
        //     myfile.createNewFile();
        //     } catch (Exception e) {
        //        System.out.println("file not created");
        //        e.printStackTrace();
        //     }
    
   try {
    FileWriter filewriter=new FileWriter("myfirstfile.txt");
    filewriter.write("this is my first file which i write\n okay its done ");
    filewriter.close();

    
   } catch (Exception e) {
    System.out.println("this is not writed");
  }
}

// try {
//     File myFile=new File("myfirstfile.txt");
//    if(myFile.delete()){
//     System.out.println("Sucessfully delete this file");
//    }else{
//     System.out.println("Enable to delete file");
//    }
// } catch (Exception e) {
//     e.getMessage();
// }
   
}