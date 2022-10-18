package com.example.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Profile")
public class Profile {

    //Primary Key
    @PrimaryKey(autoGenerate = true)
    private int keys;

    @ColumnInfo(name = "username")
    private String username;

    @ColumnInfo(name = "password")
    private String password;

    @ColumnInfo(name = "server")
    private String server;

    @ColumnInfo(name = "port")
    private String port;

    @ColumnInfo(name = "protocol")
    private String protocol;

    @ColumnInfo(name = "hostServer")
    private String hostServer;

    public Profile(int keys, String username, String password, String server, String port, String protocol, String hostServer){
        this.keys =keys;
        this.username = username;
        this.server = server;
        this.port = port;
        this.protocol = protocol;
        this.hostServer = hostServer;
    };

    @Ignore
    public Profile(String username, String password, String server, String port, String protocol, String hostServer){
        this.username = username;
        this.server = server;
        this.port = port;
        this.protocol = protocol;
        this.hostServer = hostServer;
    };

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHostServer() {
        return hostServer;
    }

    public void setHostServer(String hostServer) {
        this.hostServer = hostServer;
    }
}
