# WebDriver-Framework-on-Java

Наконец-то последний штрих. :blush:

Этот момент настал, я в одном шаге от поиска работы, я тестировщик :office_worker:

## Условия задачи

Задача - построить фреймворк для автоматизации Hardcore задания из курса [WebDriver](https://github.com/eerty1/Selenium-WebDriver-on-Java.git).

Что должно быть в итоговом фреймворке:

* Webdrivermanager для управления коннекторам к браузерам

* Page Object / Page Factory для абстракций страниц

* Модель для бизнес-объектов необходимых сущностей

* Properties файлы с тестовыми данным для разных окружений (как минимум 2)

* Xml suites для smoke тестов и всех тестов (к сожалению у меня только один тест в программе, поэтому выполнить это требования у меня нет возможности)

* При падении теста должен быть сделан скриншот с датой и временем

* Фреймворк должен иметь возможность запуска с Jenkins и параметризацией браузера, тест suite, environment. Результаты тестов должны быть на графике джобы, скриншоты должны быть заархивированны как артефакты

## Установка

 Для начала вам лучше использовать Java 8. :trophy:

![This is an image](https://i.ibb.co/LNW93hG/javaversion.png)

Также важно использовать правильную версию WebDriver.

Во время разработки проекта я использовал версию ** 99.0.4844.51**. Это последний стабильный релиз на **17.03.2022**.

Dependency:

   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

        <dependency>
             <groupId>org.seleniumhq.selenium</groupId>
             <artifactId>selenium-java</artifactId>
             <version>4.1.1</version>
        </dependency>

[Посмотреть на мой POM.xml полностью](https://ibb.co/album/9ZjWVn).

Используйте правильную версию maven.

![This is an image](https://i.ibb.co/kSLL33z/image.png)

Далее алгоритм действий прост:

* git clone WebDriver-Framework-on-Java

* Открыть этот проект в вашей IDE

## Работа с проектом

Запускаем проект из командной строки:

    mvn -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src\test\resources\testng.xml -Denvironment=dev clean test

[Это структура моего проекта, надеюсь, что она поможет вам разобраться что да как.](https://i.ibb.co/ySnZMq6/structureframework.png)

Убедитесь, что все dependency подключены.

## Прочее

Все материалы были взяты из курса [EPAM Automated Testing course](https://training.epam.com/#!/Training/3044?lang=en). :test_tube:

Резервную копию заданий вы можете найти [тут](https://github.com/vitalliuss/automation-training.git), файл называется "backup.md". :file_folder: