@ortaktag

Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı
  Scenario: Kullanıcı İK sayfasına giriş yapar
    Given Kullanıcı "İK" giris sayfasına gider
    When Kullanici email ve sifre girer
    And Kullanici giris yap butonuna tiklar

