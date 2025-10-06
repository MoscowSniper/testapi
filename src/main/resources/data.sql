-- Вставляем тестовых пользователей
INSERT INTO users (name, email, password, created_at) VALUES
                                                          ('Admin User', 'admin@example.com', 'admin123', CURRENT_TIMESTAMP),
                                                          ('John Doe', 'john@example.com', 'password123', CURRENT_TIMESTAMP),
                                                          ('Jane Smith', 'jane@example.com', 'password456', CURRENT_TIMESTAMP);

-- Вставляем тестовые продукты
INSERT INTO products (name, description, price, quantity) VALUES
                                                              ('Ноутбук игровой', 'Мощный игровой ноутбук с процессором Intel Core i7', 150000.00, 5),
                                                              ('Смартфон флагман', 'Флагманский смартфон с камерой 200 МП', 89999.99, 15),
                                                              ('Беспроводные наушники', 'Наушники с активным шумоподавлением', 12900.50, 30);