package agile.TeamA.Vo;

public class Admin_RegisterLogin_Vo {
	 private  String  AdminID;
	  private String EmailAddress;
	  private String AdminPwd;
	  private String AdminName;
	  private String vtyAdminPwd;
	  
	  
	  public String getAdminName()
	  {
	    return this.AdminName;
	  }

	  public void setAdminName(String AdminName) {
	    this.AdminName = AdminName;
	  }
	  public String getvtyAdminPwd()
	  {
	    return this.vtyAdminPwd;
	  }

	  public void setvtyAdminPwd(String vtyAdminPwd) {
	    this.vtyAdminPwd = vtyAdminPwd;
	  }

	  public String getAdminID() {
	    return this.AdminID;
	  }

	  public void setAdminID(String AdminID) {
	    this.AdminID = AdminID;
	  }

	  public String getEmailAddress() {
	    return this.EmailAddress;
	  }

	  public void setEmailAddress(String EmailAddress) {
	    this.EmailAddress = EmailAddress;
	  }

	  public String getAdminPwd() {
	    return this.AdminPwd;
	  }

	  public void setAdminPwd(String AdminPwd) {
	    this.AdminPwd = AdminPwd;
	  }

	  public Admin_RegisterLogin_Vo(String AdminID, String EmailAddress, String AdminPwd)
	  {
	    this.AdminID = AdminID;
	    this.EmailAddress = EmailAddress;
	    this.AdminPwd = AdminPwd;
	  }

	  public Admin_RegisterLogin_Vo(String AdminID, String EmailAddress, String AdminPwd, String AdminName)
	  {
	    this.AdminID = AdminID;
	    this.EmailAddress = EmailAddress;
	    this.AdminPwd = AdminPwd;
	    this.AdminName = AdminName;
	  }

	  public Admin_RegisterLogin_Vo(String AdminID, String AdminPwd)
	  {
	    this.AdminID = AdminID;
	    this.AdminPwd = AdminPwd;
	  }

	  public Admin_RegisterLogin_Vo()
	  {
	  }

}
