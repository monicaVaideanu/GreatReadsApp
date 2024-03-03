INSERT IGNORE INTO user_accounts(user_Id ,email, password)
VALUES
    (1,'anaM1234@yahoo.com', 'parolaNesigura'),
    (2,'bogdanBogdanasu@c.com', 'altaparolanesigura'),
    (3,'sigursuntAdmin@admin.com', 'adminadmin'),
    (4,'andreiAndreiut@123.y', 'altaparola');

INSERT IGNORE INTO user_details(first_name, last_name, user_Id, status)
VALUES
    ('Ana', 'Maria', 1,'user'),
    ('Bogdan', 'Bogdanasu', 2,'author'),
    ('AdminAdminAdmin', 'Admin', 3, 'admin'),
    ('Andrei', 'Andreiut', 4,'user');

