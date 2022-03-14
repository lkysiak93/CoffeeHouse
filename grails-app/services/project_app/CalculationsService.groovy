package project_app

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {

        def firstName = params.first
        def totalPoints = params.points.toInteger()
        def welcomeMsg = ""

        switch (totalPoints){
            case 5:
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
}
