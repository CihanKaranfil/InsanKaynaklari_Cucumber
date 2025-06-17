@ortaktag

Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı
  Scenario: Kullanıcı eArsiv sayfasına giriş yapar
    Given Kullanici "eArsiv" sayfasına gider
    When Kullanici email ve sifre girer
    And Kullanici giris yap butonuna tiklar