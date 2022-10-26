package za.co.owfm.Entities;

import android.os.AsyncTask;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Entity(tableName = "profile")
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

    @ColumnInfo(name = "loginpath")
    private String loginPath;

    @ColumnInfo(name = "logoutpath")
    private String logoutPath;

    @ColumnInfo(name = "versionpath")
    private String versionPath;

    @ColumnInfo(name = "prefix")
    private String prefix;

    @ColumnInfo(name = "jwt")
    private String jwt;

    public Profile(int keys, String username, String password, String server, String port, String protocol, String hostServer, String loginPath, String logoutPath, String versionPath, String prefix, String jwt){
        this.keys =keys;
        this.username = username;
        this.server = server;
        this.port = port;
        this.protocol = protocol;
        this.hostServer = hostServer;
        this.loginPath = loginPath;
        this.logoutPath = logoutPath;
        this.versionPath = versionPath;
        this.prefix = prefix;
        this.jwt = jwt;
    };

    @Ignore
    public Profile(String username, String password, String server, String port, String protocol, String hostServer, String loginPath, String logoutPath, String versionPath, String prefix, String jwt){
        this.username = username;
        this.server = server;
        this.port = port;
        this.protocol = protocol;
        this.hostServer = hostServer;
        this.loginPath = loginPath;
        this.logoutPath = logoutPath;
        this.versionPath = versionPath;
        this.prefix = prefix;
        this.jwt = jwt;
    };

    public Profile() {
        //
    }

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

    public String getLoginPath() {
        return loginPath;
    }

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
    }

    public String getLogoutPath() {
        return logoutPath;
    }

    public void setLogoutPath(String logoutPath) {
        this.logoutPath = logoutPath;
    }

    public String getVersionPath() {
        return versionPath;
    }

    public void setVersionPath(String versionPath) {
        this.versionPath = versionPath;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public static class getToken extends AsyncTask<Void,Void,Void> {

        String token = "AR-JWT ";
        String username = "mobile.timesheet";
        String password = "MWEQ1FV66Q";

        @Override
        protected Void doInBackground(Void... voids) {
            String urlParameters = "username=" + username + "&password=" + password;

            try {
                byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);

                URL url = new URL("https://48.metaweave.co.za:13579/api/jwt/login");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoOutput(true);
                conn.setInstanceFollowRedirects(false);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.setRequestProperty("charset", "utf-8");
                conn.setRequestProperty("Content-Length", Integer.toString(postData.length));
                conn.setUseCaches(false);

                try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                    wr.write(postData);
                }

                if (conn.getResponseCode() == 200) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String line;
                    while ((line = br.readLine()) != null) {
                        token += line;
                    }
                    br.close();
                } else if (conn.getResponseCode() == 401) {

                    System.out.println("Authentication Error!");
                }

                System.out.println(conn.getResponseCode());
                System.out.println(conn.getResponseMessage());
                System.out.println(token);

                conn.disconnect();
            } catch (Exception e) {
                System.out.println(">>" + e);
            }

            return null;
        }

        //protected void onProgressUpdate(Integer... progress) {
        //setProgressPercent(progress[0]);
        //}

        protected void onPostExecute(Long result) {
            System.out.print(result);
        }


    }
}
