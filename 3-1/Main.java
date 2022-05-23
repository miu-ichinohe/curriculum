/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
    public static void main(String[] args){
        
　　　　　　　　　　　　　　　　　//↓int型の配列dateに、3,1,2,7,5を代入
        int[] data ={3,1,2,7,5};

        
        /* 
          iは0から始まり、for文内の処理（print()による表示）を実行しながら 
          1ずつ増えていき、data.length（＝5） になったところでループを終了する。
          ※lengthは配列内の要素数を指定できる 属性(プロパティ) です。
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        
        System.out.println();     //改行を出力
        
        
        /*
          i=0（初期値）; i <　4回繰り返す（繰り返し条件）; i++（１ずつ増やす）
          j > i なるまで繰り返す; 1ずつ減らしていく
        */ 
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                
                
                if(data[i] > data[j]){
                  int box = data[i];
                  data[i] = data[j];
                  data[j] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
