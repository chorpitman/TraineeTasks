package yfain.downloadfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Download {
    public static void main(String args[]) throws IOException {
        if (args.length != 2) {
            System.out.println("Proper Usage: java FileDownload SourceFileURL OutputFileName");
            System.exit(-1);
        }
        URLConnection fileStream = null;
        URL remoteFile = new URL(args[0]);
        fileStream = remoteFile.openConnection();
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
        InputStream inputStream = fileStream.getInputStream();
        int data;
        System.out.println("Starting the downloadfile from: " + args[0]);
        while ((data = inputStream.read()) != -1) {
            fileOutputStream.write(data);
        }
        System.out.println(("Finished downloading the file " + args[1]));

    }
}
