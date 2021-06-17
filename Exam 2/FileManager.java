import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    String path = "C:/Medipol";
    String studentNumber;
    String fileContent = "";

    public FileManager(String studentNumber){
        this.studentNumber = studentNumber;
        this.fileContent = this.studentNumber + " için bu klasör oluşturulmuştur!";
    }

    /**
     * Verilen öğrenci numarasına göre dosya oluşturur. İlgili
     * dosya {@link #path} klasörü altında oluşturulur.
     * @return Dosya oluşturuldu mu?
     */
    public boolean createFile(){
        drawPath();
        File file = new File(getFilePath());
        try {
            if(file.createNewFile()) return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * {@link #path} yolunun altında belirtilen ilgili öğrenci
     * dosyasına {@link #fileContent} içeriğini ekler.
     * @return Dosya güncellendi mi?
     */
    public boolean updateFile(){
        try {
            FileWriter fileWriter = new FileWriter(getFilePath());
            fileWriter.write(studentNumber);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * {@link #path} yolunun altında belirtilen ilgili öğrenci
     * dosyasını siler.
     * @return Dosyanın silindi mi?
     * @throws FileNotFoundException Dosya bulunamaz ise fırlatılır.
     */
    public boolean deleteFile() throws FileNotFoundException {
        File file = new File(getFilePath());
        if(file.exists()) return file.delete();
        else throw new FileNotFoundException("File not found!");
    }

    /**
     * {@link #path} değişkeninde bulunan yolda var olmayan
     * klasörleri oluşturur.
     */
    private void drawPath(){
        String[] directories = path.split("/");
        String path = "";
        for (int i = 0; i < directories.length; i++){
            path += directories[i] + "/";
            File directoryObject = new File(path);
            if(!directoryObject.exists()) directoryObject.mkdir();
        }
    }

    /**
     * Oluşturulacak dosyanın ismini Absolute Path olarak verir.
     * @return Oluşturulacak dosyanın yolu
     */
    private String getFilePath(){
        return path + "/" + studentNumber + ".txt";
    }
}
