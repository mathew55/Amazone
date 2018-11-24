package agile.TeamA.ShoppingCart.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import agile.TeamA.ShoppingCart.DaoI.ShoppingCart_DaoInterface;
import agile.TeamA.Vo.ShoppingCart_Vo;
import agile.TeamA.utils.DB;

public class ShoppingCart_Dao implements ShoppingCart_DaoInterface {

	/*
	 * @Override public boolean updateItems_Quantity(int product_id, int
	 * product_quantity_avl) { // TODO Auto-generated method stub Dbmanage dbmanage
	 * = new Dbmanage(); Connection conn = null; Statement sta = null; try { conn =
	 * dbmanage.initDB(); // String sql =
	 * "SELECT * FROM DATABASE WHERE admin_username="+AdminName+";";
	 * PreparedStatement psmt = conn
	 * .prepareStatement("UPDATE PRODUCTS SET product_Quantity_Available=(?)" +
	 * "WHERE product_ID=(?)"); psmt.setInt(1, product_id); psmt.setInt(2,
	 * product_quantity_avl); psmt.executeUpdate(); return true; } catch
	 * (SQLException e) {
	 * System.err.println("update product available quantity Exception"+e); return
	 * false; // TODO: handle exception }
	 * 
	 * }
	 */

	@Override
	public boolean addUserHist(ArrayList<ShoppingCart_Vo> product_Information, int CustomerID) {
		// TODO Auto-generated method stub
		DB dbmanage = new DB();
		Connection conn = null;
		// Statement sta = null;
		try {
			conn = dbmanage.initDB();
			for (int i = 0; i < product_Information.size(); i++) {
				ShoppingCart_Vo shopCart = product_Information.get(i);
				PreparedStatement psmt = conn.prepareStatement("INSERT INTO Customer_hist VALUES(null,"
						+ shopCart.getProductID() + ',' + CustomerID + ',' + shopCart.getItemsName() + ','
						+ shopCart.getItemsPrice() + ',' + shopCart.getitems_Quantity() + ")");
				psmt.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			System.err.println("Insert User history Exception" + e);
			return false;
			// TODO: handle exception
		}

	}

	@Override
	public ArrayList<ShoppingCart_Vo> GetItemsInformation(int product_id) {
		// TODO Auto-generated method stub
		DB dbmanage = new DB();
		Connection conn = null;
		// Statement sta = null;
		ArrayList<ShoppingCart_Vo> product_Information = new ArrayList<>();
		try {
			conn = dbmanage.initDB();
			// ShoppingCart_Vo shopCart;
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM PRODUCTS WHERE product_ID=(?)");
			psmt.setInt(1, product_id);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				// use to get product information which in Cart
				ShoppingCart_Vo shopCart = new ShoppingCart_Vo(rs.getInt("product_ID"), rs.getString("product_Name"),
						rs.getDouble("product_Price"), rs.getInt("product_Quantity_Available"));

				product_Information.add(shopCart);
			}
		} catch (SQLException e) {
			System.err.println("Get Product information Exception" + e);

			// TODO: handle exception
		}

		return product_Information;
	}

	@Override
	public ArrayList<ShoppingCart_Vo> GetCart(int Customer_id) {
		DB dbmanage = new DB();
		Connection conn = null;
		// Statement sta = null;
		ArrayList<ShoppingCart_Vo> Cart = new ArrayList<>();
		try {
			conn = dbmanage.initDB();
			// ShoppingCart_Vo shopCart;
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM CustomerCart WHERE customer_ID=(?)");
			psmt.setInt(1, Customer_id);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				// use to get product information which in Cart
				ShoppingCart_Vo shopCart = new ShoppingCart_Vo(rs.getInt("Cart_ID"), rs.getInt("customer_ID"),
						rs.getString("product_Name"), rs.getDouble("product_Price"), rs.getInt("product_Quantity"));

				Cart.add(shopCart);
			}
		} catch (SQLException e) {
			System.err.println("Get Cart information Exception" + e);

			// TODO: handle exception
		}

