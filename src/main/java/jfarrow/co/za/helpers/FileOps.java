package jfarrow.co.za.helpers;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOps {
    public static String readTorrentFile(String path) {
        Path torrentFilePath = Paths.get(path);
        byte[] bytes = {};
        try {
            bytes = Files.readAllBytes(torrentFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
