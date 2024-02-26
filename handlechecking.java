import java.io.*;

class Handle {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("myfile.txt");
            int k;

            while ((k = fis.read()) != -1) {
                System.out.println((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}