fun main() {
    // 인스턴스 생성
//    var useRectangle = Rectangle(50, 50)

    val blue1 = Color.BLUE
    val blue2 = Color.BLUE

    blue1.r = 50  // blue1을 통해 BLUE의 r값 수정
    println(blue2.r) // 50 → blue2도 같은 BLUE 인스턴스를 보므로 수정 내용이 그대로 보임
}

class Rectangle(val height:Int, val width:Int) {
    val isSquare: Boolean
        get() { return height == width } // get()=height==width

}

/**
 * get,set 커스텀 예제 */
class Box {
    var size: Int = 0
        get() = field
        set(value) {
            println("Setting size to $value")
            field = if (value < 0) 0 else value // 음수 입력 방지
        }
}

// 프로퍼티와 메소드 선언 가능 (메소드 선언시 마지막 열거 값 뒤에 세미콜론 필수)
// enum 클래스는 타입추론이 불가능하기때문에(판단할 수 있는 내부로직이 없기때문에) 매개변수에 var와 val의 선언이 필요함
// enum 생성자에는 상수 선언 외에는 타입 추론할 수 있는 컨텍스트가 없다
enum class Color(var r: Int, var g: Int, var b: Int) {
    READ(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    BLUE(0, 0, 255), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun add(a: Int, b: Int) = a + b  // 타입 명시해도 되고, 생략해도 OK
//fun add2(a, b) = a + b            // ❌ 타입 생략 불가 (파라미터에 초기값 없으면 추론 불가)