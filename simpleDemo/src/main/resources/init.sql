DROP TABLE IF EXISTS `user_0`;
CREATE TABLE if not exists `user_0`
(
    `userId`        BIGINT         NOT NULL AUTO_INCREMENT,
    `userName`      VARCHAR(45) NOT NULL,
    `userPassword`  VARCHAR(45) NOT NULL,
    `userPassword_` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`userId`)
);

DROP TABLE IF EXISTS `user_1`;
CREATE TABLE if not exists `user_1`
(
    `userId`        BIGINT         NOT NULL AUTO_INCREMENT,
    `userName`      VARCHAR(45) NOT NULL,
    `userPassword`  VARCHAR(45) NOT NULL,
    `userPassword_` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`userId`)
)