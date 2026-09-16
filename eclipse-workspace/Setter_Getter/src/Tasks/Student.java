package Tasks;

public class Student {
	private int sid;
	private String sname;
	private String address;
	private long contact;
	private char grade;

	public void setSid(int stdid) {
		sid = stdid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String stdname) {
		sname = stdname;
	}

	public String getSname() {
		return sname;
	}

	public void setAddress(String stdadd) {
		address = stdadd;
	}

	public String getAddress() {
		return address;
	}

	public void setContact(long stdcont) {
		contact = stdcont;
	}

	public long getContact() {
		return contact;
	}

	public void setGrade(char stdgrade) {
		grade = stdgrade;
	}

	public char getGrade() {
		return grade;
	}
}
