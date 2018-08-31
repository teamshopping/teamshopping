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

 Date: 31/08/2018 09:52:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for help
-- ----------------------------
DROP TABLE IF EXISTS `help`;
CREATE TABLE `help`  (
  `help_id` int(11) NOT NULL AUTO_INCREMENT,
  `help_step` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `help_content` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `help_picture` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`help_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for journalism
-- ----------------------------
DROP TABLE IF EXISTS `journalism`;
CREATE TABLE `journalism`  (
  `journalism_id` int(11) NOT NULL AUTO_INCREMENT,
  `journalism_title` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `journalism_article` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `journalism_picture` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`journalism_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
  `picture` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `introduce` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_goods_type`(`type`) USING BTREE,
  CONSTRAINT `FK_goods_type` FOREIGN KEY (`type`) REFERENCES `teamshopping_type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teamshopping_goods
-- ----------------------------
INSERT INTO `teamshopping_goods` VALUES (1, 1, 160, 5399, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer01.jpg', '联想ThinkPad 翼480（0UCD）14英寸轻薄窄边框笔记本电脑（i5-8250U 8G 256GSSD 2G独显 FHD IPS屏）冰原银 ');
INSERT INTO `teamshopping_goods` VALUES (2, 1, 160, 5999, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer02.jpg', '华硕（ASUS） 飞行堡垒五代FX80 15.6英寸吃鸡游戏1050ti笔记本手提电脑IPS屏 火陨 i5-8300H/8G/双硬盘/1050Ti 4G');
INSERT INTO `teamshopping_goods` VALUES (3, 1, 160, 3999, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer03.jpg', '荣耀MagicBook 14英寸轻薄窄边框笔记本电脑（AMD锐龙5 8G 256G FHD IPS 正版Office）冰河银');
INSERT INTO `teamshopping_goods` VALUES (4, 1, 160, 5999, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer04.jpg', '戴尔DELL游匣G3 15.6英寸游戏笔记本电脑(i5-8300H 8G 128GSSD+1T GTX1050Ti 4G独显 IPS)烈焰版');
INSERT INTO `teamshopping_goods` VALUES (5, 1, 160, 5399, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer05.jpg', '戴尔DELL灵越燃7000 II 14.0英寸轻薄窄边框笔记本电脑(i5-8250U 8G 128GSSD+1T MX150 2G独显 IPS)银 ');
INSERT INTO `teamshopping_goods` VALUES (6, 1, 160, 4998, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer06.jpg', '联想(Lenovo)小新潮7000 14英寸英特尔八代酷睿轻薄窄边框笔记本电脑(I5-8250U 8G 2T+128G PCIE R535 2G)银');
INSERT INTO `teamshopping_goods` VALUES (7, 1, 160, 6099, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer07.jpg', '联想(Lenovo)小新潮7000 14英寸超轻薄窄边框笔记本电脑(I7-8550U 8G 2T+128G PCIE R535 2G)极光银 ');
INSERT INTO `teamshopping_goods` VALUES (8, 1, 160, 8299, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer08.jpg', '联想(Lenovo)拯救者Y7000英特尔八代酷睿 15.6英寸游戏笔记本电脑(i7-8750H 8G 1T+128G GTX1060 72%NTSC黑) ');
INSERT INTO `teamshopping_goods` VALUES (9, 1, 160, 7699, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer09.jpg', '惠普（HP）暗影精灵4代 15.6英寸游戏笔记本电脑（i5-8300H 8G 128G+1TB GTX1060 6G独显 四区背光键盘 IPS)');
INSERT INTO `teamshopping_goods` VALUES (10, 1, 160, 9999, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer10.jpg', '惠普（HP）暗影精灵4代 15.6英寸游戏笔记本电脑（i7-8750H 16G 128G+1TB GTX1060 6G 144Hz G-Sync IPS）');
INSERT INTO `teamshopping_goods` VALUES (11, 1, 160, 3599, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer11.jpg', '小米(MI) Air 12.5英寸金属超轻薄笔记本电脑(Core M-7Y30 4G 128G 全高清屏 背光键盘 Win10正版office)银 ');
INSERT INTO `teamshopping_goods` VALUES (12, 1, 160, 3589, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer12.jpg', '华硕（ASUS） 超薄本A480 酷睿i3轻薄家用影音学生固态独显超极本商务办公手提游戏笔记本电脑 i3-7100U/4G/500G+128G ');
INSERT INTO `teamshopping_goods` VALUES (13, 1, 160, 4598, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer13.jpg', '戴尔DELL灵越燃7000 II 14.0英寸轻薄窄边框笔记本电脑(i5-8250U 8G 256GSSD IPS Win10)元気粉');
INSERT INTO `teamshopping_goods` VALUES (14, 1, 160, 4888, '上架', 'http://127.0.0.1:8080/teamshopping/teamshopping/images/computer/computer14.jpg', '华为(HUAWEI) MateBook D(2018版) 15.6英寸轻薄微边框笔记本(i5-8250U 8G 256G MX150 2G独显 FHD office)银 ');

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
INSERT INTO `teamshopping_type` VALUES (1, '笔记本电脑');
INSERT INTO `teamshopping_type` VALUES (2, '台式电脑');
INSERT INTO `teamshopping_type` VALUES (3, '平板电脑');
INSERT INTO `teamshopping_type` VALUES (4, '手机');
INSERT INTO `teamshopping_type` VALUES (5, '照相机');
INSERT INTO `teamshopping_type` VALUES (6, '智能空调');

-- ----------------------------
-- Table structure for user_address
-- ----------------------------
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address`  (
  `u_address_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_address_province` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_address_city` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_address_area` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_address_detailed` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_address_mid` int(11) NOT NULL,
  PRIMARY KEY (`u_address_id`) USING BTREE,
  INDEX `FK_address`(`u_address_mid`) USING BTREE,
  CONSTRAINT `FK_address` FOREIGN KEY (`u_address_mid`) REFERENCES `user_member` (`u_member_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_address
-- ----------------------------
INSERT INTO `user_address` VALUES (1, '湖北省', '武汉市', '江夏区', '金融港', 2);

-- ----------------------------
-- Table structure for user_administrators
-- ----------------------------
DROP TABLE IF EXISTS `user_administrators`;
CREATE TABLE `user_administrators`  (
  `u_administrators` int(11) NOT NULL AUTO_INCREMENT,
  `u_administrators_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_administrators_pwd` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_administrators_realname` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_administrators_phone` int(11) NOT NULL,
  `u_administrators_work` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`u_administrators`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_area
-- ----------------------------
DROP TABLE IF EXISTS `user_area`;
CREATE TABLE `user_area`  (
  `u_area_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_area_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_area_cid` int(11) NULL DEFAULT NULL,
  INDEX `u_area_id`(`u_area_id`) USING BTREE,
  INDEX `FK_area_city`(`u_area_cid`) USING BTREE,
  CONSTRAINT `FK_area_city` FOREIGN KEY (`u_area_cid`) REFERENCES `user_city` (`u_city_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_area
-- ----------------------------
INSERT INTO `user_area` VALUES (1, '江夏区', 1);

-- ----------------------------
-- Table structure for user_buycar
-- ----------------------------
DROP TABLE IF EXISTS `user_buycar`;
CREATE TABLE `user_buycar`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodity` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `number` int(11) NOT NULL,
  `price` double NOT NULL,
  `u_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_buycar
-- ----------------------------
INSERT INTO `user_buycar` VALUES (1, '??DELL???7000 II 14.0????????????(i5-8250U 8G 128GSSD+1T MX150 2G?? IPS)? ', 1, 5399, 1);
INSERT INTO `user_buycar` VALUES (2, '??(Lenovo)???7000 14?????????????(I7-8550U 8G 2T+128G PCIE R535 2G)??? ', 1, 6099, 1);

-- ----------------------------
-- Table structure for user_city
-- ----------------------------
DROP TABLE IF EXISTS `user_city`;
CREATE TABLE `user_city`  (
  `u_city_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_city_name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_city_pid` int(11) NULL DEFAULT NULL,
  INDEX `u_city_id`(`u_city_id`) USING BTREE,
  INDEX `FK_city_province`(`u_city_pid`) USING BTREE,
  CONSTRAINT `FK_city_province` FOREIGN KEY (`u_city_pid`) REFERENCES `user_province` (`u_province_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_city
-- ----------------------------
INSERT INTO `user_city` VALUES (1, '武汉市', 1);

-- ----------------------------
-- Table structure for user_convertibility
-- ----------------------------
DROP TABLE IF EXISTS `user_convertibility`;
CREATE TABLE `user_convertibility`  (
  `u_convertibility_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_convertibility_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_convertibility_effect` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_convertibility_uid` int(11) NOT NULL,
  PRIMARY KEY (`u_convertibility_id`) USING BTREE,
  INDEX `FK_convertibility`(`u_convertibility_uid`) USING BTREE,
  CONSTRAINT `FK_convertibility` FOREIGN KEY (`u_convertibility_uid`) REFERENCES `user_member` (`u_member_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_integral
-- ----------------------------
DROP TABLE IF EXISTS `user_integral`;
CREATE TABLE `user_integral`  (
  `u_integral_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_integral_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_integral_number` int(11) NOT NULL,
  `u_integral_state` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`u_integral_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_luckdraw
-- ----------------------------
DROP TABLE IF EXISTS `user_luckdraw`;
CREATE TABLE `user_luckdraw`  (
  `u_luckdraw_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_luckdraw_mid` int(11) NULL DEFAULT NULL,
  `u_luckdraw_pid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`u_luckdraw_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_member
-- ----------------------------
DROP TABLE IF EXISTS `user_member`;
CREATE TABLE `user_member`  (
  `u_member_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_member_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_member_pwd` char(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_member_reale` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_member_sex` bit(1) NULL DEFAULT NULL,
  `u_member_image` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_member_phone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_member_email` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_member_integral` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`u_member_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_member
-- ----------------------------
INSERT INTO `user_member` VALUES (1, 'zzr123', '123', '沙漠', NULL, 'http://127.0.0.1:8080/teamshopping/usermember/img/portrait01.jpg', '12323155671', '123456@mm.cc', NULL);
INSERT INTO `user_member` VALUES (2, 'xiaohe', '123456', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for user_order
-- ----------------------------
DROP TABLE IF EXISTS `user_order`;
CREATE TABLE `user_order`  (
  `u_order_id` int(11) NULL DEFAULT NULL,
  `u_order_number` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_order_time` date NULL DEFAULT NULL,
  `u_order_mode` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_order_business` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_order_member` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_order_businessname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_order_price` double NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_prize
-- ----------------------------
DROP TABLE IF EXISTS `user_prize`;
CREATE TABLE `user_prize`  (
  `s_prize_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_prize_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_prize_remarks` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`s_prize_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_province
-- ----------------------------
DROP TABLE IF EXISTS `user_province`;
CREATE TABLE `user_province`  (
  `u_province_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_province_name` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  INDEX `u_province_id`(`u_province_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_province
-- ----------------------------
INSERT INTO `user_province` VALUES (1, '湖北省');
INSERT INTO `user_province` VALUES (2, '湖南省');
INSERT INTO `user_province` VALUES (3, '安徽省');
INSERT INTO `user_province` VALUES (4, '浙江省');
INSERT INTO `user_province` VALUES (5, '福建省');
INSERT INTO `user_province` VALUES (6, '广东省');
INSERT INTO `user_province` VALUES (7, '吉林省');
INSERT INTO `user_province` VALUES (8, '江苏省');

-- ----------------------------
-- Table structure for worknumber
-- ----------------------------
DROP TABLE IF EXISTS `worknumber`;
CREATE TABLE `worknumber`  (
  `worknumber_id` int(11) NOT NULL AUTO_INCREMENT,
  `worknumber_number` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`worknumber_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
