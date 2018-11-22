import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import CustomerHist.Dao.Imp.CustomerHist_DaoImp;
import model.CustomerHist;

public class CustomerHistTest {
	private CustomerHist_DaoImp cdimpObj =new CustomerHist_DaoImp();
	@Test
	public void getCustomerHistTest() {
		ArrayList<CustomerHist> Testlist=new ArrayList<>();
		//assertArrayEquals(Testlist, cdimpObj.GetCustomerhistlist());
		assertNotNull( cdimpObj.GetCustomerhistlist());		
	}

}
