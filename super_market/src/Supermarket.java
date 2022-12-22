public class Supermarket {

    private Product [] products;
    private Customer [] customers;
    private Information information;

    public Supermarket(String name, String address, String phone, int productQty, int customerQty){
        information = new Information(name, address, phone);
         if (productQty < 100)
         {
             productQty = 100;
         }

         if (customerQty < 100) {
             customerQty = 100;
         }
        products = new Product[productQty];
        customers = new Customer [customerQty];
    }

    public void addProduct(String itemNum, String name, int qty, double price)
    {
        Product newProduct = new Product(itemNum, name, qty, price);

    }


}
