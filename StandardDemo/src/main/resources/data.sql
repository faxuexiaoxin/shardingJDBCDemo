TRUNCATE `user`;

INSERT INTO `sharding`.`user` (`userId`, `userName`, `userPassword`, `userPassword_`)
VALUES (1, '张三', 'abc', '12313'),
       (2, '李四', '123', 'badfsd');