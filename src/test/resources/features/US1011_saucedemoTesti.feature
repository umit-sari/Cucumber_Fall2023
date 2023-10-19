Feature: US1011 Saucedemo alisveris testi


  Scenario: TC15 Saucedemo sitesinden alisveris yapilabilmeli

    Given kullanici "saucedemoUrl" anasayfaya gider
    Then  Usarname kutusuna "standard_user" yazar
    And   Password kutusuna "secret_sauce" yazar
    And   Login tusuna basar
    When  ilk urunun ismini kaydeder ve bu urunun sayfasina tiklar
    And   Add to Cart butonuna basar
    Then  Alisveris sepetine tiklar
    And   Sectigi urunun basarili olarak sepete eklendigini kontrol eder
    Then  sayfayi kapatir