package section14_object_oriented_programming;

class product{
    private int product_id;
    private String product_name;
    private String product_category;
    private float product_price;
    private String product_company;


    public void setproductid(int product)
    {
        product_id=product;

    }
    public int  getproduct_id()
    {
        return product_id;
    }
    public void setproduct(String product)
    {
        product_name=product;

    }
    public String getproduct_name()
    {
        return product_name;
    }
    public void setproductcategory(String category)
    {
        product_category=category;

    }
    public String getproduct_category()
    {
        return product_category;
    }
    public void setproductprice(float price)
    {
        product_price=price;

    }
    public float getproduct_price()
    {
        return product_price;
    }

    public void setproductcompany(String company)
    {
        product_company=company;

    }
    public String getproduct_company()
    {
        return product_company;
    }

    public void print(){
        System.out.println("the id id " + product_id);
        System.out.println("the product name is " + product_name);
        System.out.println("the product category is " + product_category);
        System.out.println("the price of product is " +  product_price);
        System.out.println("the product company is " + product_company);
    }

}
public class oops12 {


    public static void main(String[] args) {
 product obj=new product();
 obj.setproduct("anish");
       obj.setproductid(1234);
       obj.setproductcategory("general");
       obj.setproductprice(123.4f);
       obj.setproductcompany("oppo");
       obj.print();
    }
}
