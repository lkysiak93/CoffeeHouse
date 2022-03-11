package project_app

class Customer {
    String firstName
    String lastName
    String phone
    String email
    Integer totalPoints
    static hasMany = [awards:Award, orders:OnlineOrder]

    static constraints = {
        firstName(maxSize: 25, nullable: false)
        lastName(maxSize: 25, nullable: false)
        email(maxSize: 50, email: true)
        phone(maxSize: 12, nullable: true)
        totalPoints(max: 10, nullable: true)
    }
}
