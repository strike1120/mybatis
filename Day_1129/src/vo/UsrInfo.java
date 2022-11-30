package vo;

public class UsrInfo {
  private String usrid; //DB테이블의 컬럼명과 동일한 이름으로 설정!
  private String usrname;
  private int age;
  
  //생성자 2개, 세터게터, toString()
  public UsrInfo() {
	  super();
  }

public UsrInfo(String usrid, String usrname, int age) {
	super();
	this.usrid = usrid;
	this.usrname = usrname;
	this.age = age;
}

public String getUsrid() {
	return usrid;
}

public String getUsrname() {
	return usrname;
}

public int getAge() {
	return age;
}

public void setUsrid(String usrid) {
	this.usrid = usrid;
}

public void setUsrname(String usrname) {
	this.usrname = usrname;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "usrid=" + usrid + ", usrname=" + usrname + ", age=" + age;
} 
  

}


