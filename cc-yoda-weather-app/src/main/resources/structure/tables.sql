CREATE TABLE IF NOT EXISTS `YodaWeather`.`citiesMaster` (
  `city` VARCHAR(256) NULL,
  `country` VARCHAR(45) NULL,
  `sensorId` VARCHAR(45) NULL,
  `citiesMastercol` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`citiesMastercol`),
  INDEX `priind1` (`city` ASC) INVISIBLE,
  INDEX `secind1` (`country` ASC) VISIBLE)
ENGINE = InnoDB
COMMENT = '	'

CREATE TABLE IF NOT EXISTS `YodaWeather`.`weather` (
  `dateTime` INT NULL,
  `sensorId` INT NULL,
  `temperature` DECIMAL(10) NULL,
  `rainfall` DECIMAL(10) NULL,
  `transactionId` BIGINT(1000) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`transactionId`),
  UNIQUE INDEX `transactionId_UNIQUE` (`transactionId` ASC) VISIBLE)
ENGINE = InnoDB

