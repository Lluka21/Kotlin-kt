package org.example

import kotlin.math.absoluteValue

fun main() {

}

// DIP principle solution
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



// Interface Segregation Principle Solution
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


// Single Responsibility Principle
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
