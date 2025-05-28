# 🚀 Быстрый старт AIUEducation

## Самый простой способ запуска

1. **Убедитесь, что у вас установлены Docker и Docker Compose**

2. **Запустите скрипт:**
   ```bash
   ./start-local.sh
   ```
   Выберите вариант `1` (Простой запуск)

3. **Откройте браузер:**
   ```
   http://localhost:8080
   ```

## Альтернативный способ

```bash
# Запуск одной командой
docker-compose -f docker-compose.simple.yml up --build
```

## Что запускается?

- ✅ **Spring Boot приложение** на порту 8080
- ✅ **PostgreSQL база данных** на порту 5432
- ✅ **Автоматическая инициализация БД**

## Учетные данные

- **Приложение**: admin / admin
- **База данных**: aiueducation_user / aiueducation_pass

## Проверка работы

```bash
# Проверка health endpoint
curl http://localhost:8080/actuator/health

# Ожидаемый ответ:
# {"status":"UP","components":{"db":{"status":"UP"},...}}
```

## Остановка

```bash
# Остановка контейнеров
docker-compose -f docker-compose.simple.yml down

# Остановка с удалением данных БД
docker-compose -f docker-compose.simple.yml down -v
```

## Решение проблем

### Порты заняты
Если порт 8080 или 5432 занят, измените их в файле `docker-compose.simple.yml`

### Очистка Docker
```bash
docker system prune -a
```

---

📖 **Подробная документация**: [README_LOCAL.md](README_LOCAL.md) 