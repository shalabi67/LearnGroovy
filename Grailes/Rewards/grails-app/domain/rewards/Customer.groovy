package rewards

class Customer {
    String firstName
    String lastName
    Integer totalPoints
    String phone
    String email

    static hasMany = [awards: Award, orders: OnlineOrder]
    static constraints = {
        //set fields orders
        email(nullable: false, size: 1..255, email: true)
        phone(nullable: false)
        firstName(nullable: true, maxSize: 50)
        lastName(nullable: true, maxSize: 50)

        totalPoints()
    }
}
