package company;

public class Employee {
//フィールド
    String name;
    Department department;
    String position;
    int employeeId;
    
    //コンストラクター
    public Employee(String name,Department department2,String position,int employeeId) {
        this.name=name;
        this.department=department2;
        this.position=position;
        this.employeeId=employeeId;
    }
    
    //報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position +"名前：" +name);
    
    }
    //報告メソッド（オーバーロード）
    public void report() {
        report(1);
    }

    public void joinMeeting() {
        // TODO 自動生成されたメソッド・スタブ
        
    }
}
