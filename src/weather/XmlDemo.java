package weather;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class XmlDemo {

    public static void main(String args[]) throws Exception{
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22";
        URL urlObj = new URL(url);
        HttpURLConnection con = (HttpURLConnection)urlObj.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String responseText = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            responseText += inputLine;
        }
        //System.out.println(responseText);
        in.close();

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new InputSource(new StringReader(responseText)));

        NodeList crNodes = doc.getElementsByTagName("current");
        if(crNodes.getLength() > 0){
            Element current = (Element)crNodes.item(0);
            Element city = (Element)current.getElementsByTagName("city").item(0);
            System.out.println(city.getAttribute("name"));
            Element temp = (Element)current.getElementsByTagName("temperature").item(0);
            System.out.println(temp.getAttribute("value"));
            System.out.println(temp.getAttribute("min"));
            System.out.println(temp.getAttribute("max"));
        }
    }

}
