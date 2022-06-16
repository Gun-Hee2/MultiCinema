# 📌 MultiCinema

## 1. 제작 기간 & 참여 인원
* 2021.11.03 ~ 2021.12.02
* 총 5명 / 김리영(팀장), 김원규, 도상우, 박상민, 허건희  

## 2. 목차
1. 사용 기술
2. ERD 설계
3. 담당파트
4. 트러블 슈팅
5. 회고

## 3. 사용 기술
* Java 8
* Spring boot 2.5.6
* Maven
* My SQL
* Spring Security 2.4.5
* Ajax
* JSON
* Restful API
* My Batis

## 4. ERD 설계
<img src="https://user-images.githubusercontent.com/87796075/156913078-953a4547-d2c1-4086-9c51-4d601a3907e8.png">

## 5. 담당파트
### 5.1. 고객센터
* 고객센터 글 목록
<img src="https://user-images.githubusercontent.com/87796075/157165170-8567638e-c198-4fdb-b468-6e7fe27db108.png">  
  
  유저들이 작성한 문의를 볼 수 있으며 제목, 내용 및 작성자로 검색이 가능합니다.  
  
    
    
* 고객센터 CRUD  
<img src="https://user-images.githubusercontent.com/87796075/157164998-9343577a-f98a-4251-8139-25c33ef7d890.png">  
  
  글의 세부 내용을 볼 수 있으며 작성자 본인의 경우, 글 수정과 글 삭제 버튼이 활성화 되며  
  
  답글 버튼의 경우는 관리자가 로그인 했을 때 관리자가 답변을 할 수 있게 활성화됩니다.
    
    
  
<details>
<summary> 코드(Click) </summary>
<div markdown="1">  
    
<a href="https://bit.ly/3IbKQB0" target="_blank">Controller</a>    
<a href="https://bit.ly/3w6jcTq" target="_blank">Dao</a>    
<a href="https://bit.ly/35QQ3RH" target="_blank">Service</a>    
<a href="https://bit.ly/3i6BbAO" target="_blank">Xml</a>    
    
</div>
</details>
 

### 5.2. 스낵 / 음료
* 스낵바 상품 목록
<img src="https://user-images.githubusercontent.com/87796075/157165871-0fce3691-a37d-498b-a77f-4ff1afa30962.png">  
  
  스낵바의 메뉴들이 각각 콤보, 팝콘, 음료 별로 구분 되어 진열되어 있습니다.

* 스낵바 상품 상세정보  
<img src="https://user-images.githubusercontent.com/87796075/157165959-23d650e2-5e68-4b44-8f56-a0b2436af674.png">  
  
  해당 상품의 가격과 구성을 볼 수 있으며, 수량을 고를 수 있습니다.

* 스낵바 상품 결제(카카오페이 API)   
<img src="https://user-images.githubusercontent.com/87796075/157166000-9e2d28fe-e464-419c-8417-c4b5d8bfdfe0.png">  
  
  결제할 상품의 정보와 수량을 확인할 수 있으며, 상품금액과 결제금액을 확인 후 결제하기 버튼을 눌러 결제합니다.

<details>
<summary> 코드(Click) </summary>
<div markdown="1">  
    
<a href="https://bit.ly/35W9R61" target="_blank">Controller</a>    
<a href="https://bit.ly/3MR7r9f" target="_blank">Dao</a>    
<a href="https://bit.ly/3JkD49m" target="_blank">Service</a>    
<a href="https://bit.ly/3q5oTwW" target="_blank">Xml</a>    
    
</div>
</details>


### 5.3. 카카오페이 결제 API
* 카카오페이 결제 페이지
<img src="https://user-images.githubusercontent.com/87796075/157168207-666e0c69-e28c-4e97-99e0-796d43f8d64d.png">  
  
  스낵바 상품 결제 페이지에서 결제하기 버튼을 누르면 넘어오는 페이지로써,    
  
  QR코드 결제와 카카오톡 결제, 두가지 방식으로 결제를 진행합니다.

* 모바일 카카오톡에서 결제  
<img src="https://user-images.githubusercontent.com/87796075/157168376-d5c15ac9-de5f-4d6d-a098-0d6b78755302.png">  
  
  원하는 방식으로 선택한 후 카카오페이 머니, 등록된 신용카드등으로 결제를 진행합니다.  
    
  QR코드 결제의 경우 바로 우측의 화면으로 전환되며,  
    
  카카오톡 결제의 경우에는 카카오톡 알림창으로 카톡이 오고 결제하기 버튼을 누르면 우측의 화면으로 전환됩니다.

