public class Main {
    public static void main(String[] args) {
        FileManager fm = new FileManager("160255006");
        fm.createFile();
        fm.updateFile();
        try {
            Thread.sleep(5000);
            fm.deleteFile();
        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
