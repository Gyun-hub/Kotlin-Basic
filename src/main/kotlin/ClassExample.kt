fun main() {
    val person0 = Person("AA")
    val person1 = Person("BB", 15)
    println(person1.age)
//    val person2 = Person("CC", -1)
    println(person0.name)
    person0.equals(person1)
    println(person1.name)
    person1.age = 1
    println(person1.age)


    val redColor = Colors(255,0,0)
    println(redColor.component1())

}

// name -> 프로퍼티, age -> 생성자 인자일뿐
// 커스텀 로직을 넣고 싶으면 생성자 파라미터로 받되, 클래스 본문에서 별도로 프로퍼티를 선언하고 초기화해줘야 한다.
class Person(val name: String, age: Int) {  // 생성자
    init {
        if(age < 0) {
            throw IllegalArgumentException()
        }
    }

    var age: Int = age
        get() {
            println("Getter 호출됨: $field")
            return field + 5   // 반환 시 대문자로 변환
        }
        set(value) {
            println("Setter 호출됨: $value")
            field = value + 2
        }
    // 오버로딩
    constructor(name: String): this(name,1)
}

/**
 * data class는 최소한 하나 이상의 val 또는 var 프로퍼티를 주 생성자에 포함해야만 한다.
 * data class의 주 생성자에 선언된 프로퍼티만이
 * equals(), hashCode(), copy(), toString(), componentN() 같은 data class의 핵심 기능에 자동으로 포함된다.
 * */
data class Colors(var red:Int, val green:Int, val blue:Int) {
    var red1: Int = red
        get() = field + 2

}