package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.saveContact();
		obj.makeCall();
		obj.sendMsg();
	
	}
	
private void sendMsg() {
	System.out.println("Send Message Method");
}

 void makeCall() {
	System.out.println("Makecall Method");
}
 
public void saveContact() {
	System.out.println("saveContact Method");
}

}
