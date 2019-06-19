package weather;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonDemo {

    public static void main(String args[]) throws Exception{
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        URL obj = new URL(url);
        HttpURLConnection con  = (HttpURLConnection)obj.openConnection();
        //int responseCode =  con.getResponseCode();
        //System.out.println(responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String responseText = new String();
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            responseText += inputLine;
        }
        //System.out.println(responseText);
        Object jsonObj = JSONValue.parse(responseText);
        JSONObject jsonObject = (JSONObject) jsonObj;

        System.out.println(jsonObject.get("name"));

        JSONObject mainObj = (JSONObject)jsonObject.get("main");
        System.out.println("Temp:"+mainObj.get("temp"));
        System.out.println("Min:"+mainObj.get("temp_min"));
        System.out.println("Max:"+mainObj.get("temp_max"));

        JSONArray weatherObj = (JSONArray)jsonObject.get("weather");
        JSONObject firstObj = (JSONObject)weatherObj.get(0);
        System.out.println("Desc: "+ firstObj.get("description"));
    }

}
