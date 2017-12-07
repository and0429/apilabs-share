-- --------------------------------------------------------
-- 主机:                           rm-wz9ltdam04wdk4cgrro.mysql.rds.aliyuncs.com
-- 服务器版本:                        5.7.18-log - Source distribution
-- 服务器操作系统:                      Linux
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 share.api 结构
DROP TABLE IF EXISTS `api`;
CREATE TABLE IF NOT EXISTS `api` (
  `id_` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `img_path` varchar(100) DEFAULT NULL,
  `url_` varchar(200) DEFAULT NULL,
  `title_` varchar(100) DEFAULT NULL,
  `description_` varchar(500) DEFAULT NULL,
  `count_` int(11) DEFAULT '0',
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- 正在导出表  share.api 的数据：~8 rows (大约)
/*!40000 ALTER TABLE `api` DISABLE KEYS */;
REPLACE INTO `api` (`id_`, `img_path`, `url_`, `title_`, `description_`, `count_`) VALUES
	(1, '/img/api/angularjs.png', '/libs/angular/index.html', 'Angular JS 1.6.6', 'AngularJS[1]  诞生于2009年，由Misko Hevery 等人创建，后为Google所收购。是一款优秀的前端JS框架，已经被用于Google的多款产品当中。AngularJS有着诸多特性，最为核心的是：MVC、模块化、自动化双向数据绑定、语义化标签、依赖注入等等。', 4),
	(2, '/img/api/java.png', '/libs/java8/JavaPlatformSE8.html', 'Java 8', 'Java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点[2]  。Java可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等', 3),
	(3, '/img/api/less.png', '/libs/less.github.io-master/index.html', 'Less', 'Less 是一门 CSS 预处理语言，它扩充了 CSS 语言，增加了诸如变量、混合（mixin）、函数等功能，让 CSS 更易维护、方便制作主题、扩充。Less 可以运行在 Node 或浏览器端。', 2),
	(4, '/img/api/mybatis.png', '/libs/mybaits/mybatis-3.4.6/index.html', 'Mybatis', 'MyBatis 本是apache的一个开源项目iBatis, 2010年这个项目由apache software foundation 迁移到了google code，并且改名为MyBatis 。2013年11月迁移到Github。', 1),
	(5, '/img/api/mybatis-spring.png', '/libs/mybaits/mybatis-spring-2.0.0/index.html', 'Mybatis-Spring', 'Spring整合Mytatis项目，基本上项目中都会用到', 1),
	(6, '/img/api/spring.png', '/libs/spring/spring-framework-4.x/index.html', 'Spring', 'Spring是一个开放源代码的设计层面框架，他解决的是业务逻辑层和其他各层的松耦合问题，因此它将面向接口的编程思想贯穿整个系统应用。Spring是于2003 年兴起的一个轻量级的Java 开发框架，由Rod Johnson创建。简单来说，Spring是一个分层的JavaSE/EEfull-stack(一站式) 轻量级开源框架。', 1),
	(7, '/img/api/spring-boot.png', '/libs/spring/spring-boot-1.5.8/index.html', 'Spring Boot', 'Spring Boot是由Pivotal团队提供的全新框架，其设计目的是用来简化新Spring应用的初始搭建以及开发过程。该框架使用了特定的方式来进行配置，从而使开发人员不再需要定义样板化的配置。通过这种方式，Spring Boot致力于在蓬勃发展的快速应用开发领域(rapid application development)成为领导者。', 1),
	(8, '/img/api/underscore.png', '/libs/underscore-master/index.html', 'Underscore', 'Underscore 是一个 JavaScript 工具库，它提供了一整套函数式编程的实用功能，但是没有扩展任何 JavaScript 内置对象。', 1);
/*!40000 ALTER TABLE `api` ENABLE KEYS */;

-- 导出  表 share.book 结构
DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `id_` int(11) NOT NULL,
  `img_path` varchar(50) NOT NULL,
  `url_` varchar(50) NOT NULL,
  `extract_code` varchar(10) NOT NULL,
  `name_` varchar(50) NOT NULL,
  `author_` varchar(20) NOT NULL,
  `count_` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  share.book 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
REPLACE INTO `book` (`id_`, `img_path`, `url_`, `extract_code`, `name_`, `author_`, `count_`) VALUES
	(0, '/img/book/jsdesign.png', 'https://pan.baidu.com/s/1skEVew9', 'dqjw', 'JavaScript设计模式.pdf', 'Ross Harmes, Dustin ', 3),
	(1, '/img/book/jsquanwei.png', 'https://pan.baidu.com/s/1slA17it', 'm4wf', 'JavaScript权威指南_第六版_中文版.pdf', 'David Flanagan', 3),
	(2, '/img/book/progit.png', 'https://pan.baidu.com/s/1cfig8I', 'fn59', 'progit-zh-v2.1.1.pdf', 'Scott Chacon, Ben St', 2),
	(3, '/img/book/nodejs.png', 'https://pan.baidu.com/s/1o8OeTRG', 'exd5', 'Node.js开发指南_中文版.pdf', 'BYVoid', 2);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;

-- 导出  表 share.video 结构
DROP TABLE IF EXISTS `video`;
CREATE TABLE IF NOT EXISTS `video` (
  `id_` int(11) NOT NULL,
  `img_path` varchar(100) NOT NULL,
  `url_` varchar(100) NOT NULL,
  `title_` varchar(50) NOT NULL,
  `description_` varchar(500) NOT NULL,
  `count_` int(11) NOT NULL DEFAULT '0',
  `extract_code` varchar(10) NOT NULL,
  `mechanism_` varchar(20) NOT NULL,
  `teacher_` varchar(20) NOT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  share.video 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `video` DISABLE KEYS */;
REPLACE INTO `video` (`id_`, `img_path`, `url_`, `title_`, `description_`, `count_`, `extract_code`, `mechanism_`, `teacher_`) VALUES
	(0, '/img/video/spring.png', 'https://pan.baidu.com/s/1mibzxuo', 'Spring Framwork 4.x', '尚硅谷是一个比较新的软件教学机构，佟刚老师讲的非常详细，中包括IOC， AOP，SPEL等知识，适合初学者和进阶者。\r\n', 1, 'yn1k', '尚硅谷', '佟刚'),
	(1, '/img/video/docker.png', 'https://pan.baidu.com/s/1hsaRVpy', 'Docker', 'Docker 是一个开源的应用容器引擎，让开发者可以打包他们的应用以及依赖包到一个可移植的容器中，然后发布到任何流行的 Linux 机器上，也可以实现虚拟化。容器是完全使用沙箱机制，相互之间不会有任何接口。', 1, 'kgal', '打包', '未知'),
	(2, '/img/video/hadoop.png', 'https://pan.baidu.com/s/1hrBjlly', 'Hadoop', '大数据Hadoop, 内容包括hadoop1.x和hadoop2.x，100集全，看完之后绝对受益匪浅。', 1, '76sq', '北京尚学堂', '肖斌'),
	(3, '/img/video/juc.png', 'https://pan.baidu.com/s/1bo3RO2z', 'Java高并发编程', '北京尚学堂高级架构师课程的预习项目，马士兵老师主讲，值得一看。', 0, '4gdl', '北京尚学堂', '马士兵'),
	(4, '/img/video/maven.jpg', 'https://pan.baidu.com/s/1sl7JqG1', 'Maven', 'Maven项目对象模型(POM)，可以通过一小段描述信息来管理项目的构建，报告和文档的软件项目管理工具。', 1, 'juxg', '尚硅谷', '未知'),
	(5, '/img/video/ml.png', 'https://pan.baidu.com/s/1hsKSO7q', '机器学习', '北京尚学堂马士兵老师的机器学习，自称是世界上最通俗的机器学习教程，不信你自己看看。', 0, 'uihy', '北京尚学堂', '马士兵'),
	(6, '/img/video/spring-boot.png', 'https://pan.baidu.com/s/1hr5dSYo', 'Spring Boot', 'Spring Boot是由Pivotal团队提供的全新框架，其设计目的是用来简化新Spring应用的初始搭建以及开发过程。该框架使用了特定的方式来进行配置，从而使开发人员不再需要定义样板化的配置。通过这种方式，Spring Boot致力于在蓬勃发展的快速应用开发领域(rapid application development)成为领导者。', 1, 'brs7', '传智播客', '未知'),
	(7, '/img/video/spring-cloud.png', 'https://pan.baidu.com/s/1pKXVRhp', 'Spring Cloud', 'Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用Spring Boot的开发风格做到一键启动和部署。', 1, 'htac', '51CTO学院', '未知'),
	(8, '/img/video/ts.png', 'https://pan.baidu.com/s/1miSS7oO', 'TypeScript', 'TypeScript是一种由微软开发的自由和开源的编程语言。它是JavaScript的一个超集，而且本质上向这个语言添加了可选的静态类型和基于类的面向对象编程。', 1, 'u31d', '未知', '未知'),
	(9, '/img/video/websocket.png', 'https://pan.baidu.com/s/1qXXTPLU', 'WebSocket', 'WebSocket协议是基于TCP的一种新的网络协议。它实现了浏览器与服务器全双工(full-duplex)通信——允许服务器主动发送信息给客户端。', 1, '3rg7', '北京尚学堂', '高明鑫'),
	(10, '/img/video/yilifang.png', 'https://pan.baidu.com/s/1bpIvzGz', '宜立方商城', '传智播客的一个实战项目，主要讲解分布式系统的开发， 包括redis，dubbo，MQ，单点登陆等', 1, '099m', '传智播客', '未知');
/*!40000 ALTER TABLE `video` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
