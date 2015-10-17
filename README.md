# Домашнее Задание №1 

##Создать приложение для изучения основых View'шек, Intent'a и жизненным циклом активностей (Activities Life Cycle)

В MainActivity создать <br />

1) TextView c произвольным текстом <br />
2) 	2.1 EditText c подсказкой (hint) "Введите текст"<br />
    2.2 При нажатии на кнопку, если текст EditText'a будет пустым, вывести Toast c текстом "Сначала введите текст"<br />
3) Button для перехода в SecondActivity (startActivityForResult)<br />

В SecondActivity <br />

1) TextView c текстом, который пользователь ввел в EditText в MainActivity<br />
2)  2.1 EditText c подскаской <br />
    2.2 Не дать пользователю вернуться назад, при пустом тексте в EditText, вывести Toast <br />
3) При возвращении в MainActivity в TextView положить текст из EditText из SecondActivity<br />
4) При возвращении в MainActivity поменять цвет кнопки (OnResume)

Вспомогательные ссылки :<br />
1) [startActivityForResult](http://developer.android.com/intl/ru/training/basics/intents/result.html)<br />

Уроки: <br />
1) [Видео-уроки с habrahabr] (habrahabr.ru/post/230559)<br />
2) [StartAndroid - очень хороший сайт для новичка](http://startandroid.ru/ru/uroki/vse-uroki-spiskom.html)<br />
3) [Неплохая книга по андроиду] (https://www.dropbox.com/s/vmen7s4t5496kw1/Android%204.%20%D0%9F%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B9%20%D0%B4%D0%BB%D1%8F%20%D0%BF%D0%BB%D0%B0%D0%BD%D1%88%D0%B5%D1%82%D0%BD%D1%8B%D1%85%20%D0%BA%D0%BE%D0%BC%D0%BF%D1%8C%D1%8E%D1%82%D0%B5%D1%80%D0%BE%D0%B2%20%D0%B8%20%D1%81%D0%BC%D0%B0%D1%80%D1%82%D1%84%D0%BE%D0%BD%D0%BE%D0%B2.djvu?dl=0)<br />
4) [Если знаете английский] (http://developer.android.com/intl/ru/training/index.html)<br />

Пока задание не совсем интересное, но в следующий раз дадим "большой" проект. Все его аспекты будем проходить поэтапно. Домашние задания будут иметть больше смысла
