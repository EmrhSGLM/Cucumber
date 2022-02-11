@SO
Feature: US1008 Scenario Outline kullanarak farkli degerlerle Negative Login Testi

 Scenario Outline: TC13 farklı kullanici adi ve password

   Given kullanici "HMCUrl" sayfasina gider
   And login linkine tiklar
   Then scenario outline'dan kullanici adi olarak "<username>" yazar
   And scenario outline'dan password olarak "<password>" yazar
   And Login butonuna basar
   Then giris yapilamadigini test eder

   Examples:
   |username|password|
   |MANAGeR|MANAGER1|
   |manager|manager1|
   |MANager|MANager1|
   |MAN ager|MAN ager1|