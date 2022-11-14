package bean;
/**
 * ・社員情報データ（モデル）
 */
public class EmployeeBean {
    private String Id;
    private String PassWord;
    private String Name;
    private String Comment;
    private String Login_Time;
    
    //IDを取得
    public void setId(String Id) {
        this.Id = Id;
    }
    //IDを設定
    public String getId() {
        return Id;
    }
    //PassWordを取得
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    //PassWordを設定
    public String getPassWord() {
        return PassWord;
    }
    //Nameを取得
    public void setName(String Name) {
        this.Name = Name;
    }
    //Nameを設定
    public String getName() {
        return Name;
    }
    //Login_Timeを取得
    public void setLogin_Time(String Login_Time) {
        this.Login_Time = Login_Time;
    }
    //Login_Timeを設定
    public String getLogin_Time() {
        return Login_Time;
    }
    //Commentを取得
    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    //Commentを設定
    public String getComment() {
        return Comment;
    }
}

/*
外部からアクセスされるフィールドに対して、アクセッサメソッドを持つことです。
値を設定するメソッドがsetterで、setXxx()というメソッド名になる。
値を取得するメソッドがgetterで、getXxx()というメソッド名になる。
*/
