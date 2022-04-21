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

* 고객센터 CRUD  
<img src="https://user-images.githubusercontent.com/87796075/157164998-9343577a-f98a-4251-8139-25c33ef7d890.png">

* 코드  
<a href="https://bit.ly/3IbKQB0" target="_blank">Controller</a>    
<a href="https://bit.ly/3w6jcTq" target="_blank">Dao</a>    
<a href="https://bit.ly/35QQ3RH" target="_blank">Service</a>    
<a href="https://bit.ly/3i6BbAO" target="_blank">Xml</a>  

### 5.2. 스낵 / 음료
* 스낵바 상품 목록
<img src="https://user-images.githubusercontent.com/87796075/157165871-0fce3691-a37d-498b-a77f-4ff1afa30962.png">  

* 스낵바 상품 상세정보  
<img src="https://user-images.githubusercontent.com/87796075/157165959-23d650e2-5e68-4b44-8f56-a0b2436af674.png">

* 스낵바 상품 결제(카카오페이 API)   
<img src="https://user-images.githubusercontent.com/87796075/157166000-9e2d28fe-e464-419c-8417-c4b5d8bfdfe0.png">

* 코드  
<a href="https://bit.ly/35W9R61" target="_blank">Controller</a>    
<a href="https://bit.ly/3MR7r9f" target="_blank">Dao</a>    
<a href="https://bit.ly/3JkD49m" target="_blank">Service</a>    
<a href="https://bit.ly/3q5oTwW" target="_blank">Xml</a>    

### 5.3. 카카오페이 결제 API
* 카카오페이 결제 페이지
<img src="https://user-images.githubusercontent.com/87796075/157168207-666e0c69-e28c-4e97-99e0-796d43f8d64d.png">  

* 모바일 카카오톡에서 결제  
<img src="https://user-images.githubusercontent.com/87796075/157168376-d5c15ac9-de5f-4d6d-a098-0d6b78755302.png">  

* 결제 완료 페이지  
<img src="https://user-images.githubusercontent.com/87796075/157168625-9d17af95-d520-449e-942b-f4a752f4c680.png">

* 코드  
<a href="https://bit.ly/3KEBsY2" target="_blank">Controller</a>    
<a href="https://bit.ly/3q22gtq" target="_blank">Dao(snackbar)</a>    
<a href="https://bit.ly/3CG6snS" target="_blank">Dao(ticket)</a>  
<a href="https://bit.ly/3JfD1LE" target="_blank">Service(snackbar)</a>    
<a href="https://bit.ly/3i6nFgH" target="_blank">Service(ticket)</a>  
<a href="https://bit.ly/3w5eVjd" target="_blank">Xml(snackbar)</a>    
<a href="https://bit.ly/3q1dzSL" target="_blank">Xml(ticket)</a> 

### 5.4. 챗봇(Naver Cloud Clova Chatbot API)
* 챗봇 채팅창
<img src="https://user-images.githubusercontent.com/87796075/157166650-9fb7fb89-d34f-4f64-a3b4-cfc82ace19ae.png">  

* 코드  
<a href="https://bit.ly/3CLedIZ" target="_blank">Controller</a>    
<a href="https://bit.ly/3CLefAB" target="_blank">Chatbot Method</a>    

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
    
이러한 문제를 해결하기 위한 방법으로는 HttpURLConnection을 사용할 때, 서버의 인코딩 방식에 맞춰서 클라이언트측에서도 동일한 인코딩 방식으로 parameter를 보내줘야 했습니다.  
    
즉, 카카오페이의 서버에서 utf-8을 사용하고 있었기 때문에 카카오페이의 서버로 한글인 parameter를 보낼 때 URLEncoder를 사용해서 utf-8로 인코딩하여 보내줘야 함을 알게 되었습니다.    
    
<a href="https://bit.ly/3uiriXP" target="_blank">문제 해결 부분(코드)</a>  
    
![kakaopay(fix)](https://user-images.githubusercontent.com/87796075/162213833-ea026911-1f6d-40e8-b7f0-92172b74eeeb.png)  
위와 같이 해결된 모습을 확인할 수 있습니다.
    
</div>
</details>  

## 7. 회고
