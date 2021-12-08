package master.com;
  public class Department{
	  int num;
	  public Department(int num) {
		super();
		this.num = num;
	}
	  String s="abcdef";

	  /**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[]args) {
		  String s9="abcdef";
		  String s12="abcdef";
		  s12=s12.concat("xyz");
		  String s10="      a b cd e     f ";
		  System.out.println(s12);
		  String s13="abcdef";
		 // s13=s13.contains("de");
		  System.out.println(s9.substring(1,3));
		 System.out.println(s10.length());
		 String s11="abcdef";
		 System.out.println(s11.replace('a','k'));
		 System.out.println(s11.charAt(5));

	      String s1=new String("pune");
		  String s2=new String("pune");
		  String s3=new String("mumbai");
		  String s4=new String("kolhapur");
		  String s5="pune";
		  String s6="mumbai";					  
		  String s7="pune";
		  String s8="a,b,c,d,e,f";
		  String s14="mumbai";
		  System.out.println(s14.equalsIgnoreCase(s14));
		  System.out.println(s14.isEmpty());
//substring(2,4);
		  Department t1=new Department(999);
		  Department t2=new Department(999);
		  
		//System.out.println(t1.equals(t2));  
		 
		System.out.println(s1==s2);
		System.out.println(s1==s5);
		System.out.println(s1.equals(s7));
		System.out.println(s1.equals(s5));
		System.out.println(s5==s7);
		System.out.println(s5.equals(s4));
		System.out.println(s3.equals(s6));
		System.out.println(s5.equals(s7));

	  }
  }
  