* 결제 완료 페이지  
<img src="https://user-images.githubusercontent.com/87796075/157168625-9d17af95-d520-449e-942b-f4a752f4c680.png">  
  
  카카오페이 결제가 성공적으로 완료되면 넘어오는 페이지로써, 결제자 세부 정보와 결제한 상품의 세부 내역을 확인 할 수 있습니다.

<details>
<summary> 코드(Click) </summary>
<div markdown="1">  
    
<a href="https://bit.ly/3KEBsY2" target="_blank">Controller</a>    
<a href="https://bit.ly/3q22gtq" target="_blank">Dao(snackbar)</a>    
<a href="https://bit.ly/3CG6snS" target="_blank">Dao(ticket)</a>  
<a href="https://bit.ly/3JfD1LE" target="_blank">Service(snackbar)</a>    
<a href="https://bit.ly/3i6nFgH" target="_blank">Service(ticket)</a>  
<a href="https://bit.ly/3w5eVjd" target="_blank">Xml(snackbar)</a>    
<a href="https://bit.ly/3q1dzSL" target="_blank">Xml(ticket)</a> 
    
</div>
</details>

### 5.4. 챗봇(Naver Cloud Clova Chatbot API)
* 챗봇 채팅창
<img src="https://user-images.githubusercontent.com/87796075/157166650-9fb7fb89-d34f-4f64-a3b4-cfc82ace19ae.png">  
  
  홈페이지 화면 우측 하단에 챗봇 버튼이 있으며, 버튼을 누르면 채팅창이 열리고 기본값으로 정해져 있는 문구를 출력하고  
    
  유저의 채팅을 받아서 챗봇API를 이용하여 적절한 답변을 다시 출력해줍니다.

<details>
<summary> 코드(Click) </summary>
<div markdown="1">  
    
<a href="https://bit.ly/3CLedIZ" target="_blank">Controller</a>    
<a href="https://bit.ly/3CLefAB" target="_blank">Chatbot Method</a> 
    
</div>
</details>
  

### 5.5. Spring Security
* 의존성 주입(Maven)  
<a href="https://bit.ly/3w6087I" target="_blank">코드</a>  

* Config 설정  
<a href="https://bit.ly/3w7LHA0" target="_blank">코드</a> 

* Spring Security를 적용하는 회원가입 & 로그인 구현  
<a href="https://bit.ly/3KOzuEJ" target="_blank">코드</a>   

## 6. 트러블 슈팅   

<details>
<summary>6.1 URL Parameter Parsing(Click) </summary>
<div markdown="1">  
    
  
페이지 이동간에 파리미터값을 가져와야 하는 상황이 있었고, 그 부분에서 어떻게 가져올지 고민이 많았고, 방법을 찾아보던중에 정규식을 사용한 방법을 알게 되었습니다.  
  
  
```
function getURLParams(url) {
    var result = {};
    url.replace(/[?&]{1}([^=&#]+)=([^&#]*)/g, function(s, k, v) { result[k] = decodeURIComponent(v); });
    return result;
}
```   
  
