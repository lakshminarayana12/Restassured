import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;




public class Account {

	@Test
	public void testAccount() {
		RestAssured.baseURI="https://qa.vzwapi.dev.cloud.synchronoss.net:8443";
		 Response res=given().header("Accept", "application/json").header("Authorization","Bearer P7GD5BAUJLDL47URQZ3DB6KVVX6POSREIXWVA74RS4I7ETGCQAWFRN3H4FQGWSMI2QKD3ND6WWEH4FVYWHBNSGEWTUCK3CPTQBXNBXBRH2XF4DY36EBXAA2B5L6D2JY5TSQHC2U5EHYUALWRHUKR66ETBQ3DLVVJJA5HSODKJCJWFRAWWCISHAQL6CZYHWAVWSKDTM5SK4BRANGWHLZ24OOQ6NBUBIE672LS5JG3SAWU365LFDS6PKCETQCN4CKZNKUP7HTFEQQEMCA5ZNB2D64CNTFVNG7FTOYFBQHO55Q2EL7NCEJXTKAALVVEOYY73QACG2O7I4U2YNX35BWY75GYECCLKLTTQUVSSRA").
		when().
		get("/cloud/1/account").then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();
		String response=res.asString();
		System.out.println(response);
		JsonPath json= new JsonPath(response);
		String quota=json.get("id");
		System.out.println("id is "+ quota);
		Long quota1= json.get("usage.quota");
		System.out.println("quota1 is" +quota1);
		String b= "{\n" + 
				"  \"firstname\": \"string\",\n" + 
				"  \"lastname\": \"string\",\n" + 
				"  \"middlename\": \"string\",\n" + 
				"  \"nameprefix\": \"string\",\n" + 
				"  \"namesuffix\": \"string\",\n" + 
				"  \"nickname\": \"string\",\n" + 
				"  \"birthday\": \"string\",\n" + 
				"  \"anniversary\": \"string\",\n" + 
				"  \"spouse\": \"string\",\n" + 
				"  \"children\": \"string\",\n" + 
				"  \"orgname\": \"string\",\n" + 
				"  \"orgunit\": \"string\",\n" + 
				"  \"jobtitle\": \"string\",\n" + 
				"  \"profession\": \"string\",\n" + 
				"  \"assistant\": \"string\",\n" + 
				"  \"gender\": \"string\",\n" + 
				"  \"relationship\": \"string\",\n" + 
				"  \"maritalstatus\": \"string\",\n" + 
				"  \"source\": \"string\",\n" + 
				"  \"note\": \"string\",\n" + 
				"  \"incaseofemergency\": false,\n" + 
				"  \"favorite\": false,\n" + 
				"  \"tel\": [\n" + 
				"    {\n" + 
				"      \"type\": \"string\",\n" + 
				"      \"indx\": 0,\n" + 
				"      \"number\": \"string\",\n" + 
				"      \"preference\": 0\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"email\": [\n" + 
				"    {\n" + 
				"      \"type\": \"string\",\n" + 
				"      \"indx\": 0,\n" + 
				"      \"address\": \"string\",\n" + 
				"      \"preference\": 0\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"address\": [\n" + 
				"    {\n" + 
				"      \"type\": \"string\",\n" + 
				"      \"indx\": 0,\n" + 
				"      \"pobox\": \"string\",\n" + 
				"      \"street\": \"string\",\n" + 
				"      \"apartment\": \"string\",\n" + 
				"      \"city\": \"string\",\n" + 
				"      \"state\": \"string\",\n" + 
				"      \"zipcode\": \"string\",\n" + 
				"      \"country\": \"string\",\n" + 
				"      \"preference\": 0\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"im\": [\n" + 
				"    {\n" + 
				"      \"type\": \"string\",\n" + 
				"      \"address\": \"string\",\n" + 
				"      \"preference\": 0\n" + 
				"    }\n" + 
				"  ]\n" + 
				"}";
		
	}


}
