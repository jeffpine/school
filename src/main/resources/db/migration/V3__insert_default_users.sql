-- Inserindo usuários (use senhas hash, se possível)
INSERT INTO users (username, password) VALUES ('jander', '123456789');
INSERT INTO users (username, password) VALUES ('evandro', '2345678');
INSERT INTO users (username, password) VALUES ('joel', '3456789');
INSERT INTO users (username, password) VALUES ('alan', '456789123');
INSERT INTO users (username, password) VALUES ('patricia', '567891234');

-- Associando usuários aos papéis
INSERT INTO user_roles (user_id, role_id)
VALUES ((SELECT id FROM users WHERE username = 'jander'), (SELECT id FROM roles WHERE name = 'ROLE_DIRECTOR'));

INSERT INTO user_roles (user_id, role_id)
VALUES ((SELECT id FROM users WHERE username = 'evandro'), (SELECT id FROM roles WHERE name = 'ROLE_SECRETARY'));

INSERT INTO user_roles (user_id, role_id)
VALUES ((SELECT id FROM users WHERE username = 'joel'), (SELECT id FROM roles WHERE name = 'ROLE_TEACHER'));

INSERT INTO user_roles (user_id, role_id)
VALUES ((SELECT id FROM users WHERE username = 'alan'), (SELECT id FROM roles WHERE name = 'ROLE_ADVISOR'));

INSERT INTO user_roles (user_id, role_id)
VALUES ((SELECT id FROM users WHERE username = 'patricia'), (SELECT id FROM roles WHERE name = 'ROLE_STUDENT'));
