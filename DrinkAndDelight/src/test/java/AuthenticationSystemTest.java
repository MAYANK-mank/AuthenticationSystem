import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.authenticationsystem.beans.AuthenticationSystemBean;
import com.capgemini.authenticationsystem.dao.AuthenticationSystemDAO;
import com.capgemini.authenticationsystem.service.AuthenticationSystemService;

public class AuthenticationSystemTest {
	
	AuthenticationSystemBean myDetail = new AuthenticationSystemBean();
    AuthenticationSystemService service = new AuthenticationSystemService(); 
    AuthenticationSystemDAO database = new AuthenticationSystemDAO();
    
	
	@Test
	public void testEmailId() {
		myDetail.setEmailId("ravi");
		assertEquals(myDetail.getEmailId(), service.checkEmailId(myDetail, database));
	}
    
	@Test
	public void testPassword() {
		myDetail.setPassword("ravi123");
		assertEquals(myDetail.getPassword(), service.checkPassword(myDetail, database));
	}
}
