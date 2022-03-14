package project_app

class WhiteboardController {

    def CalculationsService

    def index() { }

    def variables(){
        def myTotal = 1
        render("Total: $myTotal")
        render("</br> $myTotal.class")

        def firstName = "Lukasz"
        render("</br>Name: $firstName")
        render("</br> $firstName.class")

        def today = new Date()
        render("</br>Today is: $today")
        render("</br> $today.class")
    }

    def strings(){
        def first = "Lukasz";
        def last = "Kysiak";
        def points = 4;
        render "Welcome $first. Your name has ${first.length()} characters. You already have $points points!"
    }

    def conditions(){
        def welcomeMsg = CalculationsService.welcome(params)
        render (welcomeMsg)
    }
}
