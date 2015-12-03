package hack.synrecruit;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

/**
 * This class requests to the questionnaire servlet URL and process if received
 * json response
 *
 * questionnairesServlet
 * https://ibrecruitmentportal.synechron.com/questionnaire/
 * candidateScreeningServlet Cookie: JSESSIONID=F5A3507A2D6236385341D2B8E337729E
 *  make a http get request to questionaire srvelet
* and fetch all the qans and store them
 * @author Prashant.Purkar
 *
 */
public class QuestionaireServletConnection {

	private static final String URL = "https://ibrecruitmentportal.synechron.com/questionnaire/questionnairesServlet";
	private final URL questionServletURL = getQuestionServletURL();

	public  URL getQuestionServletURL(){

		try{
			return new URL(URL);
		}catch(MalformedURLException ex){
			ex.printStackTrace();
			return null;
		}
	}


	public QuestionaireServletConnection(){
		javax.net.ssl.HttpsURLConnection
				.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {

					public boolean verify(String hostname,
							javax.net.ssl.SSLSession sslSession) {
						if (hostname
								.equals("ibrecruitmentportal.synechron.com")) {
							return true;
						}
						return false;
					}
				});
	}



	public  URLConnection makeHTTPGetRequest() throws IOException {


		HttpsURLConnection urlConnection = (HttpsURLConnection) questionServletURL.openConnection();

		urlConnection.setRequestMethod("GET");
		// original JSESSIONID=F5A3507A2D6236385341D2B8E337729E
		//JSESSIONID=9244BE4CD7C59118916E6694B6E0231FA
		urlConnection.setRequestProperty("Cookie","JSESSIONID=9244BE4CD7C59118916E6694B6E0231FA");

		return urlConnection;

	}



	public  String readResponse(InputStream in) throws IOException {

		if(in==null){
			return null;
		}

		BufferedInputStream bis = new BufferedInputStream(in);
		String response = "";
		byte buf[] = new byte[1024];
		while (bis.read(buf) != -1) {
			response += new String(buf);
		}

		//System.out.println("response received " + response);
		return response.trim();
	}

	public static void main(String[] args) {

		try {

			QuestionaireServletConnection qsc = new QuestionaireServletConnection();
			HttpsURLConnection connection = (HttpsURLConnection) qsc.makeHTTPGetRequest();
			System.out.println("response code recived" + connection.getResponseMessage());
			qsc.readResponse(connection.getInputStream());


		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
