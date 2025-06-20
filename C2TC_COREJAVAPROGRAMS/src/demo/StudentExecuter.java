package demo;

public class StudentExecuter {

	public static void main(String[] args) {
		
          StudentJ st=StudentJ.getS1();
    st.setSid(101);
    st.setSname("jai");
    
    StudentJ st1=StudentJ.getS1();
    
    System.out.println(st1);
    System.out.println(st);
    
	}

}
