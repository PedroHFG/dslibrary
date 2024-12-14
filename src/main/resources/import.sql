-- Inserir Categorias
INSERT INTO tb_category (id, name) VALUES (1, 'Fiction');
INSERT INTO tb_category (id, name) VALUES (2, 'Science');
INSERT INTO tb_category (id, name) VALUES (3, 'Biography');
INSERT INTO tb_category (id, name) VALUES (4, 'Technology');
INSERT INTO tb_category (id, name) VALUES (5, 'History');
INSERT INTO tb_category (id, name) VALUES (6, 'Fantasy');

-- Inserir Livros
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (1, 'The Great Gatsby', 'F. Scott Fitzgerald', false, 1);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (2, 'A Brief History of Time', 'Stephen Hawking', true, 2);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (3, 'Steve Jobs', 'Walter Isaacson', true, 3);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (4, 'Clean Code', 'Robert C. Martin', false, 4);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (5, 'Sapiens: A Brief History of Humankind', 'Yuval Noah Harari', false, 5);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (6, 'The Hobbit', 'J.R.R. Tolkien', true, 6);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (7, 'The Pragmatic Programmer', 'Andrew Hunt & David Thomas', true, 4);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (8, 'A People’s History of the United States', 'Howard Zinn', true, 5);

-- Inserir Usuários
INSERT INTO tb_user (id, name, email, password) VALUES (1, 'John Doe', 'john@example.com', '123456');
INSERT INTO tb_user (id, name, email, password) VALUES (2, 'Jane Smith', 'jane@example.com', 'password');
INSERT INTO tb_user (id, name, email, password) VALUES (3, 'Alice Brown', 'alice@example.com', 'alice123');
INSERT INTO tb_user (id, name, email, password) VALUES (4, 'Bob Johnson', 'bob@example.com', 'bob456');
INSERT INTO tb_user (id, name, email, password) VALUES (5, 'Charlie Davis', 'charlie@example.com', 'charlie789');

-- Inserir Associação Usuário-Livro
INSERT INTO tb_user_book (user_id, book_id, loan_date, return_date) VALUES (1, 1, '2024-12-01', NULL);
INSERT INTO tb_user_book (user_id, book_id, loan_date, return_date) VALUES (3, 4, '2024-12-10', NULL);
INSERT INTO tb_user_book (user_id, book_id, loan_date, return_date) VALUES (4, 5, '2024-12-08', NULL);

-- Inserir Roles
INSERT INTO tb_role (id, authority) VALUES (1, 'ROLE_ADMIN');
INSERT INTO tb_role (id, authority) VALUES (2, 'ROLE_USER');
