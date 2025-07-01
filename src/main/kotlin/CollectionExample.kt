fun main() {
    // List는 순서를 가지며 인덱스로 접근 가능.
    listExample()
    // Set은 순서를 보장하지 않고 중복을 허용하지 않음, 인덱스로 접근 불가.
    setExample()
    // MutableList는 요소 추가와 인덱스를 통한 값 교체 가능.
    mutableListExample()
    // Map은 키-값 쌍으로 데이터를 관리하고, 읽기 전용 Map은 수정 불가.
    mapExample()
    // MutableMap은 키로 기존 값 수정 및 새 항목 추가 가능.
    mutableMapExample()
    /*
    * MutableSet은 순서를 보장하지 않아 first/last 결과는 실행마다 달라질 수 있음.
    * equals는 요소만으로 비교 → 순서 달라도 요소가 같으면 true.
    */
    mutableSetComparisonExample()
}

// 읽기 전용 List 예제
fun listExample() {
    println("=== List 예제 ===")
    val colorsList = listOf("Red", "Green")
    println(colorsList[0])  // 인덱스로 접근 가능 → Red
}

// 읽기 전용 Set 예제
fun setExample() {
    println("\n=== Set 예제 ===")
    val colorsSet = setOf("red", "green", "blue")
    println(colorsSet)                       // 순서 보장 안됨
    println(colorsSet.contains("red"))       // ✅ 포함 여부만 확인 가능
}

// 수정 가능한 List 예제
fun mutableListExample() {
    println("\n=== MutableList 예제 ===")
    val colorMutableList = mutableListOf("Red", "Blue")
    colorMutableList.add("Green")            // 요소 추가
    colorMutableList[1] = "SkyBlue"          // 기존 요소 수정 가능
    println(colorMutableList)                // [Red, SkyBlue, Green]
}

// 읽기 전용 Map 예제
fun mapExample() {
    println("\n=== Map 예제 ===")
    val ages = mapOf("Alice" to 25, "Bob" to 30)
    println(ages["Alice"])                   // 25
}

// 수정 가능한 Map 예제
fun mutableMapExample() {
    println("\n=== MutableMap 예제 ===")
    val scores = mutableMapOf("A" to 90, "B" to 80)
    scores["C"] = 70                         // 새 요소 추가
    scores["A"] = 95                         // 기존 키 값 수정
    println(scores)                          // {A=95, B=80, C=70}
}

/**
 * MutableList: 인덱스를 통해 기존 값 수정 가능.
 * MutableSet: 기존 값 “교체”는 불가 → 삭제 후 추가로만 갱신.
 * MutableMap: 키를 기준으로 기존 값 쉽게 수정 가능.
 */

// MutableSet 비교 예제
fun mutableSetComparisonExample() {
    println("\n=== MutableSet 비교 예제 ===")
    val s1: MutableSet<Int> = mutableSetOf(0, 1, 2, 3)
    val s2: MutableSet<Int> = mutableSetOf(3, 2, 1, 0)

    println("s1 == s2: ${s1 == s2}")                       // true
    println("s1.first() == s2.first(): ${s1.first() == s2.first()}") // 순서 불확정 → true/false
    println("s1.first() == s2.last(): ${s1.first() == s2.last()}")   // 순서 불확정 → true/false
}

data class User(val name:String) {

}

// Example!!!!
fun selectAllUsers(): List<User> {
    val allUsers: MutableList<User> = mutableListOf()
    val user = User("민수")

    allUsers.add(user)
    return allUsers
}