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

 Date: 21/08/2018 09:05:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teamshopping_type
-- ----------------------------
DROP TABLE IF EXISTS `teamshopping_type`;
CREATE TABLE `teamshopping_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typename` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teamshopping_type
-- ----------------------------
INSERT INTO `teamshopping_type` VALUES (1, '笔记本');
INSERT INTO `teamshopping_type` VALUES (2, '台式');
INSERT INTO `teamshopping_type` VALUES (3, '平板');
INSERT INTO `teamshopping_type` VALUES (4, '手机');
INSERT INTO `teamshopping_type` VALUES (5, '照相机');
INSERT INTO `teamshopping_type` VALUES (6, '智能空调');

SET FOREIGN_KEY_CHECKS = 1;
