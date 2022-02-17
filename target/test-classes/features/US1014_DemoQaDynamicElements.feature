Feature: US1014 Dinamik elemanlar

  @Dynamic
  Scenario: TC19 Dinamik elementler tiklanabilmeli

    Given kullanici "DemoQaUrl" sayfasina gider
    Then Will enable 5 seconds butonunun enable olmasini bekler
    And Will enable 5 seconds butonunun enable oldugunu test eder