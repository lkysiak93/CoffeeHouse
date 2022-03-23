package project_app

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {

        def firstName = params.first
        def totalPoints = params.points.toInteger()
        def welcomeMsg = ""

        switch (totalPoints){
            case 5..10:
                welcomeMsg = "Hello $firstName! This is free drink for you!"
                break
            case 4:
                welcomeMsg = "Hello $firstName! Your next drink is free!"
                break
            case 2..3:
                welcomeMsg = "Hello $firstName! You now have $totalPoints points!"
                break
            default:
                welcomeMsg = "Hello $firstName! Thanks you for registration!"
                break
        }
        return welcomeMsg
    }

    def getTotalPoints(customerInstance){
        def totalAwards = 0
        customerInstance.awards.each{
            totalAwards = totalAwards + it.points
        }
        customerInstance.totalPoints = totalAwards
        return customerInstance
    }

    def processCheckin(lookupInstance){
        //Lookup customer by phone number
        def customerInstance = Customer.findByPhone(lookupInstance.Phone)

        //Set up new Customer
        if(customerInstance == null){
            customerInstance = lookupInstance
            customerInstance.firstName = "Customer"
            customerInstance.lastName = "New"
            customerInstance.email = "new@customer.com"
        }

        //Calculate current award points
        def totalAwards = customerInstance.totalPoints

        //Create welcome messages
        def welcomeMessage =""

        switch (totalAwards){
            case 5..10:
                welcomeMessage = "Welcome back $customerInstance.firstName! This is free drink for you!"
                break
            case 4:
                welcomeMessage = "Welcome back $customerInstance.firstName! Your next drink is free!"
                break
            case 1..3:
                welcomeMessage = "Welcome back $customerInstance.firstName! You now have $totalAwards points!"
                break
            default:
                welcomeMessage = "Hello $customerInstance.firstName! Thanks you for registration!"
                break
        }

        //Add new award
        if(totalAwards < 5){
           // customerInstance.addToAwards(new Award(awardDate: new Date(), type: "Purchase", points: 1))
            if (customerInstance.totalPoints == null){
                customerInstance.totalPoints = 1
            } else{
                customerInstance.totalPoints = customerInstance.totalPoints + 1
            }
        }else {
           // customerInstance.addToAwards(new Award(awardDate: new Date(), type: "Reward", points: -5))
            customerInstance.totalPoints = customerInstance.totalPoints - 5
        }

        //Save customer
        customerInstance.save()

        return [customerInstance, welcomeMessage]
    }
}
