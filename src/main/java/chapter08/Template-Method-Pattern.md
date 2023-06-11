# 탬플릿 메소드 패턴

- 알고리즘의 골격을 정의함
- 템플릿 메소드를 사용하면 알로리즘의 일부 단계를 서브클래스에서 구현할 수 있음
- 알고리즘의 구조는 그대로 유지하면서 알고리즘의 특정 단계를 서브클래스에서 재정의할 수도 있음
- 템플릿 메소드는 알고리즘의 단계를 정의하며 일부 단계를 서브 클래스에서 구현하도록 할 수 있음
- 코드 재사용에 큰 도움이 됨
- 템플릿 메소드가 들어있는 추상 클래스는 구상 메소드, 추상 메소드, 후크를 정의할 수 있음
- 추상 메소드는 서브클래스에서 구현함
- 후크는 추상 클래스에 들어있는 메소드로 아무 일도 하지 않거나 기본 행동만을 정의함
- 서브 클래스에서 푸크를 오버라이드할 수 있음
- 할리우드 원칙에 의하면, 저수준 모듈을 언제 어떻게 호출할지는 고수준 모듈에서 결정하는 것이 좋음
- 실무에서도 사용되나 교과서적인 방식으로 사용되지는 않음
- 전략 패턴과 템플릿 메소드 패턴은 모두 알고리즘을 캡슐화하는 패턴이지만 전략 패턴은 구성을 템플릿 메소드 패턴은 상속을 사용
- 팩토리 메소드 패턴은 특화된 템플릿 메소드 패턴

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
- 진짜 절친에게만 이야기해야 한다.
- 먼저 연락하지마세요. 저희가 연락 드리겠습니다.