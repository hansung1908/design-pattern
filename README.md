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