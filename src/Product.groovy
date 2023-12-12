import java.text.DecimalFormat

class Product {
    String name
    double price
    int quantity
    List<Double> priceHistory = []
    DecimalFormat decimalFormat = new DecimalFormat("0.00")


    Product(String name, double price, int quantity) {
        this.name = name
        this.price = price
        this.quantity = quantity
        this.priceHistory.add(price)
    }

    void setPrice(double newPrice) {
        this.priceHistory.add(newPrice)
        this.price = newPrice
    }

    void listPriceChanges() {
        println("$name - Preisänderungen:")
        priceHistory.eachWithIndex { price, index ->
            println("Änderung $index: \$${decimalFormat.format(price)}")
        }
    }
}