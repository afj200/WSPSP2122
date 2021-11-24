package UT3.Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ejemplo2URL_V2 {
    public static void main(String[] args) {
        URL url = null;
        URLConnection urlCon = null;
        try{
            url = new URL("http://www.elaltozano.es");
            urlCon = url.openConnection();
        }catch(MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in;
        try{
            InputStream inputStream = urlCon.getInputStream();
            in = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            while((inputLine = in.readLine()) != null){
                System.out.println(inputLine);
            }
            in.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
