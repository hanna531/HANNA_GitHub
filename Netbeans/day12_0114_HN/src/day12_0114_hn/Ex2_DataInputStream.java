package day12_0114_hn;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2_DataInputStream {

    private String path;

    public Ex2_DataInputStream() {
        path = "C:\\bigdatastudy\\java\\demo\\ex2_data.txt";
    }

    public void printDataStream() throws IOException {

        DataInputStream fis;
        try {
            fis = new DataInputStream(new FileInputStream(path));
            fis.readInt();
            fis.readBoolean();
            fis.readChar();
            fis.readFloat();
            fis.readUTF();
            System.out.println(fis.readInt()+"\t"+fis.readBoolean()+"\t"+fis.readChar()+"\t"+fis.readFloat()+"\t"+fis.readUTF());
        } catch (FileNotFoundException ex) {
        }

    }

    public static void main(String[] args) throws IOException {
        new Ex2_DataInputStream().printDataStream();
    }

}
