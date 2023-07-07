package org.example;

public class Sol11 {
    /*
    Вы живете в городе Картезия, где все дороги выстроены в идеальную сетку.
    Вы пришли на встречу на десять минут раньше назначенного времени,
    поэтому решили воспользоваться возможностью и немного прогуляться.
    Город предоставляет своим жителям приложение Walk Generating App на их телефонах - каждый раз,
    когда вы нажимаете на кнопку, оно посылает вам массив однобуквенных строк,
    представляющих направления для прогулки (например, ['n', 's', 'w', 'e']).
    Вы всегда проходите только один квартал для каждой буквы (направления) и знаете,
    что на прохождение одного городского квартала уходит одна минута, поэтому создайте функцию,
    которая будет возвращать true, если прогулка, которую дает приложение,
    займет у вас ровно десять минут (вы же не хотите прийти раньше или опоздать!) и, конечно,
    вернет вас в исходную точку. В противном случае возвращает false.
     */
    public static boolean isValid(char[] walk) {
       int coordNS = 0;
       int coordWE = 0;
       if(walk.length>10|| walk.length<1){
           return false;
       }
        for (char c : walk) {
            switch (c){
                case 'n':
                    coordNS+= 1;
                    break;
                case 's':
                    coordNS-=1;
                    break;
                case 'w':
                    coordWE+=1;
                    break;
                case 'e':
                    coordWE-=1;
            }
        }
        if(coordWE == 0 && coordNS == 0)
        {
            return true;
        }else {

            return false;
        }
    }
}
