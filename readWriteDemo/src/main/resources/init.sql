create database IF NOT EXISTS sharding;
USE sharding;
DROP TABLE IF EXISTS `user_0`;
CREATE TABLE if not exists `user_0`
(
    `userId`        BIGINT         NOT NULL AUTO_INCREMENT,
    `userName`      VARCHAR(45) NOT NULL,
    `userPassword`  VARCHAR(45) NOT NULL,
    `userPassword_` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`userId`)
);

create database IF NOT EXISTS sharding1;
USE sharding1;
DROP TABLE IF EXISTS `user_0`;
CREATE TABLE if not exists `user_0`
(
    `userId`        BIGINT         NOT NULL AUTO_INCREMENT,
    `userName`      VARCHAR(45) NOT NULL,
    `userPassword`  VARCHAR(45) NOT NULL,
    `userPassword_` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`userId`)
);

create database IF NOT EXISTS sharding2;
USE sharding2;
DROP TABLE IF EXISTS `user_0`;
CREATE TABLE if not exists `user_0`
(
    `userId`        BIGINT         NOT NULL AUTO_INCREMENT,
    `userName`      VARCHAR(45) NOT NULL,
    `userPassword`  VARCHAR(45) NOT NULL,
    `userPassword_` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`userId`)
);
