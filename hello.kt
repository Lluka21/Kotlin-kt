package org.example

import kotlin.math.absoluteValue

fun main() {

}

// DIP  
interface MessageService {
    fun send(message: String)
}

class EmailService : MessageService {
    override fun send(message: String) {
        println("Sending email: $message")
    }
}

class SmsService : MessageService {
    override fun send(message: String) {
        println("Sending SMS: $message")
    }
}

class NotificationManager(
    private val messageService: MessageService
) {
    fun notifyUser(message: String) {
        messageService.send(message)
    }
}
//



// Interface Segregaton Principle Solton
interface Workable {
    fun work()

}

interface Eatable {
    fun eat()
}

interface Sleepable {
    fun sleep()
}

class HumanWorker : Workable,Eatable,Sleepable {
    override fun work() {
        println("Human is working")
    }
    override fun eat() {
        println("Human is eating")
    }
    override fun sleep() {
        println("Human is sleeping")
    }
}

class RobotWorker : Workable {
    override fun work() {
    }
}
//


// Single Responsibility Principe
class UserCreation {
    fun createUser(name: String) {
        println("Creating user: $name")
    }
}

class SaveUserInData {
    fun saveUserToDatabase(name: String) {
        println("Saving $name to database")
    }
}

class SendWelcome {
    fun sendWelcomeEmail(name: String) {
        println("Sending welcome email to $name")
    }
}

class UserManager(
    private val userCreator: UserCreation,
    private val userRepository: SaveUserInData,
    private val emailService: SendWelcome
) {

    fun registerUser(name: String) {
        userCreator.createUser(name)
        userRepository.saveUserToDatabase(name)
        emailService.sendWelcomeEmail(name)
    }
}
// 


// Open/Close Responsibility Principle

interface PaymentMethod {
    fun pay(amount: Double)
}

class CardPayment: PaymentMethod {
    override fun pay(amount:Double) {
        println("Paying  $amount by card")
    }
}

class CryptoPayment: PaymentMethod {
    override fun pay(amount:Double) {
        println("Paying  $amount by crypto")
    }
}

class CashPayment: PaymentMethod {
    override fun pay(amount:Double) {
        println("Paying  $amount by cash")
    }
}

class PaymentProcessor {
    fun processPayment(
        paymentMethod: PaymentMethod,
        amount: Double
    ) {
        paymentMethod.pay(amount)
    }
}
//

// Single Responsibility Prinicple

class OrderCreation {
    fun createOrder(product: String) {
        println("Creating order for $product")
    }
}

class InvoicePrinter {
    fun printInvoice(product: String) {
        println("Printing invoice for $product")
    }
}

class ConfirmationEmailSender {
    fun sendConfirmationEmail(product: String) {
        println("Sending confirmation email for $product")
    }
}

class ShippingCalculator {
    fun calculateShipping(product: String) {
        println("Calculating shipping for $product")
    }
}

class OrderService {
    private val order = OrderCreation()
    private val invoice = InvoicePrinter()
    private val email = ConfirmationEmailSender()
    private val shipmentCalc = ShippingCalculator()

    fun processOrder(product: String) {
        order.createOrder(product)
        invoice.printInvoice(product)
        email.sendConfirmationEmail(product)
        shipmentCalc.calculateShipping(product)
    }
}

//

// Still Interface Segregation method 

interface OpenDocument {
    fun open()
}

interface EditDocument {
    fun edit()
}

interface PrintDocument {
    fun print()
}

class TextDocument : OpenDocument,EditDocument,PrintDocument {
    override fun open() {
        println("Opening text document")
    }
    override fun edit() {
        println("Editing text document")
    }
    override fun print() {
        println("Printing text document")
    }
}

class ReadOnlyDocument : OpenDocument, PrintDocument{
    override fun open() {
        println("Opening read-only document")
    }
    override fun print() {
        println("Printing read-only document")
    }
}

//

class ReportGenerator {

    fun generateReport(data: List<String>) {
        println("Generating report...")
        data.forEach {
            println(it)
        }
        println("Report generated")
    }
}

class  ReportSaver {
    fun saveReportToFile(data: List<String>, fileName: String) {
        println("Saving report to $fileName")

        data.forEach {
            println(it)
        }
    }
}


class ReportEmailSender {
    fun emailReport(data: List<String>, email: String) {
        println("Sending report to $email")

        data.forEach {
            println(it)
        }
    }
}

// 

// Kotlin WarmUp 

   val x = 5
   var y = 2
   y = x  // y = 5
   y++   // 6
   println(y)
   println(10 / 3) // 3

    listOf(1, 2, 3).map { it * 2 }
    // Result [2,4,6]

   val name: String? = null
   println(name ?: "Guest")  
    
    fun multiply(a: Int, b: Int = 3) = a * b
    /// This one returns 5 here  ///

// Some Jetpack

@Composable

fun Screen() {

var text by remember { mutableStateOf("A") }

LaunchedEffect(Unit) {

text = "B"

}

Text(text)

}

//
