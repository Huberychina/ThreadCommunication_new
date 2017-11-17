package hambergPackage;
public class HambergTest{
	public static void main(String[] Args){
		HMaker hm = new HMaker();
		HAssistant ha = new HAssistant();
		
		ha.start();
		hm.start();
	}
	
	
}