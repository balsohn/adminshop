package j0524;

public class Member {
	//[1]source를 이용해서 자동 getter, setter생성
	//[2]lombok : 라이브러리만 추가하면 자동 getter, setter생성 
	
	private String userid;
	private String name;
	private String phone;
	private String email;
	private int age;
	private double height;
	private double weight;
	private String zip;
	private String juso;
	private String jusoEtc;
	private int level;
	private int pay;
	
	//[1]
	//우클 source -> Generate Getter and Setter 
	//생성하고 싶은 목록 선택 가능 
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getJuso() {
		return juso;
	}
	public void setJuso(String juso) {
		this.juso = juso;
	}
	public String getJusoEtc() {
		return jusoEtc;
	}
	public void setJusoEtc(String jusoEtc) {
		this.jusoEtc = jusoEtc;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
 
}
