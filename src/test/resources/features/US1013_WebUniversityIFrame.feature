Feature: US1013 Kullanici iFrame'e gecis yapabilmeli


  Scenario: TC17 iFrame otomasyon testi
    Given kullanici "webUniIframeUrl" anasayfaya gider
    And   ourProduct linkine tiklemek icin iframe'e gecis yapar
    And   Our Products buttonuna basar
    Then  acilan sayfada Cameras'i tiklar
    And   1 saniye bekler
    And   Popup mesajini yazdirir
    And   close buttonuna basar
    Then  iframe'den cikis yapar
    And   WebdriverUniversity.com (IFrame) linkini tiklar
    And   acilan sayfa url'inin "http://webdriveruniversity.com/index.html" oldugunu test eder
    And   sayfayi kapatir