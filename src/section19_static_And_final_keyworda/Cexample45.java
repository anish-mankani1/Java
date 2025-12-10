package section19_static_And_final_keyworda;


interface  A{
    void pro();

}
interface B {
    void promax();


}
class C implements A,B
{
    public void pro()
    {
        System.out.println("hello from pro");
    }
    public void promax()
    {
        System.out.println("hello from promax");
    }


}

public class Cexample45 {
    public static void main(String[] args) {
        C obj=new C();
        obj.pro();
        obj.promax();

    }
}