		return Cart;
	}

	@Override
	public boolean addCustomerCart(ArrayList<ShoppingCart_Vo> CustomerCart, int CustomerID) {
		// TODO Auto-generated method stub
		DB dbmanage = new DB();
		Connection conn = null;
		// Statement sta = null;
		try {
			conn = dbmanage.initDB();
			System.out.println("link databse successful add new item to cart");
			 for (int i = 0; i < CustomerCart.size(); i++) {
				 ShoppingCart_Vo shopCart = CustomerCart.get(i);
				 PreparedStatement psmt = conn.prepareStatement("INSERT INTO CustomerCart VALUES (null,?,?,?,?,?)");
					psmt.setInt(1, CustomerID);
					psmt.setInt(2, shopCart.getProductID());
					psmt.setString(3, shopCart.getItemsName());
					psmt.setDouble(4, shopCart.getItemsPrice());
					psmt.setInt(5, shopCart.getitems_Quantity());
					System.out.println(psmt);
					psmt.executeUpdate(); 
			 }
			/*
			 * System.out.println("INSERT INTO CustomerCart VALUES(" + "null" + ',' +
			 * CustomerID + ',' + shopCart.getProductID() + ',' + shopCart.getItemsName() +
			 * ',' + shopCart.getItemsPrice() + ',' + shopCart.getitems_Quantity() + ")");
			 */
			
			/*
			 * for (int i = 0; i < CustomerCart.size(); i++) { ShoppingCart_Vo shopCart =
			 * CustomerCart.get(i); PreparedStatement psmt =
			 * conn.prepareStatement("INSERT INTO CustomerCart VALUES(null," +
			 * shopCart.getProductID() + ',' + shopCart.getCustomerID() + ',' +
			 * shopCart.getItemsName() + ',' + shopCart.getItemsPrice() + ',' +
			 * shopCart.getitems_Quantity() + ")"); psmt.executeUpdate(); }
			 */
			return true;
		} catch (SQLException e) {
			System.err.println("Insert CustomerCart Exception" + e);
			return false;
			// TODO: handle exception
		}

	}

	@Override
	public boolean updateCustomer_Cart(String ids, int Customer_id, String type) {
		// TODO Auto-generated method stub
		DB dbmanage = new DB();
		Connection conn = null;
		Statement sta = null;
		try {
			conn = dbmanage.initDB();
			/*
			 * if ("update".equals(type)) { String[] emid = ids.split(","); for(int
			 * i=0;i<emid.length;i++) { ShoppingCart_Vo scv=CustomerCart.get(i);
			 * PreparedStatement psmt = conn.prepareStatement(
			 * "UPDATE CustomerCart SET Product_Quantity=(?)" +
			 * "WHERE product_ID=(?) and customer_ID=(?)"); psmt.setInt(1,
			 * scv.getitems_Quantity()); psmt.setInt(2, scv.getProductID()); psmt.setInt(3,
			 * scv.getCustomerID()); psmt.executeUpdate(); } } else
			 */
			String[] emid = ids.split(",");
			if ("buy".equals(type)) {
				ArrayList<ShoppingCart_Vo> Cart = new ArrayList<>();
				ShoppingCart_Dao sd = new ShoppingCart_Dao();
				for (int i = 0; i < emid.length; i++) {
					int id = Integer.parseInt(emid[i]);
					PreparedStatement psmt = conn
							.prepareStatement("SELECT * FROM CustomerCart WHERE customer_ID=(?) and product_ID=(?)");
					psmt.setInt(1, Customer_id);
					psmt.setInt(2, id);
					ResultSet rs = psmt.executeQuery();
					while (rs.next()) {
						// use to get product information which in Cart
						ShoppingCart_Vo shopCart = new ShoppingCart_Vo(rs.getInt("customer_ID"),
								rs.getInt("product_ID"), rs.getString("product_Name"), rs.getDouble("product_Price"),
								rs.getInt("product_Quantity"));
						Cart.add(shopCart);
					}

					// update userhist information
					sd.addUserHist(Cart, Customer_id);
				}
				
				for (int j = 0; j < emid.length; j++) {
					int id = Integer.parseInt(emid[j]);
					PreparedStatement psmt = conn
							.prepareStatement("DELETE FROM CustomerCart" + "WHERE product_ID=(?) and customer_ID=(?)");
					psmt.setInt(1, id);
					psmt.setInt(2, Customer_id);
					psmt.executeUpdate();
				}
					return true;

			}
			if("delete".equals(type)) {
				
				for (int j = 0; j < emid.length; j++) {
					int id = Integer.parseInt(emid[j]);
					PreparedStatement psmt = conn
							.prepareStatement("DELETE FROM CustomerCart" + "WHERE product_ID=(?) and customer_ID=(?)");
					psmt.setInt(1, id);
					psmt.setInt(2, Customer_id);
					psmt.executeUpdate();
				}

				return true;
			}

		} catch (SQLException e) {
			System.err.println("update customer information quantity Exception" + e);
			return false;
			// TODO: handle exception
		}
		return false;

	}

}
