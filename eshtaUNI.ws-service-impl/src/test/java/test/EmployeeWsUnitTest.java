package test;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.UNI.dto.EmployeeDTO;
import com.UNI.ws.service.api.EmployeeWS;

@ContextConfiguration(locations = { "/test-beans.xml", "classpath:/dao-config.xml",
"classpath:applicationContext-ws.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class EmployeeWsUnitTest {

	public EmployeeWsUnitTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private EmployeeWS employeeWS;
	
	


	@Test
    @Rollback
	public void TestgetEmpByID(final String data) {
		
	EmployeeDTO emp= employeeWS.getEmpid(1);
	
	AssertJUnit.assertEquals("------->", "abdelrazik", emp.getFirstname() );
	AssertJUnit.assertEquals("------->", "salah", emp.getLastname() );
		
		
	}
	
	@Test
    @Rollback
	public void TestgetEmpByFirstname(final String data) {
		
	EmployeeDTO emp;
	try {
		emp = employeeWS.getFirstname("abdelrazik");
		
		AssertJUnit.assertEquals("------->", "abdelrazik", emp.getFirstname() );
		AssertJUnit.assertEquals("------->", "salah", emp.getLastname() );
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
	}
	
	public void TestgetEmpByLastname(final String data) {
		
		EmployeeDTO emp;
		try {
			emp = employeeWS.getLastname("salah");
			
			AssertJUnit.assertEquals("------->", "abdelrazik", emp.getFirstname() );
			AssertJUnit.assertEquals("------->", "salah", emp.getLastname() );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		}
		
	
}
