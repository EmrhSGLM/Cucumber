Feature: US1013 Invalid email Testing

  @Automation
  Scenario: TC18 Invalid email ile giris yapilamaz

    Given kullanici "AutomationPractiseUrl" sayfasina gider
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin “Invalid email address”  oldugunu dogrulayin
  