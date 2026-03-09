# 🏫 Java OOP College

[![GitHub](https://img.shields.io/badge/GitHub-Репозиторий-181717?style=for-the-badge&logo=github)](https://github.com/whunotexplain/java_oop_college)
[![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)](https://www.java.com)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

## 📋 Описание

Репозиторий с лабораторными работами по курсу **Java OOP**. Здесь собраны основные задания и дополнительные задачи по программированию на Java.

---

## 📂 Структура проекта
java_oop_college/
│
└── 📁 src/ # Исходный код
└── 📁 laba_1/ # Первая лабораторная работа
├── 📁 problems/ # ОСНОВНЫЕ ЗАДАНИЯ
│ ├── 📄 discriminant.java # Решение квадратного уравнения
│ └── 📄 cicles.java # Работа с циклами и условиями
│
└── 📁 problems/dop/ # ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ
├── 📄 variant_1.java # Вариант 1: Остаток от деления
├── 📄 variant_2.java # Вариант 2-3: Минимум и максимум
├── 📄 variant_4.java # Вариант 4: Четные числа в диапазоне
├── 📄 variant_7.java # Вариант 7: Проверка попадания в отрезок
├── 📄 variant_8.java # Вариант 8: Ввод трех чисел
└── 📄 variant_12.java # Вариант 12: Времена года
## 📚 Основные задания

### Лабораторная работа №1

| № | Файл | Описание |
|:--:|------|----------|
| 1 | [`discriminant.java`](./laba_1/discriminant.java) | Решение квадратного уравнения через дискриминант |


---


## ✨ Дополнительные задания

Дополнительные задачи находятся в папке [`laba_1/dop_problems/`](./laba_1/dop_problems/)

| Вариант | Задание | Файл | Ссылка |
|:-------:|---------|------|:------:|
| **1** | Найти остаток от деления двух целых чисел a и b. Числа могут быть отрицательными. | `variant_1.java` | [🔗](./laba_1/dop_problems/variant_1.java) |
| **2** | Найти минимальное число из двух заданных чисел a и b | `variant_2.java` | [🔗](./laba_1/dop_problems/variant_2.java) |
| **3** | Найти максимальное число из двух заданных чисел a и b | `variant_2.java` | [🔗](./laba_1/dop_problems/variant_2.java) |
| **4** | Вывести только четные числа из двух заданных входных чисел | `variant_4.java` | [🔗](./laba_1/dop_problems/variant_4.java) |
| **5** | Используя оператор switch вычислить количество дней в месяце (a - номер месяца, b - 1 для високосного года, 0 в противном случае) | `variant_5.java` | [🔗](./laba_1/dop_problems/variant_5.java) |
| **6** | Даны два вещественных числа x и y. Определить x/y с проверкой деления на ноль | `variant_6.java` | [🔗](./laba_1/dop_problems/variant_6.java)|
| **7** | Определить, попадает ли значение целой величины a в отрезок [x; y] | `variant_7.java` | [🔗](./laba_1/dop_problems/variant_7.java) |
| **8** | Вывести в нисходящем порядке значения трех переменных x, y, z | `variant_8.java` | [🔗](./laba_1/dop_problems/variant_8.java) |
| **9** | Задан номер месяца года. Определить его принадлежность ко времени года | `variant_9_java` | [🔗](./laba_1/dop_problems/variant_9.java) |

## 🚀 Как запустить

### Способ 1: Через терминал

```bash
# Клонировать репозиторий
git clone https://github.com/whunotexplain/java_oop_college.git

# Перейти в нужную папку
cd java_oop_college/laba_1

# Скомпилировать файл
javac discriminant.java

# Запустить программу
java discriminant
