package project_app

class Award {
    Date awardDate
    String type
    Integer points
    static belongsTo = [customer: Customer]

    static constraints = {
        type(inList: ["Purchase", "Reward"])
    }
}
