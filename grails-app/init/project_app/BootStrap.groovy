package project_app

class BootStrap {

    def init = { servletContext ->
        new project_app.Product(name: "Morning Blend", sku: "MB01", price: 12.20).save()
        new project_app.Product(name: "Dark Roast", sku: "DR01", price: 15.40).save()
        new project_app.Product(name: "Cafe Late", sku: "MB01", price: 13.20).save()
        new project_app.Product(name: "Lungo", sku: "MB01", price: 11.10).save()
    }
    def destroy = {
    }
}
