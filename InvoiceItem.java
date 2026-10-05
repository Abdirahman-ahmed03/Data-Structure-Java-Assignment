package D_S_Assignment;

public class InvoiceItem {
    // Fields
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // GETTERS
    // ==========================================
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    //  SETTERS
    // ==========================================
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    //  METHODS
    // ==========================================
    // Calculates Total Price (unitPrice * qty)
    public double getTotal() {
        return unitPrice * qty;
    }

    // Returns String representation of the object
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}

class TestInvoiceItem {
    public static void main(String[] args) {

        InvoiceItem item1 = new InvoiceItem("A101", "Pen Blue", 540, 0.4);
        System.out.println(item1);

        item1.setQty(660);
        item1.setUnitPrice(0.99);
        System.out.println(item1);
        System.out.println("id is: " + item1.getId());
        System.out.println("desc is: " + item1.getDesc());
        System.out.println("qty is: " + item1.getQty());
        System.out.println("unitPrice is: " + item1.getUnitPrice());

        System.out.println("The total is: " + item1.getTotal());
    }
}