package hibernate_1;

import java.util.Date;

/**
 * 设计原则：
 * 1，有一个不带参数的构造方法
 * 2，公有类
 * 3，属性私有
 * 4，提供getter和setter方法
 */

public class Student 
{
	private int sid;
	private String name;
	private String sx;
	private Date birth;
	private String addr;
	
	public Student()
	{
		
	}
	

	public Student(int sid, String name, String sx, Date birth, String addr) 
	{
		this.sid = sid;
		this.name = name;
		this.sx = sx;
		this.birth = birth;
		this.addr = addr;
	}


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSx() {
		return sx;
	}

	public void setSx(String sx) {
		this.sx = sx;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sx=" + sx
				+ ", birth=" + birth + ", addr=" + addr + "]";
	}
	
	

}
