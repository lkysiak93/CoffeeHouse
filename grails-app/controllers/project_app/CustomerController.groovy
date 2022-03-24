package project_app

class CustomerController {
    static scaffold = Customer

    def calculationsService

    def lookup() {
        def customerInstance = Customer.list()
        [customerInstanceList: customerInstance]
    }

    def customerLookup(Customer lookupInstance){
        def (customerInstance, welcomeMessage) = calculationsService.processCheckin(lookupInstance)
        render (view: "checkin", model: [customerInstance: customerInstance, welcomeMessage: welcomeMessage])
    }

    def checkin() { }

    def profile() {
        def customerInstance = Customer.findByPhone(params.id)
        [customerInstance: customerInstance]
    }

    def updateProfile(Customer customerInstance){
        customerInstance.save()
        render(view: "profile", model:[customerInstance: customerInstance])
    }
}