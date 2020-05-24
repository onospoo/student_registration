# Student registration service

Для запуска сервиса нужно выполнить команду `docker-compose up`.
После запуска поднимается база данных postgres на порте 5432 и сервис регистрации студента на порте 8080.
Вся документация об используемых api находится в swagger'e по ссылке `http://localhost:8080/swager-ui.html`.
Логин и пароль для входа: admin/admin.

### Используемые технологии

* Kotlin
* Spring-boot
* Postgres
* Spring security
* Docker