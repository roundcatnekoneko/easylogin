package jp.co.internous.easylogin.model.domain;

public class MstUser {
	
	    private int id;
		private String userName;
		private String password;
		private String fullName;
	    // idのゲッター
	    public int getId() {
	        return id;
	    }

	    // idのセッター
	    public void setId(int id) {
	        this.id = id;
	    }

	    // userNameのゲッター
	    public String getUserName() {
	        return userName;
	    }

	    // userNameのセッター
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    // passwordのゲッター
	    public String getPassword() {
	        return password;
	    }

	    // passwordのセッター
	    public void setPassword(String password) {
	        this.password = password;
	    }

	    // fullNameのゲッター
	    public String getFullName() {
	        return fullName;
	    }

	    // fullNameのセッター
	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

}