import java.util.*;
import java.io.*;
class EmailAdministration{
	private String fname;
	private String lname;
	private String dept;
	private String pwd;
	private String email;
	public void changePass(String pass) {
		this.pwd=pass;
		
	}
	public void getDetails() {
               
		System.out.println("Name:" + fname+" "+ lname);
                
		System.out.println("Email:" +email);
		System.out.println(pwd);
	}
	public String generateRandom() {
		String string ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=8;i++) {
			int index=(int)(string.length()*Math.random());
			sb.append(string.charAt(index));
		}
		return sb.toString();
		
	}
	public EmailAdministration(String fname, String lname,String dept) {
		this.fname=fname;
		this.lname=lname;
		this.dept=dept;
		this.email=lname.toLowerCase()+fname.toLowerCase()+"."+dept+"@gmail.com";
	this.pwd=generateRandom();
}
	
}
public class EmailVerify {
public static void main(String args[]) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter  fname");
	String fname =br.readLine();
        System.out.println("enter  Lname");
	String lname = br.readLine();
        System.out.println("enter  number");
	String dept = br.readLine();
	EmailAdministration obj = new EmailAdministration(fname,lname,dept);
	obj.getDetails();
	
}
}
