// 1. Variables & Types
// გამოაცხადე მთელი რიცხვი myAge და დაალაგე შენს ასაკს.
    // val myAge: Int = 25
// გამოაცხადე სტრინგი myName და დაალაგე შენი სახელი.
    // val myName: String = "Luka"
// გამოაცხადე Boolean isStudent და დაალაგე true თუ სტუდენტი ხარ.
    // val isStudent: Boolean = false
// შექმენი Double ტიპის ვარიაბლი height და დაალაგე შენი სიმაღლე მეტრებში.
    //  val height: Double = 1.
    
// 2. Operators
//    შექმენი ორი Int ტიპის ვარიაბლი a და b. აკეთე:
        // val a: Int = 5
        // val b: Int = 10
//    აუარესი their sum, difference, product, division.
        // val sum: Int = a + b
        // val difference: Int = b-a ან a-b
        // val product: Int = b*a ან a*b
        // val division: Int = b/a ან a/b
//    გამოიტანე გამყოფი (modulus) result.     
        // val modulus = a%b

// 3. Control Flow (if / when) 
        // დაწერე პროგრამა, რომელიც შეამოწმებს რიცხვი n:
        // >0 → "Positive"
        // <0 → "Negative"
        //  0 → "Zero"
        // val n = 21
        // if(n>0) {
        //     return "Positive"
        // } else if(n<0) {
        //     return "Negative"
        // } else if(n === 0) {
        //     return "Zero"
        // }

    //   გამოიყენე when-ს, რომ იპოვო კვირის დღეების 
    //   სახელები (1 → Monday, 2 → Tuesday ... 7 → Sunday).  
        // val dayOfWeek = 1
        // when(dayOfWeek) {
        //     1->println("Monday")
        //     2->println("Tuesday")
        //     3->println("Wednesday")
        //     4->println("Thursday")
        //     5->println("Friday")
        //     6->println("Saturday")
        //     7->println("Sunday")
        // }

        // დაწერე პროგრამა, რომელიც შეამოწმებს, 
        // არის თუ არა number წრფივი (even) თუ კენტი (odd).
        // val number = 5
        // if(number % 2 == 0) {
        //     println("It is even")
        // } else {
        //         println("It is odd")
        // }   

    // 4. Loops
    // დაბეჭდე რიცხვები 1–დან 10–მდე for loop-ით.
        // for(i in 0..10){
        //     println(i)
        // }
    // დაბეჭდე რიცხვები 10–დან 1–მდე while loop-ით.
        // val num = 10
        // while(num < 10)  {
        //     println(i)
        //     num --
        // }    
    // შექმენი do-while loop,  რომელიც იკითხავს რიცხვებს
    //  until მომხმარებელმა ჩაწეროს 0.

    // val input = 0
    // do() {
    //        println("Please enter a number between 1 and 10:")
    // }
    // while(input){
    //         println("Your wrote correct number")
    // }

    // 5. Functions
    // დაწერე ფუნქცია sum(a: Int, b: Int): Int, რომელიც აბრუნებს a + b. 
    //  fun sum(a: Int, b: Int): Int {
    //         println(a+b)
    //  }
    //  დაწერე ფუნქცია greet(name: String): String, რომელიც აბრუნებს "Hello, <name>".
    // fun greet(name: String): String {
    //     println("Hello $name")
    // }

    // დაწერე ფუნქცია, რომელიც იღებს List<Int> და აბრუნებს მათ ჯამს.
     --- ამაში დამეხმარე --- 
    
    //  6. Null Safety
    // შექმენი ვარიაბლი nickname: String? და დაალაგე null.
    // val nickname: String? = null
    // გამოიყენე safe call (?.) და Elvis operator (?:) და დაბეჭდე მისი სიგრძე.
     println(nickname?.length)
     println(nickname?:.length)
    //  შექმენი ფუნქცია, რომელიც იღებს nullable String და აბრუნებს:
        val nickname: String? = null
        if(nickname == null) {
            println("No Value")
        } else {
            println(nickname.toUpperCase())
        }