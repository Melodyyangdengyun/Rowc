/*
Navicat MySQL Data Transfer

Source Server         : ydy
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : rowc

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-03-30 14:56:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for clothes_register
-- ----------------------------
DROP TABLE IF EXISTS `clothes_register`;
CREATE TABLE `clothes_register` (
  `id` varchar(255) NOT NULL,
  `createdate` datetime DEFAULT NULL,
  `updatedate` datetime DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `registerdate_d` datetime DEFAULT NULL,
  `colour_d` varchar(255) DEFAULT NULL,
  `style_d` varchar(255) DEFAULT NULL,
  `size_d` varchar(255) DEFAULT NULL,
  `length_d` varchar(255) DEFAULT NULL,
  `number_d` varchar(255) DEFAULT NULL,
  `company_d` varchar(255) DEFAULT NULL,
  `total_d` varchar(255) DEFAULT NULL,
  `paymentstate_d` varchar(255) DEFAULT NULL,
  `office_d` varchar(255) DEFAULT NULL,
  `head_d` varchar(255) DEFAULT NULL,
  `managers_d` varchar(255) DEFAULT NULL,
  `phone_d` varchar(255) DEFAULT NULL,
  `price_d` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
