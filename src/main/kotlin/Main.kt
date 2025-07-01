fun main(args: Array<String>) {
//    typeTest();
    var original = StringBuilder("ORIGINAL")
    original = changeReference(original);

    System.out.println(original);  // 출력: ORIGINAL
}

fun typeTest (){
    /**
     * 코틀린은 타입추론을 하기때문에 타입 표기를 생략해도 상관없다.
     * var와 val이 존재한다.val은 java의 final과 같기때문에 선언시 수정이 불가능하다.
     * 컴파일 오류 예시
     * var test (타입선언이 없으므로 컴파일 에러,하지만 초기값을 할당했다면, 타입추론에 의해 컴파일 에러가 발생하지 않음) */
    var test = "테스트"; val test2: String = "테스트"
    // 아래와 같이 타입을 명시하기도 한다
    var number: Int
    val number2: Int

    /**
     * number2는 java의 final과 같기때문에 재선언시 컴파일 에러 발생
     * */
    number2 = 55
    // Compile error --> number2 = 56

    // Chapter2. 함수로 초기화를 시도해도 불가능함
    // Compile error --> number2 = valTest(number2)
    println(number2)
    /**
     *
     * */
}

fun valTest(number: Int): Int {
    println(number)
    println(number + 5)
    return number + 5
}

fun changeReference(sb: StringBuilder): StringBuilder {
    var sb = StringBuilder("NEW")   // 함수 내 매개변수 sb가 새로운 객체를 가리키도록 변경
    sb.append(" OBJECT");           // 새 객체 내용 수정
    return sb
}

