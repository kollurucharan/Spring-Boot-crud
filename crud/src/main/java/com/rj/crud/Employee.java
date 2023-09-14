package com.rj.crud;

public class Employee {
	private Integer empNo;
	private Integer deptNo;
	private String eName;
	private String job;
	private Double sal;

	public Employee() {
	}

	public Employee(Integer eno, Integer dno, String enm, String jb, Double sal) {
		this.empNo = eno;
		this.eName = enm;
		this.job = jb;
		this.sal = sal;
		this.deptNo = dno;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer eno) {
		this.empNo = eno;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer dno) {
		this.deptNo = dno;
	}

	public String getEName() {
		return eName;
	}

	public void setEName(String enm) {
		this.eName = enm;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String jb) {
		this.job = jb;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", deptNo=" + deptNo + ", eName=" + eName + ", job=" + job + ", sal=" + sal
				+ "]";
	}

}