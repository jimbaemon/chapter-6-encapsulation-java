# 6.6 변수 캡슐화 하기 자료

> 자바여서 자송합니다.... :(  ㅜㅜ



## 배경
* 함수는 데이터보다 다루기 수월하다.
    * 함수를 사용시 기존 함수를 그대로 둔 채 전달 함수로 활용할 수 있다.
* 데이터 변경 전 검증이나 변경 후 추가 로직을 쉽게 끼어 넣을 수 있다.



## 예제 설명

* 관리자는 사용자 주민등록 번호를 그대로 화면에서 확인 할 수 있었다.
* 사용자 주민등록번호를 확인할 수 있는 페이지는 투자자 명단과 배정 명단 이다.
* 보안정책 강화로 배정 명단을 제외한 모든 곳에서 주민등록번호 뒷 자리는 첫째자리를 제외하고 * 처리 해야 한다.



## 절차에 따른 리팩토링 진행

1. 변수로의 접근과 갱신을 전담하는 캡슐화 함수들을 만든다.

2. 정적 검사를 수행한다.
3. 변수를 직접 참조하던 부분을 모두 적절한 캡슐화 함수 호출로 바꾼다. 하나씩 바꿀 때마다 테스트 한다.
4. 변수의 접근 범위를 제한한다.
   * 변수로의 직접 접근을 막을 수 없을 때도 있다. 그럴 때는 변수 이름을 바꿔서 테스트해보면 해당 변수를 참조하는 곳을 쉽게 찾아낼 수 있다.
5. 테스트 한다.