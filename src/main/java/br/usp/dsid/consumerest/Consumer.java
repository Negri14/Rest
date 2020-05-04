package br.usp.dsid.consumerest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Consumer {
	
	private static final String URL_JPH= "https://jsonplaceholder.typicode.com/posts";
	private static final String URL_JPH_ID = "https://jsonplaceholder.typicode.com/posts/%s";
	private static final String URL_COUNTRY = "https://restcountries.eu/rest/v2/name/%s";


	private final RestTemplate restTemplate;
	
	public Consumer() {
		this.restTemplate = new RestTemplate();
	}
	
	
	public void getMethod(String name) {
		
		ResponseEntity<Country[]> response = restTemplate.getForEntity(String.format(URL_COUNTRY, name), Country[].class);
		ResponseEntity<String> response2 = restTemplate.getForEntity(String.format(URL_COUNTRY, name), String.class);
		
		printResponse("GET", response);
		System.out.println("\n"+response2.getBody());


	}
	
	public void postMethod(JsonPlaceHolder jsonPlaceHolder) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<JsonPlaceHolder> requestEntity = new HttpEntity<JsonPlaceHolder>(jsonPlaceHolder, headers);		
		
		ResponseEntity<JsonPlaceHolder> response = restTemplate.exchange(URL_JPH, HttpMethod.POST, requestEntity, JsonPlaceHolder.class);
		ResponseEntity<String> response2 = restTemplate.exchange(URL_JPH, HttpMethod.POST, requestEntity, String.class);
		
		printResponse("POST", response);
		System.out.println("\n"+response2.getBody());
		
	}
	
	public void putMethod(JsonPlaceHolder jsonPlaceHolder, String id) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<JsonPlaceHolder> requestEntity = new HttpEntity<JsonPlaceHolder>(jsonPlaceHolder, headers);		
		
		ResponseEntity<JsonPlaceHolder> response = restTemplate.exchange(String.format(URL_JPH_ID, id), HttpMethod.PUT, requestEntity, JsonPlaceHolder.class);
		ResponseEntity<String> response2 = restTemplate.exchange(String.format(URL_JPH_ID, id), HttpMethod.PUT, requestEntity, String.class);

		printResponse("PUT", response);
		System.out.println("\n"+response2.getBody());

	}
	
	public void deleteMethod(String id) {
		
		restTemplate.delete(String.format(URL_JPH_ID, id));
		
		System.out.println("DELETE");
		
	}
	
	public void printResponse(String httpMethod, ResponseEntity response) {
		System.out.println("\n"+httpMethod+"\n\nstatus: "+response.getStatusCodeValue()+"\n");
		
		if (response.getBody() instanceof Country[]) {
			for (Country c : (Country[]) response.getBody()) 
				System.out.println(c.toString());
		} else {
			System.out.println(response.getBody().toString());
		}
	}
	
}
