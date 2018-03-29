/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : lms

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-04-10 13:23:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for lms_book
-- ----------------------------
DROP TABLE IF EXISTS `lms_book`;
CREATE TABLE `lms_book` (
  `book_id` char(36) NOT NULL,
  `book_name` varchar(20) NOT NULL,
  `book_style` varchar(20) NOT NULL,
  `book_author` varchar(20) NOT NULL,
  `book_pub` varchar(20) NOT NULL COMMENT '出版社',
  `book_in_time` datetime NOT NULL,
  `status` char(10) NOT NULL,
  `book_comment` text,
  `img_path` varchar(50) DEFAULT NULL,
  `book_hot` int(11) DEFAULT '0',
  `book_rem` varchar(1) NOT NULL DEFAULT 'N' COMMENT '是否推荐',
  `price` decimal(5,2) NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lms_book
-- ----------------------------
INSERT INTO `lms_book` VALUES ('0d056989-09b1-4921-816f-c62f259f3e05', '掌控', '小说', '阿兰·拉金教授', '华夏', '2017-04-29 12:50:17', '借出', '《如何掌控自己的时间和生活》告诫人们，一定要记住，这个世界上根本不存在“没时间”这回事。如果你跟很多人一样，也是因为“太忙”而没时间完成自己的工作的话，那请你一定记住，在这个世界上还有很多人，他们比你更忙，结果却完成了更多的工作。这些人并没有比你拥有更多的时间。他们只是学会了更好地利用自己的时间而已！有效地利用时间是一种人人都可以掌握的技巧，就像驾驶一样，有效利用时间，不是成为时间的奴隶，而是实现自己的人生目标。切完全取决于是否能够成功管理自己的时间，这就是所有成功的秘诀所在。', 'images/bookCover/4.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('181176db-8822-44e2-87fe-9a2cd996ef1a', '追风筝的人', '文学', '卡勒德', '京东', '2017-04-21 12:50:45', '借出', '《追风筝的人》内容简介：“许多年过去了，人们说陈年旧事可以被埋葬，然而我终于明白这是错的，因为往事会自行爬上来。回首前尘，我意识到在过去二十六年里，自己始终在窥视着那荒芜的小径。”\n12岁的阿富汗富家少爷阿米尔与仆人哈桑情同手足。然而，在一场风筝比赛后，发生了一件悲惨不堪的事，阿米尔为自己的懦弱感到自责和痛苦，逼走了哈桑，不久，自己也跟随父亲逃往美国。\n成年后的阿米尔始终无法原谅自己当年对哈桑的背叛。为了赎罪，阿米尔再度踏上暌违二十多年的故乡，希望能为不幸的好友尽最后一点心力，却发现一个惊天谎言，儿时的噩梦再度重演，阿米尔该如何抉择？\n小说如此残忍而又美丽，作者以温暖细腻的笔法勾勒人性的本质与救赎，读来令人荡气回肠。', 'images/bookCover/10.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('2a2ea04b-c3ef-4778-9e93-997b2e7ca8ad', '盛世皇后', '小说', '白鹭成双', '华夏', '2016-12-20 12:50:22', '借出', '第一次给皇帝这样自我介绍的时候，她从他的脸上看见了天下最好看的笑容。\n可惜的是，这死面瘫一辈子也就只笑了这么一次。\n看电视剧的时候花春迷上了里头的一位丞相，觉得他长得帅又霸气。但是穿越进电视剧后她才知道，这丞相是个女的，而且和皇帝水火不相容。\n花春，一个二十多岁青春美少女，机缘巧合之下，莫名其妙地就穿上了男装，站在那少年皇帝身边，成了一个刚正不阿的忠臣。\n有刺客，她替他挡，有人造反，她替他压。但是不知道为什么，这皇帝还是想方设法地要弄死她。', 'images/bookCover/5.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('3824bf27-a776-45b8-a9a1-fbf5895e41b9', '人类简史', '小说', '尤瓦尔·赫拉利', '华夏', '2017-04-25 12:50:09', '借出', '十万年前，地球上至少有六种不同的人\n但今日，世界舞台为什么只剩下了我们自己？\n从只能啃食虎狼吃剩的残骨的猿人，到跃居食物链顶端的智人，\n从雪维洞穴壁上的原始人手印，到阿姆斯壮踩上月球的脚印，\n从认知革命、农业革命，到科学革命、生物科技革命，\n我们如何登上世界舞台成为万物之灵的？\n从公元前1776年的《汉摩拉比法典》，到1776年的美国独立宣言，\n从帝国主义、资本主义，到自由主义、消费主义，\n从兽欲，到物欲，从兽性、人性，到神性，\n我们了解自己吗？我们过得更快乐吗？\n我们究竟希望自己得到什么、变成什么？', 'images/bookCover/2.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('3ac1a844-76b3-4d13-bd6b-aff031ddffff', '自在独行', '小说', '贾凹平', '华夏', '2017-03-02 00:00:00', '借出', '《自在独行》内容简介：平凹先生素来喜静，最怕有人来敲他的房门。让他觉得自在的，要么就是行走于西北的大地，要么就是隐居在自己的书房。\n先生其实也喜欢热闹，只是先生的热闹并不是灯火灿烂，而是内心的安宁与独行的自在。\n这本书写情感、聊爱好、谈社会、说人生。有俗世的智慧，也有生活的趣味。\n对于匆匆的路人，平凹先生这部文集只是用来附庸风雅的玩物。但这本书却要写给生命的行者。愿他们能懂得孤独的真义，在生活里多一些从容潇洒。', 'images/bookCover/11.jpg', '0', 'Y', '33.00');
INSERT INTO `lms_book` VALUES ('699b9175-1c17-4c93-b9a1-c4b7aacfe189', '我们三', '小说', '杨绛', '华夏', '2017-04-05 12:49:59', '借出', '我们仨》讲述了九十二岁的杨绛以简洁而沉重的语言，回忆先她而去的女儿钱媛、丈夫钱钟书，回忆一家三口那些快乐而艰难、爱与痛的日子。这个三口之家的动人故事证明：家庭是人生很好的庇护所。', 'images/bookCover/6.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('97aace9e-563d-44ff-a3ad-03c751201c4a', '时间简史', '小说', '史蒂芬·霍金', '华夏', '2017-04-10 12:50:03', '借出', '《时间简史》讲述是探索时间和空间核心秘密的故事，是关于宇宙本性的最前沿知识，包括我们的宇宙图像、空间和时间、膨胀的宇宙不确定性原理、基本粒子和自然的力、黑洞、黑洞不是这么黑、时间箭头等内容。第一版中的许多理论预言，后来在对微观或宏观宇宙世界观测中得到证实。\n自1988年首版以来，《时间简史》已成为全球科学著作的里程碑。它被翻译成40种文字，销售了近1000万册。此版更新了内容，把许多观测揭示的新知识，以及霍金最新的研究纳入，并配以250幅照片和电脑制作的三维和四维空间图。', 'images/bookCover/1.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('b4243d4f-bef7-4ac1-bf0b-490420b6cbd2', '超禁忌游戏', '纪实', '宁航一', '京东', '2017-04-07 12:50:42', '借出', '《超禁忌游戏4》内容简介：神的游戏依然在继续，不管守护者联盟如何竭力阻止，13班的同学仍脱离控制般接二连三死去，绝望和死别如影随形。\n被异国重火力军队逼入绝境，守护者联盟将如何杀出重围？怀揣对家人的愧疚和思念，历经万难回到祖国的他们，却遭遇国家的警惕和质疑，然而国安部的态度却更令人捉摸不透……\n“旧神”插手联盟，抛出的却是一截不怀好意的橄榄枝，杭一是否能够从容应对？\n三巨头一手创立的异世界刷新众人对超能力的认知，“创世诸神”一时兴起，现实世界摇摇欲坠。一边是艰难的挑战和未知的危机，一边却是巨大的诱惑和永远的安宁。众人该作何抉择？\n埋藏于三巨头内部成员暗涌终于爆发，短暂喘息后，一场让所有人意想不到的浩劫在破晓时分降临。这一切背后到底还酝酿着怎样的秘密和阴谋？', 'images/bookCover/9.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('bdb63523-b271-4a71-ad59-046eab22acda', '三国演义', '小说', '罗贯中', '华夏', '2017-03-27 12:50:31', '借出', '本书以东汉末年黄巾起义为线索讲述了军阀混战三国鼎立，直至西晋统一天下的故事。全书塑造了众多生动的人物形象，以及场面宏大的战争描写，是我国古典战争中的杰出代表。本书曾被译成多国文字，广为流传。', 'images/bookCover/7.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('c65317e6-a206-4660-832a-5533a3a41238', '哈利波特', '小说', 'J.K.罗琳', '华夏', '2017-05-01 12:50:36', '未借出', '《哈利·波特与死亡圣器(纪念版)》是《纽约时报》超级畅销书，荣获《出版人周刊》绝佳图书奖、英国国家图书奖、美国图书馆协会杰出图书奖。家喻户晓的小魔法师以全新形象与大家见面啦！新版封面由美国漫画界非常具有人气的新星——木部石绘制并设计，全球读者好评如潮！', 'images/bookCover/8.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('c6e206d6-d5bc-4bc9-bb91-44c13c913e55', '钓愚', '小说', '乔治·阿克洛夫', '华夏', '2017-04-29 12:50:14', '借出', '自亚当·斯密以来，经济学的核心信条就是：自由市场制度就像一只“看不见的手”，但现在这只“看不见的手”已经变成了随时准备绊倒消费者的“看不见的脚”。\n两位诺奖得主乔治·阿克洛夫、罗伯特·席勒认为，市场在为我们带来福利的同时，也带来了灾难。普遍存在的人性弱点、信息不对称等让我们成为“钓愚”中的受骗者。\n作者历数从投行到政客，从汽车销售到房地产中介，从烟厂到酒厂，从食品厂到制药商，从信用卡到广告，无不存在“自由的欺骗”。他们以一个个生动的事例、详实的数据、幽默的阐述揭示了从日常生活到金融、政治等层面的富有想象力的钓愚手段，从另一个角度反思了金融危机爆发的内在原因：钓愚不仅让普通大众损失惨重，而且带来了前所未有的系统性风险，导致经济崩溃。', 'images/bookCover/3.jpg', '0', 'Y', '0.00');
INSERT INTO `lms_book` VALUES ('f0e7a1fc-1965-4dfd-bd3b-43b8c0f53cf9', '解忧杂货铺', '小说', '东野圭吾', '京东出版社', '2017-04-02 15:46:04', '借出', '这是一个倾吐故事和烦忧的地方，不管是你是正在追寻儿时的梦想，亦或正在相遇一次动心执着的爱情，还是已经结婚立业的社会的一份子，昼夜交替的时候或许你都会有所感慨，有所萦思，除了欢颜的日子，泪水和忧伤在我们的心里此起彼伏。希望这里能有你想要的泪水的答案，希望这里能有你所苦苦追寻的生活的路途。也许你得到的并不是生活的秘籍，但是，希望这里可以承载你跳跃奔驰的心灵。一个问题，一页烦忧，你的倾吐或许可以在此得到安慰，或许可以在此化解。 \n你可以在此分享你的烦忧，写下你的故事。 \n每个人的故事，烦忧可以由小组成员进行回答，然后通过豆邮回复，希望你能在此等待一个又一个萍水相逢的回答。', 'images/bookCover/0.jpg', '0', 'Y', '32.50');

-- ----------------------------
-- Table structure for lms_inform
-- ----------------------------
DROP TABLE IF EXISTS `lms_inform`;
CREATE TABLE `lms_inform` (
  `id` char(36) NOT NULL,
  `title` varchar(30) NOT NULL,
  `content` text NOT NULL,
  `show_time` datetime NOT NULL,
  `manager_id` char(36) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lms_inform
-- ----------------------------
INSERT INTO `lms_inform` VALUES ('0c6b43f6-ada8-4eba-a859-c7f3ad68ea10', '公告一', 'fdafdafadfad邓平', '2017-04-02 15:18:39', 'test1');
INSERT INTO `lms_inform` VALUES ('6982aa86-c306-4d24-9de0-dc650b168014', '发的发的', '沙发打发点', '2017-04-07 10:24:54', 'test1');
INSERT INTO `lms_inform` VALUES ('708258a4-1661-4df2-987a-f7da4325d510', 'gfsgf手动阀', '啊打发打发', '2017-04-07 10:24:37', 'test1');
INSERT INTO `lms_inform` VALUES ('70bb312f-25ba-4e2d-a546-ab9efd2d33fa', 'gfsgf手动阀', '啊打发打发', '2017-04-07 10:24:43', 'test1');
INSERT INTO `lms_inform` VALUES ('938b3a53-1274-458a-b6c8-804fec3e569a', '规范噶地方', '阿凡达大', '2017-04-08 23:34:12', 'test3');

-- ----------------------------
-- Table structure for lms_user
-- ----------------------------
DROP TABLE IF EXISTS `lms_user`;
CREATE TABLE `lms_user` (
  `user_code` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` char(1) NOT NULL,
  `id` char(18) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  `class_name` varchar(20) DEFAULT NULL,
  `balance` decimal(5,2) NOT NULL DEFAULT '0.00',
  `token` int(2) DEFAULT NULL,
  `found_time` datetime DEFAULT NULL,
  `last_modify_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_code`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lms_user
-- ----------------------------
INSERT INTO `lms_user` VALUES ('test1', 'ICy5YqxZB1uWSwcVLSNLcA==', '张三', '男', '510000000000000000', '', null, null, '0.00', '1', '2017-04-02 13:56:42', '2017-04-08 19:42:51');
INSERT INTO `lms_user` VALUES ('test2', 'ICy5YqxZB1uWSwcVLSNLcA==', '王五', '男', '22222222222222222x', '', null, null, '0.00', '2', '2017-04-02 14:02:06', '2017-04-08 19:42:54');
INSERT INTO `lms_user` VALUES ('test3', 'ICy5YqxZB1uWSwcVLSNLcA==', '李四', '女', '333333333333333333', '', null, null, '0.00', '3', '2017-05-04 14:03:19', '2017-04-08 19:42:56');
