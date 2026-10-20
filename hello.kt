package org.example

import kotlin.math.absoluteValue

fun main() {

}


//}


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
