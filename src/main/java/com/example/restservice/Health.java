package com.example.restservice;

public class Health {

    private  String revision;
    private  String status;
    private  String version;

    public Health(String revision, String status, String version) {
        this.revision = revision;
        this.status = status;
        this.version = version;
    }

    public String getRevision() {
        return revision;
    }
    public String getStatus() {
        return status;
    }
    public String getVersion() {
        return version;
    }

}
