package apiRevisit;

import java.util.List;

import lombok.Data;

@Data
public class employeeDetails {
	
	String status;
	List<employee> data;
	String message;
		
}
