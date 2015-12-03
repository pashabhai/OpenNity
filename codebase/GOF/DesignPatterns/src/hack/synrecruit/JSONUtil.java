package hack.synrecruit;

import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * SRP utility class to get question and answers from the json response.
 *
 * @author Prashant.Purkar
 *
 */
public class JSONUtil {

	public static String getQuestion(String inputJson) {

		JsonObject jsonObject = new JsonParser().parse(inputJson).getAsJsonObject();

		return jsonObject.get("question").getAsString();
	}

	public static String getAnswer(String inputJson) {
		StringBuffer sbf = new StringBuffer();
	    JsonObject jsonObject = new JsonParser().parse(inputJson).getAsJsonObject();

	    	for(Entry<String,JsonElement> e : jsonObject.entrySet()){

	    		if(e.getKey().startsWith("option")){
	    			sbf.append(e.getKey()+" : "+e.getValue());
	    			sbf.append("\n");
	    		}

	    	}

		return sbf.toString();
	}


	public static void main(String[] args) {

		String jsonExample = "{\"option1\":\"8-bit\",\"option2\":\"16-bit\",\"option3\":\"32-bit\",\"option4\":\"64-bit\",\"question\":\"What is the size of int in Java ?\"}";
	    JsonObject jsonObject = new JsonParser().parse(jsonExample).getAsJsonObject();
		System.out.println(jsonObject.get("question").getAsString());

		System.out.println(getAnswer(jsonExample));





	}
}
