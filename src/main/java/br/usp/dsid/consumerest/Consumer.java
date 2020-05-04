package br.usp.dsid.consumerest;

import java.net.URI;
import java.util.Arrays;

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
	
	
	public void getMethod(String country) {
		
		ResponseEntity<Country[]> responseGFE = restTemplate.getForEntity(String.format(URL_COUNTRY, country), Country[].class);

		System.out.println("status: "+responseGFE.getStatusCode()+"\n"+Arrays.toString(responseGFE.getBody()));
		
		String responseGFOS = restTemplate.getForObject(String.format(URL_COUNTRY, country), String.class);
		
		System.out.println("\n"+responseGFOS);
		
		ResponseEntity<String> responseGEx = restTemplate.exchange(String.format(URL_COUNTRY, country), HttpMethod.GET, null,  String.class);
		
		System.out.println("\nstatus: "+responseGEx.getStatusCode()+"\n"+responseGEx.getBody());

	}
	
	public void postMethod(JsonPlaceHolder jsonPlaceHolder) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<JsonPlaceHolder> requestEntity = new HttpEntity<JsonPlaceHolder>(jsonPlaceHolder, headers);		
				
		ResponseEntity<JsonPlaceHolder> responsePFE = restTemplate.postForEntity(URL_JPH, requestEntity, JsonPlaceHolder.class);
		
		System.out.println("\nstatus: "+responsePFE.getStatusCode()+"\n"+responsePFE.getBody().toString());	
		
		String responsePFO = restTemplate.postForObject(URL_JPH, requestEntity, String.class);
		
		System.out.println("\n"+responsePFO);	
		
		ResponseEntity<JsonPlaceHolder> responseEx = restTemplate.exchange(URL_JPH, HttpMethod.POST, requestEntity, JsonPlaceHolder.class);
		
		System.out.println("\nstatus: "+responseEx.getStatusCode()+"\n"+responseEx.getBody().toString());	



		
	} 
	
	public void putMethod(JsonPlaceHolder jsonPlaceHolder, String id) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<JsonPlaceHolder> requestEntity = new HttpEntity<JsonPlaceHolder>(jsonPlaceHolder, headers);		
		
		ResponseEntity<JsonPlaceHolder> response = restTemplate.exchange(String.format(URL_JPH_ID, id), HttpMethod.PUT, requestEntity, JsonPlaceHolder.class);
		
		System.out.println("\nstatus: "+response.getStatusCode()+"\n"+response.getBody().toString());	
		
		restTemplate.put(String.format(URL_JPH_ID, id), requestEntity);
		
	}
	
	public void deleteMethod(String id) {
		
		ResponseEntity<String> response = restTemplate.exchange(String.format(URL_JPH_ID, id), HttpMethod.DELETE, null, String.class);

		System.out.println("\nstatus: "+response.getStatusCode()+"\n"+response.getBody().toString());	
		
		restTemplate.delete(String.format(URL_JPH_ID, id));
		
		
	}
	
}
