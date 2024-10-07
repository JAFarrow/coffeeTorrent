package jfarrow.co.za.metainfo;

import java.util.HashMap;

public class TorrentMeta {
    private String bencodedMeta;
    private String announceURL;
    private String bencodedInfoDict;

    public TorrentMeta(String torrentFileContents, HashMap<String, Object> decodedMeta) {
        this.bencodedMeta = torrentFileContents;
        this.announceURL = (String) decodedMeta.get("announce");
        this.bencodedInfoDict = decodedMeta.get("info").toString();
    }


    public String getBencodedMeta() {
        return bencodedMeta;
    }



    public void setBencodedMeta(String bencodedMeta) {
        this.bencodedMeta = bencodedMeta;
    }


    public String getAnnounceURL() {
        return announceURL;
    }


    public void setAnnounceURL(String announceURL) {
        this.announceURL = announceURL;
    }


    public String getBencodedInfoDict() {
        return bencodedInfoDict;
    }


    public void setBencodedInfoDict(String bencodedInfoDict) {
        this.bencodedInfoDict = bencodedInfoDict;
    }

}
