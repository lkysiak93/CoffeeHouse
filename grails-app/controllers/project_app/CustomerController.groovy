package project_app

class CustomerController {
    static scaffold = Customer

    def lookup() {
        def customerInstance = Customer.list()
        [customerInstanceList: customerInstance]
    }

    def checkin() { }

    def index() {
        params.max = 10
        [customerInstanceList: Customer.list(params), customerInstanceCount: Customer.count()]
    }
}
