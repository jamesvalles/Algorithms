
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/* James Valles - Parsing a News API and adding titles to array*/

public class ParsingRestApi {


    public static void main(String[] args) throws IOException, ParseException {

        String inline = ""; // this stores JSCON data in String format.

        //url api key
        URL url = new URL("https://newsapi.org/v2/top-headlines?sources=associated-press&apiKey=[enter your key from https://newsapi.org]");

        //open connection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        //type of request
        connection.setRequestMethod("GET");

        //connect
        connection.connect();
        
        //get response code 
        int responseCode = connection.getResponseCode();

        //scanning all content 
        if (responseCode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {
            Scanner scan = new Scanner(url.openStream());
            while (scan.hasNext()) {
                inline += scan.nextLine();
            }
            //  System.out.println("\nLatest Headlines from CBS News:");
            //System.out.println(inline);
            scan.close();
        }
        //initialize parser 
        org.json.simple.parser.JSONParser parse = new org.json.simple.parser.JSONParser();
        
        //parse content into JSON Object must add following to .jar classpath https://code.google.com/archive/p/json-simple/
        JSONObject jsonObject = (JSONObject) parse.parse(inline);
        JSONArray jsonArray = (JSONArray) jsonObject.get("articles");

        //create title list 
        ArrayList<String> titleList = new ArrayList<String>();

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject2 = (JSONObject) jsonArray.get(i); //get the first element of object array
            titleList.add(jsonObject2.get("title").toString()); //filter to tiles only and add to arraylist
        }

        //print headline
        System.out.println("\nLatest Headline from AP: " + titleList.get(1) + "\n\n");
        System.out.println("All Headlines: \n");

        //print all headlines
        for (String title : titleList) {
            System.out.println(title);
        }

        //close connection
        connection.disconnect();
    }


}

