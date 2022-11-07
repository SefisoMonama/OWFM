package za.co.owfm.API.login;

import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit getRetrofit() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://48.metaweave.co.za:13579")
                .client(okHttpClient)
                .build();
        return retrofit;
    }


    public static  UserService getUserService(){

        UserService userService = getRetrofit().create(UserService.class);

        return userService;
    }

    public static class getToken extends AsyncTask<String,String,String> {

        String tokenPrefix = "AR-JWT ";
        String token =" ";
        String username = "";
        String password = "";
        public getToken(String username, String password) {
            this.username = username;
            this.password = password;
        }

        @Override
        protected String doInBackground(String... strings) {

            System.out.println("getToken......................>");
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
                    System.out.println("Auth error");
                }

                System.out.println(conn.getResponseCode());
                System.out.println(conn.getResponseMessage());
                System.out.println(tokenPrefix+" "+token);
                conn.disconnect();
            } catch (Exception e) {
                System.out.println(">>" + e);
            }

            return null;
        }
    }
}
