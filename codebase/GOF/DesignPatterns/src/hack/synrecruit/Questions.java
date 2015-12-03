package hack.synrecruit;

import static hack.synrecruit.JSONUtil.getAnswer;
import static hack.synrecruit.JSONUtil.getQuestion;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * SRP : maintains the unique set of questions, answer json response
 *
 * @author Prashant.Purkar
 *
 */

public class Questions {

	private static final Map<String,String> questions = new TreeMap<>();

	public static void add(String jsonResponse) {

		String key = getQuestion(jsonResponse);

		if(!questions.containsKey(key)){
			questions.put(getQuestion(jsonResponse),getAnswer(jsonResponse));
		}else System.out.println("duplicate question ");

		System.out.println("question set size"+questions.size());

	}

	/**
	 * deep copy and return
	 *
	 * @return
	 */
	public static Map<String,String> getAll() {

		return new TreeMap<>(questions);

	}



}
