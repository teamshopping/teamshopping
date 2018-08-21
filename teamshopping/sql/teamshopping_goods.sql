/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : teamshopping

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 21/08/2018 09:05:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teamshopping_goods
-- ----------------------------
DROP TABLE IF EXISTS `teamshopping_goods`;
CREATE TABLE `teamshopping_goods`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `money` double NOT NULL,
  `state` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `introduce` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_goods_type`(`type`) USING BTREE,
  CONSTRAINT `FK_goods_type` FOREIGN KEY (`type`) REFERENCES `teamshopping_type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
