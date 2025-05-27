# AIUEducation - Быстрый деплой

## 🚀 Деплой за 3 команды

1. **Клонируй проект:**
   ```bash
   git clone <your-repo-url>
   cd aiueducation
   ```

2. **Скопируй настройки:**
   ```bash
   cp .env.example .env
   ```

3. **Запусти:**
   ```bash
   docker-compose up --build -d
   ```

## 🎯 Готово!

- **Сайт:** http://your-server-ip:8080
- **База данных:** localhost:5432
- **Логин/пароль БД:** aiueducation/aiueducation123

## 📋 Управление

```bash
# Остановить
docker-compose down

# Перезапустить
docker-compose restart

# Логи
docker-compose logs -f

# Статус
docker-compose ps
```

## ⚙️ Настройки

Измени `.env` если нужно:
- `DATABASE_PASSWORD` - пароль БД
- `DATABASE_USERNAME` - пользователь БД
- `DATABASE_NAME` - имя БД

## 🔧 Требования

- Docker
- Docker Compose
- Открытый порт 8080

---

**Всё работает из коробки!** 📦 