static void main(String[] args) {
  ProductCatalog catalog = new ProductCatalog()

  // Hinzufügen von drei Produkten mit Menge
  catalog.addProduct("001", "Apfel", 0.99, 100)
  catalog.addProduct("002", "Brot", 1.99, 50)
  catalog.addProduct("003", "Milch", 0.89, 80)

  // Auflisten der Produkte im Katalog
  catalog.listProducts()

  // Aktualisieren des Bestands
  catalog.updateStock("001", 45) // Keine Warnung, Bestand über dem Schwellenwert
  catalog.updateStock("002", 10) // Warnung, geringer Bestand

  // Aktualisieren der Preise
  catalog.updatePrice("001", 1.29) // Preisänderung für Äpfel
  catalog.updatePrice("001", 2.29) // Preisänderung für Äpfel
  catalog.updatePrice("002", 1.79) // Preisänderung für Brot
  catalog.updatePrice("003", 0.99) // Preisänderung für Milch

  // Auflisten der Preisänderungen
  catalog.listPriceChanges()
}