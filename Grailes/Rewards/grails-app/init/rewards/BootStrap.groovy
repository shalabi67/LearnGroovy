package rewards

class BootStrap {

    def init = { servletContext ->
        def breakfast = new Product(id: 1, name: "Breakfast blind", sku: "BB01", price: 14.95).save()
        def columbia = new Product(id: 2, name: "Columbia", sku: "CO01", price: 15.05).save()
    }
    def destroy = {
    }
}
