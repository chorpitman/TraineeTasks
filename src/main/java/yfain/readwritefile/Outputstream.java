package yfain.readwritefile;

import java.io.*;

class Outputstream {
    public static void main(String[] args) throws IOException {
        String text = "Kiss my 46546546 tuhins from papirus!!!";
        FileOutputStream fileOutputStream = new FileOutputStream("testOutputwriter.txt");

        Writer out = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "UTF8"));

        out.write(text);
        out.flush();
        out.close();
    }
}
