fun main() {
    val numbers = arrayOf(1, 2, 3, 4)
    println(numbers[0])  // 1

    /**
     * Kotlin -> Java
     * int[] squares = new int[5];
     * for (int i = 0; i < squares.length; i++) squares[i] = i * i;
     * System.out.println(Arrays.toString(squares));  // [0, 1, 4, 9, 16]
     * */
    val squares = Array(5) { i -> i * i }
    println(squares.joinToString())  // 0, 1, 4, 9, 16

    // 타입이 명확한 Array
    val nums = intArrayOf(1, 2, 3)  // IntArray 타입 → int[]와 1:1 대응
    val doubles = doubleArrayOf(1.0, 2.0, 3.0)  // DoubleArray

    // Example!!
    val arr = arrayOf("a", "b", "c")
    println(arr.size)             // 3
    println(arr.contains("b"))    // true
    arr[1] = "bb"                 // 수정 가능
    println(arr.joinToString())   // a, bb, c
}