package global.scit.member.vo;

public class MemberInfo {
	private String usrid;
	private String usrname;
	private String email;
	private String city;
	private String address;

	public MemberInfo(String usrid, String usrname, String email, String city, String address) {
		super();
		this.usrid = usrid;
		this.usrname = usrname;
		this.email = email;
		this.city = city;
		this.address = address;
	}
	public MemberInfo() {
		super();
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
	public String getCity() {
		return city;
	}
	public String getAddress() {
		return address;
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
	public void setCity(String city) {
		this.city = city;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberInfo [usrid=" + usrid + ", usrname=" + usrname + ", email=" + email + ", city=" + city + ", address="
				+ address + "]";
	}



}

//select 
//m.usrid, m.usrname, m.email, a.city, a.address
//from
//members m, addr a
//where
//m.addrno = a.addrno;