CREATE TABLE `orders` (
  `O_ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) NOT NULL,
  `NUM` int(4) NOT NULL,
  `PRICE` decimal(10,0) NOT NULL,
  `S_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`O_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (1, '剪刀', 2, 12, 1002);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (2, '苹果', 2, 50, 1003);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (3, '牛奶', 1, 78, 1005);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (4, '牛奶', 1, 78, 1006);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (5, '牛奶', 1, 78, 1003);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (6, '牛奶', 1, 78, 1002);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (7, '牛奶', 1, 78, 1005);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (8, '花生', 1, 78, 1006);
INSERT INTO `orders`(`O_ID`, `NAME`, `NUM`, `PRICE`, `S_ID`) VALUES (9, '饼干', 1, 78, 1003);


CREATE TABLE `servers` (
  `S_ID` int(11) NOT NULL AUTO_INCREMENT,
  `P_ID` int(11) DEFAULT NULL,
  `POLE_NAME` varchar(20) DEFAULT NULL,
  `USER_NAME` varchar(20) DEFAULT NULL,
  `USER_TEL` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`S_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;
INSERT INTO `servers`(`S_ID`, `P_ID`, `POLE_NAME`, `USER_NAME`, `USER_TEL`) VALUES (1001, NULL, '服务商', '张大大服务商', '110');
INSERT INTO `servers`(`S_ID`, `P_ID`, `POLE_NAME`, `USER_NAME`, `USER_TEL`) VALUES (1002, 1001, '客服1', '客服1', '111');
INSERT INTO `servers`(`S_ID`, `P_ID`, `POLE_NAME`, `USER_NAME`, `USER_TEL`) VALUES (1003, 1001, '客服2', '客服2', '112');
