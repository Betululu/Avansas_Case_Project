@deneme
Feature:

  Background:
    Given kullanici "https://phptravels.net/api/admin" url ine gider
    And kullanici "admin@phptravels.com" girer
    And kullanici sifreyi "demoadmin" girer
    Then kullanici giris yapar

  Scenario:
    Given kullanici accounts linkine tiklar
    And kullanici custemers secenegine tiklar
    And kullanici add  linkine tiklar
    And kullanici firstname checkbox ina "Aysenur" girer
    And kullanici lastname checkbox ina "uluca" girer
    And kullanici email checkbox ina "ulucan@gmail.com" girer
    And kullanici password checkbox ina "123456" girer
    And kullanici mobilNumber checkbox ina "5445567571" girer
    And kullanici country checkbox ina Turkey girer
    And kullanici adress1 checkbox ina "Istanbul" girer
    And kullanici adress2 checkbox ina "Uskudar" girer
    And kullanici Email Newsletter Subscriber checkbox ini tiklar
    Then kullanici submit butonuna tiklar