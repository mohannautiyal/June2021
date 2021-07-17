package apiRevisit;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredTest {

	public static void main(String[] args) {

		RestAssured.baseURI="http://dummy.restapiexample.com";
        Response Response = RestAssured.given().get("/api/v1/employees");
	
	 // Response.getBody().prettyPrint();


        employeeDetails employeeData= Response.getBody().as(employeeDetails.class);
    //  System.out.println(employeeData.getMessage().toString());  
        System.out.println("=================================");
       // employeeData.getMessage();
      employeeData.getData().stream().forEach(x -> System.out.println(x.getEmployee_name()));
}
}