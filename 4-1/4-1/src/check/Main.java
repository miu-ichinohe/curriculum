//MainクラスとPetクラスファイルをまとめているパッケージ(check)
package check;

//constansパッケージの中のConstantsクラスを実行できるようにしている
import constans.Constants;


public class Main {
	
	//メインメソッド
	public static void main(String[] args) {
		//printNameメソッド実行　引数として一戸、美羽を渡す
		printName ("一戸" , "美羽");
		
		
		Pet pet = new Pet (Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE);
		pet. introduce(); 
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2 , Constants.CHECK_CLASS_LUKE);
		robotPet .introduce();
	}
	
	//printNameメソッド
	//渡された引数を受け取っている　　String（文字列）　のfirstName→一戸　と　lastName→美羽
	private static void printName(String firstName , String lastName) {
		//printNameメソッド + ⇨ firstName(一戸)　lastName（美羽）　をコンソールに出力
		System.out.println("printNameメソッド" + " ⇨ " + firstName + lastName);
	}
	
}
