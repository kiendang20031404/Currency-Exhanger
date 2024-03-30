package Project2_Burger211;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class ExchangeRate {
static double rate=1.0;
public static double getRate(String currancyCode) throws Exception {
	try {
		///Create a URL instance
		String firstPartURL = "https://v6.exchangerate-api.com/v6/";
		String key ="99b2c9906e57ff28e6b5f5de"; 
		String thirdPartURL = "/latest/USD";
		String theURL = firstPartURL + key + thirdPartURL;
		URL url = new URL(theURL); 
	
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		JSONParser jsonParser = new JSONParser();
		JSONObject myObject = (JSONObject)jsonParser.parse(br); 
		
		rate = (double)((JSONObject) myObject.get("conversion_rates")).get(currancyCode); 
		// Read the JSON file
		// BufferedReader br = .br . .
		// Create a JSON object
		            //  . .
		//JSONObject myObject = . .
		// Read exchange rate of the currency code (NOT a country name)
		// rate = (double) . . . ;     
		  
		      }  
		   catch (Exception ex) {
		   }
		   return rate;
     }
}