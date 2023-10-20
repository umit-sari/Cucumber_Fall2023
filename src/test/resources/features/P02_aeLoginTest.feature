Feature:US1015 AutomationExercise sitesine login olma

  Scenario: TC001 AutomationExercise pozitif test

    Given kullanici aeUrl anasayfaya gider
    Then  kullanici login linkine tiklar
    Then  kullanici dogru bilgilerle giris yapar
    And   basarili giris yapildigini dogrular
    And   sayfayi kapatir


