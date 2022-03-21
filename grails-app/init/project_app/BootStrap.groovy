package project_app

class BootStrap {

    def init = { servletContext ->

        new project_app.Product(name: "Morning Blend", sku: "MB01", price: 12.20).save()
        new project_app.Product(name: "Dark Roast", sku: "DR01", price: 15.40).save()
        new project_app.Product(name: "Cafe Late", sku: "MB01", price: 13.20).save()
        new project_app.Product(name: "Lungo", sku: "MB01", price: 11.10).save()
        new project_app.Customer(firstName: "Krystyna", lastName: "Allison", email: "Allison@lala.com", phone: 8015551212, totalPoints: 1).save()
        new project_app.Customer(firstName: "Lukasz", lastName: "Kysiak", email: "Kysiak@lala.com", phone: 8015551234, totalPoints: 6).save()
        new project_app.Customer(firstName: "Monika", lastName: "Nowak", email: "trala@lala.com", phone: 8015551516, totalPoints: 3).save()
        new project_app.Customer(firstName: "Mriola", lastName: "Kowalska", email: "Kowalska@lala.com", phone: 8015631212, totalPoints: 4).save()
        new project_app.Customer(firstName: "Jan", lastName: "Glowa", email: "Glowa@lala.com", phone: 8015558992, totalPoints: 2).save()
        new project_app.Customer(firstName: "Marcin", lastName: "Majewski", email: "Majewski@lala.com", phone: 8088851212, totalPoints: 2).save()
        new project_app.Customer(firstName: "Zofia", lastName: "Mariacka", email: "Mariacka@lala.com", phone: 8017971212, totalPoints: 1).save()

    }
    def destroy = {
    }
}
