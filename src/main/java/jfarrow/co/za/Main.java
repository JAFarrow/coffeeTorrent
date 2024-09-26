package jfarrow.co.za;

import java.util.ArrayList;
import java.util.HashMap;

import gyurix.bencoder.BEncoder;
import jfarrow.co.za.helpers.FileOps;
import jfarrow.co.za.helpers.TypeConversion;

public class Main {
    public static void main(String[] args) {
        String torrentContents = FileOps.readTorrentFile("src/main/resources/test.torrent");
        BEncoder be = new BEncoder(torrentContents);
        ArrayList<Object> contents = be.readAll();
        HashMap<String, Object> contentDict = TypeConversion.objectToHashMap(contents.get(0));
        HashMap<String, Object> infoDict = TypeConversion.objectToHashMap(contentDict.get("info"));
        String pieces = (String) infoDict.get("pieces");
        System.out.println(pieces);
        be.resetOutput();
    }
}