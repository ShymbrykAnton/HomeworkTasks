HomeWorkTasksReady
This repository contains tasks for the Java course (DevEducation)  

Package homework1  

Class ConditionalOperators:  
1.method getSumOrMultiply:	Если а – четное посчитать а*б, иначе а+б;  
2.method findQuarterByCoordinates:	Определить какой четверти принадлежит точка с координатами (х,у);  
3.method getOnlyPositiveNumberSum:	Найти суммы только положительных из трех чисел;  
4.method getMaxMultiplyOrSumPlusThree:	Посчитать выражение (макс(а*б*с, а+б+с))+3;  
5.method getMarkByRating:	Написать программу определения оценки студента по его рейтингу, на основе следующих правил:  
Рейтинг  Оценка  
  0-19	     F  
  20-39	    E  
  40-59 	   D  
  60-74 	   C  
  75-89     B  
 90-100	    A  
  
Class Cycles:  
1.method getEvenSumNumber:	Найти сумму четных чисел и их количество в диапазоне от 1 до 99;  
2.method checkNumberIsPrime:	Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1);  
3.method getSquareRoot:	Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска);  
4.method getFactorial:	Вычислить факториал числа n. n! = 1*2*…*n-1*n;  
5.method getNumeralSum:	Посчитать сумму цифр заданного числа;  
6.method getReversedNumber:	Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.  

Class Arrays:  
1.method getMinElementInArray:	Найти минимальный элемент массива;  
2.method getMaxElementInArray:	Найти максимальный элемент массива;  
3.method getMinElementIndex:	Найти индекс минимального элемента массива;  
4.method getMaxElementIndex:	Найти индекс максимального элемента массива;  
5.method getSumNotEvenIndexElement:	Посчитать сумму элементов массива с нечетными индексами;  
6.method reverseArray:	Сделать реверс массива (массив в обратном направлении);  
7.method countNotEvenElementInArray:	Посчитать количество нечетных элементов массива;  
8.method swapFirstAndSecondPartOfArray:	Поменять местами первую и вторую половину массива, например, для массива;  
1 2 3 4, результат 3 4 1 2  
9.Not Done:	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert));  
10.Not Done:	Отсортировать массив (Quick, Merge, Shell, Heap).  

Class Functions: not created  
1.Вводим число(0-999), получаем строку с прописью числа.  
2.Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число  
3.Для задания 2 расширить диапазон до 999 миллиардов  
4.Для задания 3 расширить диапазон до 999 миллиардов  

Package Randomizer  
Class Randomizer  
Консольное приложение при запуске которого пользователю дают выбрать диапазон, в котором будет осуществляться генерации случайных, уникальных целых числел (1-500).  
Далее осуществляеться переход в method menu - пользователю предлагается на выбор ввести одну из трех комманд: "generate", "help", "exit".  
generate - method generate - осуществляет генерацию чисел;  
help - method help - выводит более детальное описание программы для пользователя и описание остальных комманд;  
exit - method exit - выводит строку подтверждения выхода. При подтверждении - завершает работу программы, при отклонении - возврат в меню.