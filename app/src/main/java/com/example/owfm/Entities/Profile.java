package com.example.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
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
    private int port;

    @ColumnInfo(name = "protocol")
    private String protocol;

    @ColumnInfo(name = "hostServer")
    private String hostServer;

    public int getKeys() {
        return keys;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getServer() {
        return server;
    }

    public int getPort() {
        return port;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHostServer() {
        return hostServer;
    }


}
