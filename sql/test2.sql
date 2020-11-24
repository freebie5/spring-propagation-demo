/*
Navicat MySQL Data Transfer

Source Server         : MySQL_02
Source Server Version : 50728
Source Host           : 192.168.1.192:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-11-24 20:13:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test2
-- ----------------------------
DROP TABLE IF EXISTS `test2`;
CREATE TABLE `test2` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
