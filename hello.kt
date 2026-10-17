
package org.example

import kotlin.math.absoluteValue

fun main() {

}

class User {}

// Class User is doing multiple responsibility here

class SystemManager {
    fun addUser(user: User) { }
    fun deleteUser(user: User) { }
    fun sendNotification(notification:String) {}
    fun sendEmail(user: User, email: String) {}
}

// <---------------->

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

