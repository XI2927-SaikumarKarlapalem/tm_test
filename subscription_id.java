package com.example.customer;

import org.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

@Service
public class subscription_id {
	private String id;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Bean
	public void get_id() throws Throwable
	{
		Unirest.setTimeouts(0, 0);
		HttpResponse<JsonNode> response = Unirest.post("https://xebia.sandbox.mambu.com/api/v1/subscriptions")
		  .header("Accept", "application/vnd.mambu.v2+json")
		  .header("Content-Type", "application/json")
		  .header("apikey", "Ki45zkNjMcWxeWSPDleWwiwrYL8bvrn9")
		  .header("Cookie", "AWSALB=xqhKsF80E11+aXQKneUA1j5lLHQAn/UzU6Iu2bjtruogw4rk5modY/dgrg4HKb51X8Lc8f+sAMalI1G4GT21WrmYZHz2sHL8SpzEeu30BtBs94uOyjlIcervdZG1; AWSALBCORS=xqhKsF80E11+aXQKneUA1j5lLHQAn/UzU6Iu2bjtruogw4rk5modY/dgrg4HKb51X8Lc8f+sAMalI1G4GT21WrmYZHz2sHL8SpzEeu30BtBs94uOyjlIcervdZG1")
		  .body("\r\n    {\r\n    \"owning_application\": \"training-app\",\r\n    \"event_types\": [\"mrn.event.xebia.streamingapi.client_created\"]\r\n}\r\n")
		  .asJson();


		JSONObject Myobj=response.getBody().getObject();
		 id=Myobj.getString("id");
		 
	}
		


}
