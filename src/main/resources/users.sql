INSERT IGNORE INTO users(user_id ,email, password, status)
VALUES
    (1,'anaM1234@yahoo.com', 'parolaNesigura', 'READER'),
    (2,'bogdanBogdanasu@c.com', 'altaparolanesigura', 'READER'),
    (3,'sigursuntAdmin@admin.com', 'adminadmin', 'ADMIN'),
    (4,'andreiAndreiutAutorAcreditat@123.y', 'altaparola', 'AUTHOR');

INSERT IGNORE INTO user_details(first_name, last_name, user_Id)
VALUES
    ('Ana', 'Maria', 1),
    ('Bogdan', 'Bogdanasu', 2),
    ('AdminAdminAdmin', 'Admin', 3),
    ('Andrei', 'Andreiut', 4);

