/*
SQLyog Trial v10.2 
MySQL - 8.0.19 : Database - leetcode
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`leetcode` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `leetcode`;

/*Table structure for table `exampleinfo` */

DROP TABLE IF EXISTS `exampleinfo`;

CREATE TABLE `exampleinfo` (
  `exampleId` int NOT NULL COMMENT '示例id',
  `exampleInput` varchar(100) DEFAULT NULL COMMENT '输入',
  `exampleOutput` varchar(100) DEFAULT NULL COMMENT '输出',
  `exampleExplain` varchar(100) DEFAULT NULL COMMENT '解释',
  `exampleImage` varchar(200) DEFAULT NULL COMMENT '示例图片',
  `problemId` int DEFAULT NULL COMMENT '题目id',
  PRIMARY KEY (`exampleId`),
  KEY `problemId` (`problemId`),
  CONSTRAINT `exampleinfo_ibfk_1` FOREIGN KEY (`problemId`) REFERENCES `problem` (`problemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `exampleinfo` */

/*Table structure for table `label` */

DROP TABLE IF EXISTS `label`;

CREATE TABLE `label` (
  `labelId` int NOT NULL AUTO_INCREMENT COMMENT '标签id',
  `labelName` varchar(20) DEFAULT NULL COMMENT '标签名',
  PRIMARY KEY (`labelId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `label` */

insert  into `label`(`labelId`,`labelName`) values (1,'数组'),(2,'链表'),(3,'树');

/*Table structure for table `labelproblem` */

DROP TABLE IF EXISTS `labelproblem`;

CREATE TABLE `labelproblem` (
  `labelId` int NOT NULL COMMENT '标签id',
  `problemId` int NOT NULL COMMENT '题目id',
  PRIMARY KEY (`labelId`,`problemId`),
  KEY `problemId` (`problemId`),
  CONSTRAINT `labelproblem_ibfk_1` FOREIGN KEY (`labelId`) REFERENCES `label` (`labelId`),
  CONSTRAINT `labelproblem_ibfk_2` FOREIGN KEY (`problemId`) REFERENCES `problem` (`problemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `labelproblem` */

/*Table structure for table `labelsolution` */

DROP TABLE IF EXISTS `labelsolution`;

CREATE TABLE `labelsolution` (
  `labelId` int NOT NULL COMMENT '标签id',
  `solutionId` int NOT NULL COMMENT '题解id',
  PRIMARY KEY (`labelId`,`solutionId`),
  KEY `solutionId` (`solutionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `labelsolution` */

insert  into `labelsolution`(`labelId`,`solutionId`) values (1,1),(2,1),(3,1),(2,2),(3,3),(1,4),(2,4),(3,4),(1,5),(2,5),(3,5),(1,7),(2,7);

/*Table structure for table `problem` */

DROP TABLE IF EXISTS `problem`;

CREATE TABLE `problem` (
  `problemId` int NOT NULL AUTO_INCREMENT COMMENT '题目编号',
  `problemName` varchar(20) DEFAULT NULL COMMENT '题目名称',
  `solutionNumber` int DEFAULT NULL COMMENT '题解数量',
  `passRate` float DEFAULT NULL COMMENT '通过率',
  `difficulty` int DEFAULT NULL COMMENT '难度(1简单、2普通、3困难)',
  `occurrenceRate` float DEFAULT NULL COMMENT '出现率',
  PRIMARY KEY (`problemId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `problem` */

insert  into `problem`(`problemId`,`problemName`,`solutionNumber`,`passRate`,`difficulty`,`occurrenceRate`) values (1,'1',1,1,1,1);

/*Table structure for table `problemcomment` */

DROP TABLE IF EXISTS `problemcomment`;

CREATE TABLE `problemcomment` (
  `commentId` int NOT NULL AUTO_INCREMENT COMMENT '题目评论id',
  `problemId` int DEFAULT NULL COMMENT '评论对应的题目的id',
  `commentContent` text COMMENT '评论内容',
  `userId` int DEFAULT NULL COMMENT '发出评论的用户id',
  `parentId` int DEFAULT NULL COMMENT '指向的父评论id',
  `commentDatetime` datetime DEFAULT NULL COMMENT '评论的日期时间',
  `commentLikeNumber` int DEFAULT '0' COMMENT '评论点赞数',
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `problemcomment` */

/*Table structure for table `problemcommentlike` */

DROP TABLE IF EXISTS `problemcommentlike`;

CREATE TABLE `problemcommentlike` (
  `commentId` int NOT NULL,
  `userId` int NOT NULL,
  PRIMARY KEY (`commentId`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `problemcommentlike` */

/*Table structure for table `problemdesc` */

DROP TABLE IF EXISTS `problemdesc`;

CREATE TABLE `problemdesc` (
  `problemId` int DEFAULT NULL COMMENT '题目id',
  `problemLikeNumber` int DEFAULT NULL COMMENT '点赞数',
  `problemContent` text COMMENT '题目内容',
  `tipsInfo` text COMMENT '提示信息',
  `passNumber` int DEFAULT NULL COMMENT '通过次数',
  `submitNumber` int DEFAULT NULL COMMENT '提交次数',
  KEY `problemId` (`problemId`),
  CONSTRAINT `problemdesc_ibfk_1` FOREIGN KEY (`problemId`) REFERENCES `problem` (`problemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `problemdesc` */

/*Table structure for table `problemlike` */

DROP TABLE IF EXISTS `problemlike`;

CREATE TABLE `problemlike` (
  `problemId` int NOT NULL,
  `userId` int NOT NULL,
  PRIMARY KEY (`problemId`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `problemlike` */

/*Table structure for table `solution` */

DROP TABLE IF EXISTS `solution`;

CREATE TABLE `solution` (
  `solutionId` int NOT NULL AUTO_INCREMENT COMMENT '题解id',
  `userId` int NOT NULL COMMENT '用户id',
  `problemId` int NOT NULL COMMENT '题目id',
  `solutionText` text COMMENT '题解文字部分',
  `solutionDatetime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `visitedNumber` int DEFAULT '0' COMMENT '观看次数',
  `isOfficial` tinyint(1) DEFAULT '0' COMMENT '是否为官方题解',
  `solutionLikeNumber` int DEFAULT '0' COMMENT '题解点赞数量',
  `solutionCommentNumber` int DEFAULT '0' COMMENT '题解评论数量',
  `solutionName` varchar(20) DEFAULT NULL COMMENT '题解名称',
  PRIMARY KEY (`solutionId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `solution` */

insert  into `solution`(`solutionId`,`userId`,`problemId`,`solutionText`,`solutionDatetime`,`visitedNumber`,`isOfficial`,`solutionLikeNumber`,`solutionCommentNumber`,`solutionName`) values (1,1,1,'迭代\r\n假设链表为 1 \\rightarrow 2 \\rightarrow 3 \\rightarrow \\varnothing1→2→3→∅，我们想要把它改成 \\varnothing \\leftarrow 1 \\leftarrow 2 \\leftarrow 3∅←1←2←3。\r\n\r\n在遍历链表时，将当前节点的 \\textit{next}next 指针改为指向前一个节点。由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。在更改引用之前，还需要存储后一个节点。最后返回新的头引用。\r\n','2021-02-18 21:13:59',3,0,1,1,'官方题解'),(2,2,1,'123111111111111111111111111111111111111111111111111111111111111111111','2021-02-24 11:19:16',5,0,2,4,'自己瞎编的'),(3,3,2,'我是222222222222','2021-02-12 11:20:36',0,0,3,345,'自己瞎编的2'),(4,1,1,'数据卡就得啦时间久了就```hello world```','2021-02-24 20:27:04',0,0,0,0,'lzh瞎编的哈哈哈'),(5,1,1,'数据卡就得啦时间久了就```hello world```','2021-02-25 09:50:29',0,0,0,0,'lzh瞎编的哈哈哈'),(6,4,1,'```hello world```噼噼啪啪铺铺铺铺铺铺铺','2021-02-25 11:37:08',0,0,0,0,'少时诵诗书所所所'),(7,4,1,'```hello world```噼噼啪啪铺铺铺铺铺铺铺','2021-02-25 11:37:49',0,0,0,0,'少时诵诗书所所所');

/*Table structure for table `solutioncomment` */

DROP TABLE IF EXISTS `solutioncomment`;

CREATE TABLE `solutioncomment` (
  `commentId` int NOT NULL AUTO_INCREMENT COMMENT '题解评论id',
  `solutionId` int DEFAULT NULL COMMENT '题解id',
  `commentContent` text COMMENT '评论内容',
  `userId` int DEFAULT NULL COMMENT '发出评论的用户id',
  `parentId` int DEFAULT NULL COMMENT '指向的父评论id',
  `commentDatetime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '评论的日期时间',
  `commentLikeNumber` int DEFAULT '0' COMMENT '评论点赞数',
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `solutioncomment` */

insert  into `solutioncomment`(`commentId`,`solutionId`,`commentContent`,`userId`,`parentId`,`commentDatetime`,`commentLikeNumber`) values (1,1,'自己瞎编的1',1,NULL,'2021-02-24 12:14:23',1),(2,1,'自己瞎编的2',2,1,'2021-02-18 12:22:37',2),(3,1,'自己瞎编的3',3,1,'2021-02-04 12:22:41',3),(4,1,'自己瞎编的4',2,3,'2021-02-04 12:31:40',4),(5,1,'1234567890',1,NULL,'2021-02-17 20:35:31',0),(6,1,'这是我的评论',1,NULL,'2021-02-24 20:55:09',0),(7,1,'这是我的评论',1,2,'2021-02-24 20:55:33',0),(8,1,'这是我的评论',1,2,'2021-02-25 09:53:10',0),(9,1,'这是我的评论',1,2,'2021-02-25 09:59:25',0),(10,2,'这是题解2的评论',2,NULL,'2021-02-25 10:48:59',0),(11,3,'这是对题解3的评论',3,NULL,'2021-02-25 11:13:59',0),(12,3,'这是对题解3下面的评论11的评论',1,11,'2021-02-25 11:15:33',0),(13,3,'这是对题解3下面的评论12的评论',1,12,'2021-02-25 11:15:58',0);

/*Table structure for table `solutioncommentlike` */

DROP TABLE IF EXISTS `solutioncommentlike`;

CREATE TABLE `solutioncommentlike` (
  `commentId` int NOT NULL,
  `userId` int NOT NULL,
  PRIMARY KEY (`commentId`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `solutioncommentlike` */

/*Table structure for table `solutionimage` */

DROP TABLE IF EXISTS `solutionimage`;

CREATE TABLE `solutionimage` (
  `solutionImageId` int NOT NULL COMMENT '题解图片id',
  `solutionImageUrl` varchar(200) DEFAULT NULL COMMENT '题解图片的url',
  `solutionId` int DEFAULT NULL COMMENT '题解id',
  PRIMARY KEY (`solutionImageId`),
  KEY `solutionId` (`solutionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `solutionimage` */

/*Table structure for table `solutionlike` */

DROP TABLE IF EXISTS `solutionlike`;

CREATE TABLE `solutionlike` (
  `solutionId` int NOT NULL,
  `userId` int NOT NULL,
  PRIMARY KEY (`solutionId`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `solutionlike` */

/*Table structure for table `submitrecord` */

DROP TABLE IF EXISTS `submitrecord`;

CREATE TABLE `submitrecord` (
  `userId` int NOT NULL COMMENT '用户编号',
  `problemId` int NOT NULL COMMENT '题目编号',
  `submitDateTime` datetime NOT NULL COMMENT '提交时间',
  `submitResult` int DEFAULT NULL COMMENT '运行结果(编译出错0、运行出错1、运行成功2)',
  `runResult` varchar(200) DEFAULT NULL COMMENT '编译器提供信息',
  `language` varchar(10) DEFAULT NULL COMMENT '语言',
  PRIMARY KEY (`userId`,`problemId`,`submitDateTime`),
  KEY `problemId` (`problemId`),
  CONSTRAINT `submitrecord_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`),
  CONSTRAINT `submitrecord_ibfk_2` FOREIGN KEY (`problemId`) REFERENCES `problem` (`problemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `submitrecord` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `phone` varchar(15) DEFAULT NULL COMMENT '手机号',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `image` varchar(100) DEFAULT NULL COMMENT '用户头像(在磁盘上存储的地址)',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userId`,`username`,`password`,`phone`,`email`,`image`) values (1,'1','1','1','1','www.baidu.com'),(2,'2','2','2','2','www.abc.com'),(3,'3','3','3','3','www.123.com'),(4,'lzh','Cqupt','15213130125','1138423425@qq.coom','www.jaychou.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
