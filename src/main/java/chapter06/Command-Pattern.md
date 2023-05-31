# 커맨드 패턴

- 요청 내역을 객체로 캡슐화해서 서로 다른 요청 내역에 따라 매개변수화할 수 있음
- 요청을 큐에 저장하거나 로그로 기록하나거 작업 취소 기능을 사용할 수 있음
- 커맨드 패턴을 사용하면 요청하는 객체와 쵸저을 수해라는 객체를 분리할 수 있음
- 분리하는 과정의 중심에는 커맨드 객체가 있으며, 이 객체가 행동이 들어있는 리시버를 캡슐화함
- 인보커는 무언가 요청할 때 커맨드 객체의 execute() 메소드를 호출하면 됨
- 커맨드 패턴을 활용해서 로그 및 트랜잭션 시스템을 구현할 수 있음

객체 지향 기초

- 추상화
- 캡슐화
- 다형성
- 상속

객체지향 원칙

- 바뀌는 부분을 캡슐화한다.
- 상속보다 구성을 활용한다.
- 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
- 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용해야한다.
- 클래스는 확장에는 열려 있어야 하지만 변경에서는 닫혀 있어야한다.(OCP)
- 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.