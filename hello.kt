
package org.example

import kotlin.math.absoluteValue

fun main() {
    val paymentService = PaymentService()
    println(paymentService.processPaymentWithPaypal(50.0)) // Process payment via Paypal API
    println(paymentService.processPaymentWithStripe(50.0)) // Process payment via Stripe API
}

class User {}

// Class User is doing multiple responsibility here

class SystemManager {
    fun addUser(user: User) { }
    fun deleteUser(user: User) { }
    fun sendNotification(notification:String) {}
    fun sendEmail(user: User, email: String) {}
}

// <--------------->

// Correct Approach is like this

class MailManager() {
    fun sendEmail(user:User,email:String) {}
}

class NotificationManager() {
    fun sendNotification(user:User, notification:String){}
}

class UserManager() {
    fun addUser(user:User) {}
    fun deleteUser(user:User){}
}

// <-------------------->


interface Shape {
    fun area(): Double
}

class Rectangle(val width: Double, val height: Double) : Shape {
    override fun area() = width * height
}

class Circle(val width: Double, val height: Double): Shape {
    override fun area(): Double {
        return width * height
    }
}

fun calculateArea(shape:Shape) = shape.area()


// Liskov Substitution Principle

//class Penguin: Bird() {
//    override fun cantFly() {
//        print("Penguins can't fly ")
//    }
//}
// Ends here

// How does Liskov Substitution comes here

open class Bird {
    // common bird methods and properties
}


// add here the abilities of flying birds
interface Flyable {
    fun fly(): Boolean
}

// When we face the non-flying bird, we can diversify the logic
class Penguin : Bird() {
    //methods and properties specific to penguins
}

class Eagle: Bird(), Flyable {
    override fun fly(): Boolean{
        return true
    }
}

// <-------------------->

// We can divide the interfaces, so we  avoid throwing Exception on specific cases 
// when some of the subclasses don't have the certain habit in parent class
interface Animal {
    fun swim()
    fun fly()
}

class Duck : Animal {
    override fun swim() {
        println("Duck swimming")
    }

    override fun fly() {
        println("Duck flying")
    }
}

class Penguin : Animal {
    override fun swim() {
        println("Penguin swimming")
    }

    override fun fly() {
        throw UnsupportedOperationException("Penguin cannot fly")
    }
}

class PaymentService {
    private val paymentProcessorPaypal = PaypalPaymentProcessor()
    private val paymentProcessorStripe = StripePaymentProcessor()

    fun processPaymentWithPaypal(amount: Double): Boolean {
        return paymentProcessorPaypal.processPayment(amount)
    }

    fun processPaymentWithStripe(amount: Double): Boolean {
        return paymentProcessorStripe.processPayment(amount)
    }
}

class PaypalPaymentProcessor {
    fun processPayment(amount: Double): Boolean {
        // Process payment via PayPal API
        return true
    }
}

class StripePaymentProcessor {
    fun processPayment(amount: Double): Boolean {
        // Process payment via Stripe API
        return true
    }
}


// Correct Approach


// Dependency Inversion Principle Correct Usage
// In the correct usage example, we did not have to implement hard code about our payment methods in our Service class,
// because we set up an abstract structure with the interface that we created.

interface PaymentProcessor {
    fun processPayment(amount: Double): Boolean
}

class PaypalPaymentProcessor : PaymentProcessor {
    override fun processPayment(amount: Double): Boolean {
        // Process payment via Paypal API
        return true
    }
}

class StripePaymentProcessor : PaymentProcessor {
    override fun processPayment(amount: Double): Boolean {
        // Process payment via Stripe API
        return true
    }
}

class PaymentService(private val paymentProcessor: PaymentProcessor) {
    fun processPayment(amount: Double): Boolean {
        return paymentProcessor.processPayment(amount)
    }
}

fun main() {
    val paymentProcessor = PaypalPaymentProcessor()
    val paymentService = PaymentService(paymentProcessor)
    println(paymentService.processPayment(50.0)) // Process payment via Paypal API
