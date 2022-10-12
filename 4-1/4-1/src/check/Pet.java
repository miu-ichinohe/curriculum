package check;

public class Pet {

	    private String name;
	    private String masterName;
	
	    //コンストラクタ
	　　　　　　 //①アクセス修飾子②コンストラクタ名（クラス名と同じにする）（③引数の型、④引数名）
	    public Pet(String name, String masterName) {
	           //↓５行目のname = 引数のname
		this.name = name;
	        this.masterName = masterName;
	    }

	    protected String getName() {
	        return name;
	    }

	    protected String getMasterName() {
	        return masterName;
	    }

	    public void introduce() {
	        System.out.println("■僕の名前は" + name + "です");
	        System.out.println("■ご主人様は" + masterName + "です");
	    }
	}
	class RobotPet extends Pet {
	    public RobotPet(String name, String masterName) {
	        super(name, masterName);
	    }

	    public void introduce() {
	        System.out.println("◇私はロボット。名前は" + getName() + "。");
	        System.out.println("◇ご主人様は" + getMasterName() + "。");
	    }
	}
