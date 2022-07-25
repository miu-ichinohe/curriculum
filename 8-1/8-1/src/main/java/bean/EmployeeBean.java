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
    public void setId(String Id) {
        this.Id = Id;
    }
    public String Id() {
        return Id;
    }
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    public String getPassWord() {
        return PassWord;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }
    public void setLogin_Time(String Login_Time) {
        this.Login_Time = Login_Time;
    }
    public String getLogin_Time() {
        return Login_Time;
    }
    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    public String getComment() {
        return Comment;
    }
}

/*
外部からアクセスされるフィールドに対して、アクセッサメソッドを持つことです。
セッターメソッド
フィールドの値を設定するためのアクセッサメソッド、「setフィールド名」という形で記述します。
ゲッターメソッド
フィールドの値を取得するためのアクセッサメソッド、「getフィールド名」という形で記述します。
*/
