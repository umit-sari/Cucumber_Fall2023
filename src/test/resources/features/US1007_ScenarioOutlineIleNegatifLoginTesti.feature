Feature:US1007 liste olarak verilen kullanici adi ve sireler ile giris yapilamadigini test eder

  Scenario Outline:TC11 qualitydemy sayfasina yanlis bilgiler ile giris yapilamaz

    Given kullanici "qdUrl" anasayfaya gider
    Then  ilk login linkine tiklar
    And   username kutusuna examples'dan "<gecersizEmail>" yazar
    And kullanici ikinci cookies'i kabul eder
    And   password kutusuna examples'dan "<gecersizPassword>" yazar
    Then  2 saniye bekler
    And   login butonuna basar
    Then  basarili giris yapilamadigini test eder
    And   sayfayi kapatir

    Examples:
      | gecersizEmail | gecersizPassword |
      | Suha          | 12345            |
      | Nergiz        | 34521            |
      | Omer          | 786543           |
      | Mehmet        | 98098            |
      | Ertugrul      | 87675098         |

