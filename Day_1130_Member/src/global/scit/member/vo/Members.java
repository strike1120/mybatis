package global.scit.member.vo;

public class Members {
	private String usrid;
	private String usrname;
	private String email;
	private int addrno;
	
	public Members() {
		super();
	}

	public Members(String usrid, String usrname, String email, int addrno) {
		super();
		this.usrid = usrid;
		this.usrname = usrname;
		this.email = email;
		this.addrno = addrno;
	}

	public String getUsrid() {
		return usrid;
	}

	public String getUsrname() {
		return usrname;
	}

	public String getEmail() {
		return email;
	}

	public int getAddrno() {
		return addrno;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddrno(int addrno) {
		this.addrno = addrno;
	}

	@Override
	public String toString() {
		return "Members [usrid=" + usrid + ", usrname=" + usrname + ", email=" + email + ", addrno=" + addrno + "]";
	}
	
	
	
}



//CREATE TABLE members(
//	    usrid VARCHAR2(15) primary key,
//	    usrname VARCHAR2(20) not null,
//	    email VARCHAR2(30) unique not null,
//	    addrno number references addr(addrno)
//	);