package global.scit.member.vo;

public class Addr { //addrVO
	private int addrno;
	private String city;
	private String address;
	
	
	public Addr() {
		super();
	}
	
	public Addr(int addrno, String city, String address) {
		super();
		this.addrno = addrno;
		this.city = city;
		this.address = address;
	}
	
	public int getAddrno() {
		return addrno;
	}
	public String getCity() {
		return city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddrno(int addrno) {
		this.addrno = addrno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Addr [addrno=" + addrno + ", city=" + city + ", address=" + address + "]";
	}
	
	
}




//CREATE TABLE addr(
//    addrno number primary key,
//    city VARCHAR2(20) check(city in('서울시', '인천시', '부산시', '제주시')),
//    address VARCHAR2(20)
//);