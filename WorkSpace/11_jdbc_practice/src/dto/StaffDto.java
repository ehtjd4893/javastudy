package dto;

import java.sql.Date;

public class StaffDto {
	private int no;
	private String name;
	private String department;
	private Date hireDate;
	
	
	@Override
	public String toString() {
		return "StaffDto [no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}