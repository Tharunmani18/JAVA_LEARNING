class demo{
    public int id;
    public String name;

    public void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name = name;
    }

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }
}
public class encap {
    public static void main(String[] args) {
        demo d = new demo();
        d.setid(0001);
        d.setname("Tharun");
        System.out.println("you're id :"+d.getid());
        System.out.println("you're name is :"+d.getname());
    }
}
