package hack.synrecruit;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * SRP This class maintains the set of question/answers as
 * received from the questionnaire servlet
 * @author Prashant.Purkar
 *
 */
public class QuestionAnswers {

	private Map<String, String> allQuestionAnswers = new LinkedHashMap<>();


	public void add(String question, String answers){

		allQuestionAnswers.put(question, answers);

	}

	/**
	 *
	 * @return copy of the all question answers
	 */
	public Map<String,String> getAllQuestionAnswers(){

		return new LinkedHashMap<String, String>( allQuestionAnswers);

	}


}
