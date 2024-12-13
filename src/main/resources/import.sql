-- Inserir Categorias
INSERT INTO tb_category (id, name) VALUES (1, 'Fiction');
INSERT INTO tb_category (id, name) VALUES (2, 'Science');
INSERT INTO tb_category (id, name) VALUES (3, 'Biography');

-- Inserir Livros
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (1, 'The Great Gatsby', 'F. Scott Fitzgerald', false, 1);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (2, 'A Brief History of Time', 'Stephen Hawking', true, 2);
INSERT INTO tb_book (id, title, author, availability, category_id) VALUES (3, 'Steve Jobs', 'Walter Isaacson', true, 3);

-- Inserir Usuários
INSERT INTO tb_user (id, name, email, password) VALUES (1, 'John Doe', 'john@example.com', '123456');
INSERT INTO tb_user (id, name, email, password) VALUES (2, 'Jane Smith', 'jane@example.com', 'password');

-- Inserir Associação Usuário-Livro
INSERT INTO tb_user_book (user_id, book_id, loan_date, return_date) VALUES (1, 1, '2024-12-01', NULL);

-- Inserir Roles
INSERT INTO tb_role (id, authority) VALUES (1, 'ROLE_ADMIN');
INSERT INTO tb_role (id, authority) VALUES (2, 'ROLE_USER');
