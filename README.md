# МЕССЕНДЖЕР

## Проблемы
Не реализовано использование статического поля id сообщений и пользователей для идентификации экземпляров классов Message и User.


## Документация
Мессенджер позволяет обрабатывать сообщения между пользователями различных уровней доступа.
Класс Message содержит поля sender - отправитель, recipient - получатель, createDate - дата отправления сообщения, update - дата исправления сообщения, text - текст сообщения, методы setText и setUpdate.
Класс MessagData содержит два поля - id и message.
Абстрактный класс BaseUser содержит поля firstName - имя, lastName - фамилия, birthYear - год рождения, count - счетчик для регистрации безымянных пользователей (класс Guest).
Интерфейс BaseUserAction содержит метод sendMessage<T, TEXT>.
Класс UserData содержит два поля - id и message.
Класс Guest наследует классу BaseUser и имплементирует интерфейс BaseUserAction. В поле accessLevel указывается уровень доступа. Guest имеет низший уровень доступа - 5. Ему доступен только метод отправки сообщений sendMessage.
Класс User наследует классу BaseUser и имплементирует интерфейс UserAction. Уровень доступа - 2. Доступны методы sendMessage и editMessage.
Интерфейс UserAction наследует интерфейсу BaseUserAction и содержит метод editMessage.
Класс Moderator наследует классу User и имплементирует интерфейс ModeratorAction. Уровень доступа - 1. Дополнительно доступны методы deleteMsg и showAllMessages.
Класс Admin наследует классу Moderator и имплементирует интерфейс AdminAction. Уровень доступа наивысший - 0. Дополнительно доступны методы showAllUsers и deleteUser.
Класс DataBase хранит список сообщений и список пользователей.
Интерфейс Repository содержит методы save - позволяющий добавлять запись, findById - поиск записи по id, deleteById - удаление записи по id.
Класс RepoMsg имплементирует интерфейс Repository, реализует работу с сообщениями - добавление, поиск, удаление.
Класс RepoUsers имплементирует интерфейс Repository и реализует работу с пользователями - добавление, поиск, удаление.

## Рефакторинг
Использовать enum вместо int в accessLevel.

## Оптимизация
*Циклы, поиск, сортировка*