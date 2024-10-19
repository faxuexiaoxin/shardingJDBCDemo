TRUNCATE `user_0`;

INSERT INTO `sharding`.`user_0` (`userId`, `userName`, `userPassword`, `userPassword_`)
VALUES (1, '张三', 'abc', '12313'),
       (2, '李四', '123', 'badfsd');

TRUNCATE `user_1`;

INSERT INTO `sharding`.`user_1` (`userId`, `userName`, `userPassword`, `userPassword_`)
VALUES (1, '张三', 'abc', '12313'),
       (2, '李四', '123', 'badfsd');