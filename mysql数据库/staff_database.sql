/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50620
 Source Host           : localhost:3306
 Source Schema         : staff_database

 Target Server Type    : MySQL
 Target Server Version : 50620
 File Encoding         : 65001

 Date: 30/08/2020 15:56:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for application_portal_done
-- ----------------------------
DROP TABLE IF EXISTS `application_portal_done`;
CREATE TABLE `application_portal_done`  (
  `applicate_id` int(11) NOT NULL AUTO_INCREMENT,
  `applicate_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_person` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `done_conditions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`applicate_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of application_portal_done
-- ----------------------------
INSERT INTO `application_portal_done` VALUES (1, 'QJ-2020-08-29-1', '病假', '2020-08-29 23:39:39', '张晓彤', '已同意', '感冒了 回家休息2天');
INSERT INTO `application_portal_done` VALUES (2, 'QJ-2020-08-29-1', '病假', '2020-08-29 23:43:48', '张晓彤', '已同意', '感冒生病了， 休息2天');
INSERT INTO `application_portal_done` VALUES (3, 'EW-2020-08-29-1', '加班', '2020-08-29 23:44:41', '张晓彤', '已同意', '项目赶进度');
INSERT INTO `application_portal_done` VALUES (4, 'QJ-2020-08-29-1', '病假', '2020-08-29 23:53:04', '张晓彤', '已同意', '感冒了，想在家休息1天');

-- ----------------------------
-- Table structure for application_portal_undone
-- ----------------------------
DROP TABLE IF EXISTS `application_portal_undone`;
CREATE TABLE `application_portal_undone`  (
  `applicate_id` int(11) NOT NULL AUTO_INCREMENT,
  `applicate_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_person` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `done_conditions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`applicate_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of application_portal_undone
-- ----------------------------
INSERT INTO `application_portal_undone` VALUES (4, 'CC-2020-08-29-1', '出差申请', '2020-08-29 23:50:04', '张晓彤', '未完成');
INSERT INTO `application_portal_undone` VALUES (5, 'GZ-2020-08-29-1', '公章申请', '2020-08-29 23:50:38', '张晓彤', '未完成');
INSERT INTO `application_portal_undone` VALUES (6, 'LZ-2020-08-29-1', '离职申请', '2020-08-29 23:51:15', '张晓彤', '未完成');

-- ----------------------------
-- Table structure for approve_leave_list
-- ----------------------------
DROP TABLE IF EXISTS `approve_leave_list`;
CREATE TABLE `approve_leave_list`  (
  `approve_id` int(255) NOT NULL AUTO_INCREMENT,
  `applicate_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staff_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `leave_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `end_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staff_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`approve_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of approve_leave_list
-- ----------------------------
INSERT INTO `approve_leave_list` VALUES (4, 'CC-2020-08-29-1', '102', '广州', '2020-09-09 13:07', '2020-09-11 17:30', '出去考察公司投资的项目', '张晓彤', '2020-08-29 23:50:04');
INSERT INTO `approve_leave_list` VALUES (5, 'GZ-2020-08-29-1', '102', '证明', '', '', '入职证明办理', '张晓彤', '2020-08-29 23:50:38');
INSERT INTO `approve_leave_list` VALUES (6, 'LZ-2020-08-29-1', '102', '感觉有点工资低了', '2020-09-30', '', '薪酬原因', '张晓彤', '2020-08-29 23:51:15');

-- ----------------------------
-- Table structure for approve_leave_list_done
-- ----------------------------
DROP TABLE IF EXISTS `approve_leave_list_done`;
CREATE TABLE `approve_leave_list_done`  (
  `approve_id` int(255) NOT NULL AUTO_INCREMENT,
  `applicate_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staff_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `leave_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `end_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staff_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applicate_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`approve_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of approve_leave_list_done
-- ----------------------------
INSERT INTO `approve_leave_list_done` VALUES (1, 'EW-2020-08-29-1', '102', '', '2020-08-31 17:25', '2020-08-31 23:04', '项目赶进度', '张晓彤', '2020-08-29 23:44:41', '已同意');
INSERT INTO `approve_leave_list_done` VALUES (2, 'QJ-2020-08-29-1', '102', '病假', '2020-08-30 13:05', '2020-08-31 15:33', '感冒了，想在家休息1天', '张晓彤', '2020-08-29 23:53:04', '已同意');

-- ----------------------------
-- Table structure for news_items
-- ----------------------------
DROP TABLE IF EXISTS `news_items`;
CREATE TABLE `news_items`  (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`news_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of news_items
-- ----------------------------
INSERT INTO `news_items` VALUES (1, '培训公告', '下周星期三新人培训，下午3点不要迟到', '2020-08-29 19:23:27');
INSERT INTO `news_items` VALUES (2, 'HR公告', '关于新人录用人员的信息请到人事部查看', '2020-08-30 15:40:50');

-- ----------------------------
-- Table structure for schedule_items
-- ----------------------------
DROP TABLE IF EXISTS `schedule_items`;
CREATE TABLE `schedule_items`  (
  `schedule_id` int(11) NOT NULL AUTO_INCREMENT,
  `is_done` int(255) NULL DEFAULT NULL,
  `done_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `text` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`schedule_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of schedule_items
-- ----------------------------
INSERT INTO `schedule_items` VALUES (1, 0, '15:25', '9月10日和张总会面');
INSERT INTO `schedule_items` VALUES (2, 0, '15:21', '9月关于公司奖励制度的完善');

-- ----------------------------
-- Table structure for staff_lists
-- ----------------------------
DROP TABLE IF EXISTS `staff_lists`;
CREATE TABLE `staff_lists`  (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staff_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staff_part` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `entry_date` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `card_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `card_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `work_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`staff_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of staff_lists
-- ----------------------------
INSERT INTO `staff_lists` VALUES (1, '102', '张晓彤', '开发部', '2020-08-29 23:13:09', '居民身份证', '513010200312110342', '15308934234', '在职');
INSERT INTO `staff_lists` VALUES (2, '101', '汪大神', '开发部', '2020-08-29 00:02:16', '居民身份证', '513030199811202034', '13985081123', '在职');

-- ----------------------------
-- Table structure for staff_login
-- ----------------------------
DROP TABLE IF EXISTS `staff_login`;
CREATE TABLE `staff_login`  (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_num` int(11) NULL DEFAULT NULL,
  `staff_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `permis_mark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `created_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`staff_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of staff_login
-- ----------------------------
INSERT INTO `staff_login` VALUES (1, 101, '汪大神', '管理员', 'admin', '123456', '2020-08-20 11:12:23');
INSERT INTO `staff_login` VALUES (2, 102, '张晓彤', '普通用户', 'common', '123456', '2020-08-11 12:11:15');

SET FOREIGN_KEY_CHECKS = 1;
