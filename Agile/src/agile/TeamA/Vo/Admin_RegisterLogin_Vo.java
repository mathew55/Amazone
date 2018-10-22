package agile.TeamA.Vo;

public class Admin_RegisterLogin_Vo {
	  private String  FirstName;
	  private String LastName;
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

	  public String getFirstName() {
	    return this.FirstName;
	  }

	  public void setFirstName(String FirstName) {
	    this.FirstName = FirstName;
	  }

	  public String getLastName() {
	    return this.LastName;
	  }

	  public void setLastName(String LastName) {
	    this.LastName = LastName;
	  }

	  public String getAdminPwd() {
	    return this.AdminPwd;
	  }

	  public void setAdminPwd(String AdminPwd) {
	    this.AdminPwd = AdminPwd;
	  }

	  public Admin_RegisterLogin_Vo(String FirstName, String LastName, String AdminPwd)
	  {
	    this.FirstName = FirstName;
	    this.LastName = LastName;
	    this.AdminPwd = AdminPwd;
	  }

	  public Admin_RegisterLogin_Vo(String FirstName, String LastName, String AdminPwd, String AdminName)
	  {
	    this.FirstName = FirstName;
	    this.LastName = LastName;
	    this.AdminPwd = AdminPwd;
	    this.AdminName = AdminName;
	  }

	  public Admin_RegisterLogin_Vo(String AdminName)
	  {
	    this.AdminName = AdminName;
	  }

	  public Admin_RegisterLogin_Vo(String FirstName, String AdminPwd)
	  {
	    this.FirstName = FirstName;
	    this.AdminPwd = AdminPwd;
	  }

	  public Admin_RegisterLogin_Vo()
	  {
	  }

}
