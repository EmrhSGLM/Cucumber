Feature: US1011 WebUniverstiy Window Handle

  @WebU
  Scenario Outline: TC16 Reusable Methods ile Window Handle Testi

    Given kullanici "WebUniverstyUrl" sayfasina gider
    And Login Portal'a kadar asagi iner
    And Login Portal'a tiklar
    Then acilan diger window'a gecer
    And "username" ve  "password" kutularina deger yazdirin
    And "login" butonuna basar
    And Popup'ta cikan yazinin "validation failed" oldugunu test edin
    And Ok diyerek Popup'i kapatin
    And ilk sayfaya geri doner
    And ilk sayfaya geri donuldugunu test eder
    And sayfayi kapatir


    Examples:
    |username|password|
    |Emrah|Emrah1!|






