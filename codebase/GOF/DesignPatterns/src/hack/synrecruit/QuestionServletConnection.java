package hack.synrecruit;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
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
 *
 * @author Prashant.Purkar
 *
 */
public class QuestionServletConnection {

	private static final String URL = "https://ibrecruitmentportal.synechron.com/questionnaire/questionnairesServlet";

	static {

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

	public static URLConnection makeHTTPGetRequest() throws IOException {

		URL url = new URL(URL);
		HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();

		urlConnection.setRequestMethod("GET");
		urlConnection.setRequestProperty("Cookie","JSESSIONID=F5A3507A2D6236385341D2B8E337729E");

		return urlConnection;

	}

	private static void printResponse(InputStream in) throws IOException {

		BufferedInputStream bis = new BufferedInputStream(in);
		String response = "";
		byte buf[] = new byte[1024];
		while (bis.read(buf) != -1) {
			response += new String(buf);
		}

		System.out.println("response received " + response);
	}

	public static void main(String[] args) {

		try {

			HttpsURLConnection connection = (HttpsURLConnection) makeHTTPGetRequest();
			System.out.println("response code recived" + connection.getResponseMessage());
			 printResponse(connection.getInputStream());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
