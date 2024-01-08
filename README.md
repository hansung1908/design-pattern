# design-pattern

### mvc
- model : 데이터를 조작하는 레이어
- view : 사용자에게 보여지는 인터페이스
- controller : model과 view의 상호작용을 관리
- url을 통해 controller로 입력을 받음, model로부터 데이터 업데이트하고 view를 선택하여 보여줌
- mvc 패턴의 사용목적은 view와 model 사이의 controller를 두어 view와 model의 의존성을 제거하기 위함

### mvp
- mvp 패턴은 controller가 presenter로 바뀜, presenter는 view의 인스턴스를 갖고 있음
- 사용자의 입력이 url이 아닌 view에서 발생할 경우(스마트폰) 사용
- view에서 요청이 발생하면 presenter로 전달, presenter는 이벤트에 따라 model의 상태를 업데이트
- mvp또한 view와 model 사이에 presenter를 두어 의존성 제거
- 그러나 view와 presenter의 관계가 1:1이기에 의존성이 깊다는 문제 발생

### mvvm
- mvvm 패턴은 presenter가 view model로 바뀜
- viewmodel : view를 나타내기 위한 model
- 입력이 들어오면 command 패턴을 통해 viewmodel에 명령, model로부터 데이터 업데이트
- 업데이트된 데이터는 viewmodel에 저장, data binding으로 view에 또한 자동으로 갱신
- command 패턴 : 명령을 객체의 형태로 가공하여 이용할 수 있게 만드는 방식
- data binding : 데이터를 인터페이스와 묶어 표현하는 방법
- command 패턴과 data binding을 통해 mvp의 문제를 해결

### solid
- 반드시 지켜야 하는 원칙 x, 최대한 지켜야 하는 하나의 방식 o
- srp : 단일 책임 원칙, 객체는 단 하나의 책임만 가져야 한다는 원칙
- calculator 클래스에 alarm 기능을 추가할 경우, 함수가 아닌 alarm 클래스로 제작
- ocp : 개방 폐쇄 원칙, 기존의 코드는 변경하지 않으면서(closed) 기능을 추가할 수 있도록(open) 설계가 되어야 한다는 원칙
- 캡슐화를 통해 여러 객체에서 사용하는 기능을 인터페이스로 정의
- lsp : 리스코프 치환원칙, 자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행할 수 있어야 한다는 설계원칙
- 자식 클래스는 부모 클래스의 책임을 무시하거나 재정의하지 않고 확장만 수행, 오버라이딩은 가급적 피할 것
- isp : 인터페이스 분리 원칙, 자신이 사용하지 않는 인터페이스는 구현하지 말아야 한다는 설계 원칙
- phone 인터페이스에 call, sms, alarm, carculator 기능을 정의하여 해당 기능을 사용하는 옛날 폰과 스마트폰에서 구현 x
- 각각의 기능을 인터페이스로 정의하여 4개의 인터페이스를 옛날 폰과 스마트폰이 구현 o
- dip : 의존 역전 원칙, 객체들은 나름대로의 원칙을 갖고 정보를 주고 받아야 한다는 설계 원칙
- 나름대로의 원칙이란, 클라이언트는 추상성이 낮은 클래스(cat, dog, bird)보다 추상성이 높은 클래스(animal)와 의존관계를 맺어야 함
- 일반적으로 인터페이스를 활용하면 해당 원칙을 준수 가능(캡슐화)

### 전략 패턴(strategy pattern)
- 객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고, 동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것만으로 행위의 수정이 가능하도록 만든 패턴
- 오버라이딩을 통해 기능 구현은 ocp 위배, 시스템 확장시 메서드 중복문제 발생 -> 기능에 대한 정보를 전략 인터페이스로 분리 후 상속

### 싱글톤 패턴(singleton pattern)
- 인스턴스가 프로그램 내에서 오직 하나만 생성되는 것을 보장하고, 프로그램 어디에서든 이 인스턴스에 접근할 수 있도록 하는 패턴
- 인스턴스가 사용될 때 똑같은 인스턴스를 여러 개 만드는 것이 아닌, 기존에 생성했던 동일한 인스턴스를 사용

### 스테이트 패턴(state pattern)
- 객체가 특정 상황에 따라 행위를 달리하는 상황에서, 자신이 직접 상태를 체크하여 상태에 따라 행위를 호출하지 않고 상태를 객체화하여 상태가 행동을 할 수 있도록 위임하는 패턴
- 객체의 특정 상태를 클래스로 선언하고, 클래스에서는 해당 상태에서 할 수 있는 행위들을 메서드로 정의

### 커맨드 패턴(command pattern)
- 객체의 행위(메서드)를 클래스로 만들어 캡슐화 하는 패턴
- 객체A에서 객체B의 메서드를 실행하려면, 객체B를 참조해야 하는 의존성 발생 -> 패턴 적용시 의존성 제거
- 기능이 수정되거나 변경이 일어날때, 클래스 코드 수정없이 기능에 대한 클래스를 정의하면 되므로 시스템 확장성 증가

### 옵저버 패턴(observer pattern)
- 옵저버 패턴은 어떤 객체에 이벤트가 발생했을 때, 이 객체와 관련된 객체들(옵저버들)에게 통지하도록 하는 패턴
- 이 패턴은 pub/sub(발행/구동)모델으로 불림, 유튜브 채널은 발행자가 되고 구독자들은 구독자(옵저버)가 되는 구조

### 데코레이터 패턴(decorator pattern)
- 데코레이터는 어떤 기능에 추가적으로 기능을 덧붙이고 싶은 경우, 그 기능들을 decorator로 만들어서 덧붙이는 방식
- 예를 들어, 서브웨이 샌드위치를 주문하면 기본 빵 위에 고객의 기호에 맞는 토핑을 추가 가능
- 여기서 토핑(양상추, 피클, 토마토..)들 각각이 데코레이터
- 토핑 조합에 따른 다양한 종류의 샌드위치를 다 클래스로 정의하면 토핑 갯수가 10개가 넘어가면 1024개 이상의 클래스를 생성해야 함
- 그래서 데코레이터 패턴을 적용하여 생성자를 통해 토핑 데코레이터를 생성하고 마지막으로 빵 데코레이터를 생성하여 완성