# neoflex_test_java
Тестовое задание

Инициализировать БД можно в resources/application.properties, раскомментировав три последние строки. Также, нужно будет укзаать адрес, логин и пароль для подключения к БД в том же файле.

1. Реализован POST запрос для добавления пользователя в endpoint /users. Если пользователя с указанным именем не существует, то он создастся. В противном случау - сервер вернёт 409 conflict.

curl -i --header "Content-Type: application/json" --request POST --data '{"name":"Pavel"}' http://localhost:8080/users

2. Реализован DELETE запрос. Удаление производится по id пользователя. В случае, если указанного id нет в базе - возвращается 304 Not Modified.

curl -i --header "Content-Type: application/json" --request DELETE --data '{"id":"1"}' http://localhost:8080/users
