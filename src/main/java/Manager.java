public class Manager extends Empee{
    int teamSize;

    public Manager(String name,String department,int teamSize){
        super(name,department);
        this.teamSize = teamSize;
    }

    @Override
    public void work(){
        System.out.println(name + "(" + department + ")正在管理" + teamSize + "的团队" );

    }

    public void approve() {
        System.out.println(name + "审批通过了一份文件");
    }
}
