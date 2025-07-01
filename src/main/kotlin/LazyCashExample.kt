
val expensiveResult by lazy {
    println("처음 한 번만 계산")
    (1..1_000_000).sum()
}

fun main() {
    repeat(3) {
        println(expensiveResult) // 처음 1회 계산 후 캐싱된 값 사용
    }
}


