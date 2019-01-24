
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

        URL url = new URL("https://newsapi.org/v2/top-headlines?sources=associated-press&apiKey=[enter your key from https://newsapi.org]");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        connection.connect();
        int responseCode = connection.getResponseCode();

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

        org.json.simple.parser.JSONParser parse = new org.json.simple.parser.JSONParser();
        JSONObject jsonObject = (JSONObject) parse.parse(inline);
        JSONArray jsonArray = (JSONArray) jsonObject.get("articles");

        ArrayList<String> titleList = new ArrayList<String>();

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject2 = (JSONObject) jsonArray.get(i);
            titleList.add(jsonObject2.get("title").toString());
        }

        System.out.println("\nLatest Headline from AP: " + titleList.get(1) + "\n\n");
        System.out.println("All Headlines: \n");

        for (String title : titleList) {
            System.out.println(title);
        }


        connection.disconnect();
    }


}

