Feature: US1003 kullanici gecerli bilgilerle sayfaya giris yapar


  Scenario: TC05 qualitydemy pozitif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine tiklar
    And username kutusuna "qdGecerliEmail" yazar
    And kullanici ikinci cookies'i kabul eder
    And password kutusuna "qdGecerliPassword" yazar
    And 3 saniye bekler
    And login butonuna basar
    Then basarili giris yapildigini test eder
    And sayfayi kapatir