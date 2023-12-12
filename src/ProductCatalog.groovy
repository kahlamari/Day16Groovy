class ProductCatalog {
    private Map<String, Product> products = [:]
    private static final int LOW_STOCK_THRESHOLD = 10


    void addProduct(String productId, String name, double price, int quantity) {
        products[productId] = new Product(name, price, quantity)
    }

    void updateProduct(String productId, String newName, double newPrice, int newQuantity) {
        if (products.containsKey(productId)) {
            Product product = products[productId]
            product.setName(newName)
            product.setPrice(newPrice)
            product.setQuantity(newQuantity)
        }
    }

    void removeProduct(String productId) {
        products.remove(productId)
    }

    Product getProduct(String productId) {
        return products[productId]
    }

    void listProducts() {
        products.each { productId, product ->
            println("$productId: ${product.name}, Price: \$${product.price}, Quantity: ${product.quantity}")
        }
    }

    void updateStock(String productId, int newQuantity) {
        if (products.containsKey(productId)) {
            products[productId].setQuantity(newQuantity)
            if (newQuantity <= LOW_STOCK_THRESHOLD) {
                alertLowStock(productId)
            }
        }
    }

    private void alertLowStock(String productId) {
        println("Achtung: Geringer Bestand für Produkt $productId")
    }

    void updatePrice(String productId, double newPrice) {
        if (products.containsKey(productId)) {
            products[productId].setPrice(newPrice)
        }
    }

    void listPriceChanges() {
        println("Preisänderungen:")
        products.each { productId, product ->
            product.listPriceChanges()
        }
    }
}
