Feature: US1005 Positive Login Testi

  @hotel
  Scenario: TC08 Positive Login

    Given kullanici "HMUrl" sayfasina gider
    And login linkine tiklar
    Then kullanici adi olarak "ValidUserName" girer
    And password olarak "ValidUserName" girer
    And Login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir