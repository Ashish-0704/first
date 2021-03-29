package first;

class Emp {
String name,address;
long year;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getYear() {
	return year;
}
public void setYear(long year) {
	this.year = year;
}

}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		e1.setName("Ashish");
		e1.setAddress("Indore");
		e1.setYear(1999);
		e2.setName("Hitesh");
		e2.setAddress("Bangalore");
		e2.setYear(1999);
		e3.setName("Somesh");
		e3.setAddress("Chennai");
		e3.setYear(1999);
		System.out.println("Name   Address   Year");
		System.out.println(e1.getName()+" "+e1.getAddress()+"    "+e1.getYear());
		System.out.println(e2.getName()+" "+e2.getAddress()+" "+e2.getYear());
		System.out.println(e3.getName()+" "+e3.getAddress()+"   "+e3.getYear());
	}

}
