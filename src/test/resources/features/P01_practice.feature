Feature:  US1014 Kullanici amazon anasayfada arama yapar
@wip
  Scenario: TC001 Amazonda Iphone 15 Pro arama testi
    Given kullanici "amazonUrl" anasayfaya gider
    Then  arama kutusuna "Iphone 15 Pro" yazip aratir
    Then  arama sonuclarinin sonuc sayisini  yazdirir
    And   sayfayi kapatir