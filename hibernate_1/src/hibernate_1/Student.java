package hibernate_1;

import java.util.Date;

/**
 * ���ԭ��
 * 1����һ�����������Ĺ��췽��
 * 2��������
 * 3������˽��
 * 4���ṩgetter��setter����
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
