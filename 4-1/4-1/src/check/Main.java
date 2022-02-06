package check;

import constans.Constants;

public class Main {
	

	public static void main(String[] args) {
		printName ("一戸" , "美羽");
		
		Pet pet = new Pet (Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE);
		pet. introduce(); 
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2 , Constants.CHECK_CLASS_LUKE);
		robotPet .introduce();
	}
	
	private static void printName(String firstName , String lastName) {
		System.out.println("printNameメソッド" + " ⇨ " + firstName + lastName);
	}
	
}
