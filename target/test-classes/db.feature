Feature: DB
@deneme
 Scenario Outline:

   Given Database baglantisi kurulur
   Then  Staff tabosundaki "id" leri listeler
   And   verilen "<id>" dogrulanir
   And   Database baglantisini kapatilir






   Examples:
     |id|
     |3|