간단하게 설명을 하자면, 인자값으로 받은 url 변수의 문자열에서 '?' 혹은 '&' 한개로 시작해서 '=','&','#' 가 아닌 문자가 1개이상 나온 뒤,  
'=' 문자가 나오고 '&','#' 이 아닌 문자가 0개 이상 나오는 문자열을 모두 찾은 뒤,  
첫번째 그룹으로 지어준 부분인 ([^=&#]+)에 해당하는 문자열을 key로 지정하고,  
두번째 그룹 지어준 부분인 ([^&#]*)에 해당하는 문자열을 URI decoding 해준 값을 value로 가지는 배열을 만들어서 반환 시켜줍니다.  
  
만약 URL이 "https://www.xxx.com/112?param1=value1&param2=value2&param3=value3#id1" 이라면,  
  
|s|k|v|
|--|--|--|
|?param1=value1|param1|value1|
|&param2=value2|param2|value2|
|&param3=value3|param3|value3|  

위 표와 같이 나오게 됩니다.  

</div>
</details>  

<details>
<summary>6.2 HttpURLConnection Parameter Encoding(Click) </summary>
<div markdown="1">  
    
카카오페이에 request를 보내는 과정에 있어서 원하는 한글 문자열이 알수없는 문자로 표현됨을 확인했습니다.  
문제 해결을 위해 방법을 찾았고, 생각보다 간단한 문제였습니다. 
      
    
우선, 문제가 생긴 부분입니다.  
    
![image](https://user-images.githubusercontent.com/87796075/162211832-f45ce763-eedd-40a6-b054-7abdd46aeb34.png)  
위와 같이 상품명 부분이 인코딩이 되지 않은 문자가 보여지는 문제가 있었습니다.  
    
이러한 문제를 해결하기 위한 방법으로는 HttpURLConnection을 사용할 때, 서버의 인코딩 방식에 맞춰서 클라이언트측에서도 동일한 인코딩 방식으로 파라미터를 보내줘야 했습니다.  
    
즉, 카카오페이의 서버에서 utf-8을 사용하고 있었기 때문에 카카오페이의 서버로 한글인 파라미터를 보낼 때 URLEncoder를 사용해서 utf-8로 인코딩하여 보내줘야 함을 알게 되었습니다.    
    
<a href="https://bit.ly/3uiriXP" target="_blank">문제 해결 부분(코드)</a>  
    
![kakaopay(fix)](https://user-images.githubusercontent.com/87796075/162213833-ea026911-1f6d-40e8-b7f0-92172b74eeeb.png)  
위와 같이 해결된 모습을 확인할 수 있습니다.
    
</div>
</details>  

## 7. 회고
  
  ### 프로젝트를 마치며 느낀점  
  
  * DB 설계의 중요성.  
      
      DB 설계에 꽤 많은 시간을 사용했음에도 불구하고 불필요한 어트리뷰트들,  
        
      반대로 필요했지만 놓친 어트리뷰트들을 수정하느라 계획에 맞지 않게 시간을 할애했습니다.  
      
      다시 한번 DB 모델링이 어려운 작업임을 깨달았으며, 
      
      추후에 불필요한 수정으로 더 많은 시간을 할애하지 않도록 처음 설계시 최대한 꼼꼼하게 설계해야 된다는 점을 느꼈습니다.
      
  * 리더쉽 & 팔로쉽.  
    
      프로젝트 첫 시작은 5명이 함께 시작을 했지만, 일주일 후에 팀원 중 한명이 이탈을 했고  
      
      이탈한 팀원의 업무를 남은 4명 중 한명이 맡아야 했습니다. 동시에 팀 리더였던 팀원이 지원했던 회사의 면접준비로 인하여 
      
      부재가 많아질 것 같다고 말했고 저에게 임시로 팀 리더를 맡아달라고 했습니다. 큰 문제 없이 프로젝트는 마무리 했지만
      
      팀원일때와 다르게 팀 리더로서 신경써야 할 부분이 많았고, 빠르고 정확하게 결정해야 하는 리더의 역할이 굉장히 중요하다는 것을 느꼈으며,
      
      동시에 팀 리더의 선택과 요구를 정확하게 파악하여 수행해내는 팀원의 팔로쉽도 중요하다는 점을 느꼈습니다.  
  
  ### 프로젝트의 아쉬운 점
  
  * ~~회원가입과 로그인에 Spring Security 미적용.~~(프로젝트 마친 후 개인적으로 적용완료)
      
      회원가입을 할 때 평문으로 받은 비밀번호를 암호화없이 데이터베이스에 삽입했습니다.  
      
      -> 서버에 크리티컬한 개인정보가 없다면 그나마 다행이지만, 
        
       해당 사이트를 제외한 가입된 여러 사이트의 정보들의 해킹 위험이 존재하기 때문에 암호화는 필수이다.
     
  * 보기 좋은 UI 구현.
      
      UI 구현을 제일 마지막쯤에 해서 시간을 많이 사용하지 못했고,
      
      팀원 모두 백엔드 구현에 있어서는 잘 해결 해냈지만 UI구현에 있어서 미숙했습니다. 
      
      최대한 보기 좋은 UI를 만들기 위해서 노력했지만 계속 아쉬움이 남았던 파트인 것 같습니다.
      
      
      
      
      
      
      
