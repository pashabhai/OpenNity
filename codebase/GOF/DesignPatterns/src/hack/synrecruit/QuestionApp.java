package hack.synrecruit;

import java.io.IOException;
import java.net.URLConnection;
import java.util.Map.Entry;

public class QuestionApp {

	public static void main(String[] args) throws InterruptedException {

		QuestionaireServletConnection qsc = new QuestionaireServletConnection();
		for (int i = 0; i < 200; i++) {
			try {
				URLConnection urlConn = qsc.makeHTTPGetRequest();
				String jsonQuestionResponse = qsc.readResponse(urlConn.getInputStream());
				Questions.add(jsonQuestionResponse);
				//Thread.sleep(1000*4);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		System.out.println("start questionset --->");
		for(Entry<String,String> entry: Questions.getAll().entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}

		System.out.println("end questionset ---> "+Questions.getAll().size());


	}
}
