package test;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.log4j.helpers.LogLog;
import org.testng.AssertJUnit;


import com.UNI.dto.EmployeeDTO;


public class EmployeeWsIntegrationTest {

	public EmployeeWsIntegrationTest() {
		// TODO Auto-generated constructor stub
	}
	
	public String TestgetEmpByID(final String data) {
	String getID1 = null;
	GetMethod getID = new GetMethod("");
    HttpClient client = new HttpClient();{
    
    try {
        int status = client.executeMethod(getID);
        if (status == HttpStatus.SC_OK) {
        	getID1 = getID.getResponseBodyAsString();
        	
        	EmployeeDTO emp = new EmployeeDTO();
        	
        	AssertJUnit.assertNotNull(emp);
        	
        	
        	
        } else {
            LogLog.error("Status Code : " + status);
           
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return getID1;
    
    }
    
    
	}
	
}


