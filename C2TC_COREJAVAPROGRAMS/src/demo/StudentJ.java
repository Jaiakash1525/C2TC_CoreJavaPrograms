package demo;

public class StudentJ {
	private static StudentJ s1=new StudentJ();
	

    public static StudentJ getS1() {
		return s1;
	
	}
	private int sid;
    private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "StudentJ [sid=" + sid + ", sname=" + sname + "]";
	}
	private StudentJ() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	 
	    
	}

