package maven.myjdbc1;

import java.util.Date;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private float sal;
	private Date hiredate;
	private float comm;
	private int depno;
	private int mgr;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public float getComm() {
		return comm;
	}
	public void setComm(float comm) {
		this.comm = comm;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getDepno() {
		return depno;
	}
	public void setDepno(int depno) {
		this.depno = depno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", depno=" + depno + "]";
	}
	public Emp(int empno, String ename, String job, float sal, int depno) {
		//super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.depno = depno;
	}
	public Emp() {
		//Super();
	}
}
