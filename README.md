Jisay Library
=============
repsitories ``` maven { url 'https://jitpack.io' } ```  
gradle ``` implementation 'com.github.tlawltjr:util:1.6.1' ``` *24/03/19 기준*  

메소드 사용법  
<details>
  <summary>AddCommas (화폐 세번째 자리 콤마)</summary>
  <div>
    <pre><code> 
AddCommas addCommas = new AddCommas();     
Long price = Long.valueOf(addCommas.addComma(100000000L)); 
    </code></pre>
  </div>
</details>

<details>
  <summary>CrudAuto (JPA crud 도우미)</summary>
  

  <details open>
<summary>checkLogin()</summary>

```java
CrudAuto crudAuto = new CrudAuto(new Func() {});
boolean result = crudAuto.checkLogin(session, "id");
```

</details>


  <details open>
<summary>createUpdate()</summary>

```java
CrudAuto crudAuto = new CrudAuto(new Func() {});
DTO result = crudAuto.read(dto, entitu);
```

</details>


  <details open>
<summary>read()()</summary>

```java
CrudAuto crudAuto = new CrudAuto(new Func() {});
Entity result = crudAuto.createUpdate(entity,dto);
```

</details>

</details>

<details>
  <summary>parse (JSON 바인)</summary>
  <div>
    <pre><code> 
TypeReference&lt;List&lt;?&gt;&gt; ref = new TypeReference&lt;&gt;(){};
Parser parser = new Parser();
List&lt;?&gt; result = parser.parse(response, key, ref);
<br>
*return 받을 type의 TypeReperence객체를 만들고 파라미터에 넣어야 합니다.
    </code></pre>
  </div>
</details>





