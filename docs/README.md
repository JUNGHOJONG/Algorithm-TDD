# Algorithm-TDD
테스트 주도 개발로 알고리즘 문제풀이 연습

## 개발환경
* 인텔리제이
* Java8
* Gradle / Junit4
* github
* 소스트리(or 인텔리제이 내장 github 도구)

## 요구사항
* 꼭 테스트 코드 작성 이후에 로직 코드를 작성한다.
* 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    * [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html)
    * [https://myeonguni.tistory.com/1596](https://myeonguni.tistory.com/1596)
* indent depth를 2까지만 허용한다
    * ex) while문 안에 if문이 있으면 들여쓰기는 2이다
* 함수가 한 가지 일만 잘 할 수 있도록 최대한 작게 만든다
    * 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
* 테스트케이스는 5개 이상 작성한다
* else 예약어를 쓰지 않는다.
    * 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    * else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
* 3항 연산자를 쓰지 않는다.