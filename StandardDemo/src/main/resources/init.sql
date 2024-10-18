DROP TABLE IF EXISTS `user`;
CREATE TABLE if not exists `user`
(
    `userId`        INT         NOT NULL AUTO_INCREMENT,
    `userName`      VARCHAR(45) NOT NULL,
    `userPassword`  VARCHAR(45) NOT NULL,
    `userPassword_` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`userId`)
)