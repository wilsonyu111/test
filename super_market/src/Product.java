public class Product {

    private String itemNum;
    private String name;
    private int qty;
    private double price;


    Product(String itemNum, String name, int qty, double price)
    {
        this.itemNum = itemNum;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void setQty(int qty)
    {
        if (qty > 0)
        {
            this.qty = qty;
        }
    }

    public void setPrice(int price)
    {
        if(price > 0.0)
        {
            this.price = price;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getItemNum()
    {
        return this.itemNum;
    }

    public int getQty()
    {
        return this.qty;
    }

    public double getPrice()
    {
        return this.price;
    }
}
