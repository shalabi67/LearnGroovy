package rewards

class InventoryController {

    def index() {
        render "Welcome to inventory controller."
    }

    def edit() {
        def productName = "This is my product"
        def sku = "my sku"

        [productName: productName, sku: sku]
    }

    def list() {
        def products = Product.all
        [allProducts: products]
    }
}
