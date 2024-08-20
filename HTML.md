## HTML (Hyper Text Markup Lang.)
(form과 input 중요!!!!!!)
 - Web의 front
    * HTML(구조, 뼈대) + CSS(스타일링) + JS(동작, 애니메이션)
 - 각자 다른 출신의 브라우저들... 웹 표준으로 해결
 - WHATWG가 HTML5 공동개발
 - W3C --(2019년)-> WHATWG 웹표준(가이드) 이동




### HTML이란..
 - Hyper Text : 참조로 다른 문서로 즉시 접근하는 텍스트
 - Markup : 태그 등으로 데이터 구조를 정의하는 언어
 - 웹페이지 작성 위한 언어
 - 태그는 대소문자 구분 X (소문자 recommended)
 - 엔터와 탭 적용 X
 - 마크업 스타일 : 1 indent == 2 spacebar
 - !DOCTYPE는 작성 안해도 됨.
<head>페이지 이름, CSS, favicon 등 표현하고 싶은 구성 요소 외의 재료</head> (화면에 출력 X)
<meta>charset="UTF-8" || name="viewport" ... "device-width"</meta>
<title>문서 제목(탭에 표시)</title>
<body></body>

### 요소와 태그
 - 요소 in 태그
 - <태그이름 속성이름 = "속성값"> 컨텐츠 </태그이름>
 - 관용적으로 " " 권장
 - 요소 중첩
    * <p>"<strong>""</strong>"</p>
    * <span> </span>
 - 닫는 태그의 생략 - 빈 요소
    * <img src = "./assets/img/dixon.png" alt="Dixom" />

### 주석
 - 브라우저에 출력 X (개발자도구는 O)
 - Ctl + /
 - 중첩 X

### 특수문자
 - 공백 : &nbsp; &ensp; ....

### Semantic Tag
 - 문서구조를 나타내는 태그(의미를 가져야함)
 - 가독성이 높아짐 = 유지보수 EASY (SEO)
 - 그러나 정석화된 것이 아니므로 자기가 원하는대로... 

### DOM 트리 ( Doc. Obj. Model )
 - 브라우저에 렌더링하기 위한 구조

### Block Text Content <-> inline
 - normal flow에 대해 알아둘 것! 

### Inline Text Content
 - <a> 와 <span>은 꼭!, 하이퍼 텍스트 쓸때만 <a> 쓰기

### Img & Multimedia
 - <img src = " " alt= " " > alt -> 이미지 안보일때 뜨는 이미지에 대한 텍스트...

### Table Content
<tr>
    <td....

### Form
 - 프론트에서 백으로...! 서버에 처리하기 위한 용도
 - GET : 파라미터가 URL에 노출됨 / Querystring에 담겨서 전송됨 -> 보안 취약
        -> 따라서 조회(Read)할 때 사용
        naver.com?key=value&key=value || google.com?q=ssafy
        길이에 제한 상태
 - POST : HTTP 메세지의 body에 담아 전송. 제약 X
    ...
 -