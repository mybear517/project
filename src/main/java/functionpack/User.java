package functionpack;

public class User {
     private int userNo;
     private String name;
     private String city;
	
     public User(int userNo, String name, String city) {
		super();
		this.userNo = userNo;
		this.name = name;
		this.city = city;
	}
   public User() {
	   
   }
public int getUserNo() {
	return userNo;
}
public void setUserNo(int userNo) {
	this.userNo = userNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "User [userNo=" + userNo + ", name=" + name + ", city=" + city + "]";
}
     
}
