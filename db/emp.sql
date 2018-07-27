DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` varchar(64) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `hiredate` datetime DEFAULT NULL,
  `job` varchar(10) DEFAULT NULL,
  `hobbies` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
### mkd本身师傅的说法n
