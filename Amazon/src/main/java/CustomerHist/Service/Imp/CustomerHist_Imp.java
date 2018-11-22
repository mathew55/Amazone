package CustomerHist.Service.Imp;

import java.util.ArrayList;

import CustomerHist.Dao.Imp.CustomerHist_DaoImp;
import CustomerHist.ServiceI.Customer_HistInterface;
import model.CustomerHist;

public class CustomerHist_Imp implements Customer_HistInterface{

	@Override
	public ArrayList<CustomerHist> getcustomerhist() {
		// TODO Auto-generated method stub
		CustomerHist_DaoImp chd=new CustomerHist_DaoImp();
		ArrayList<CustomerHist> CustomerHistlist=chd.GetCustomerhistlist();
		return CustomerHistlist;		
	}
}
