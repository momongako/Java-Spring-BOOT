-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: webproject
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usename`
--

DROP TABLE IF EXISTS `usename`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usename` (
  `id` int NOT NULL,
  `fname` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_general_ci DEFAULT NULL,
  `country` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usename`
--

LOCK TABLES `usename` WRITE;
/*!40000 ALTER TABLE `usename` DISABLE KEYS */;
INSERT INTO `usename` VALUES (1,'Peyter','pmissington0@themeforest.net','Philippines'),(2,'Frederich','fbeckson1@wp.com','China'),(3,'Charlot','ccalderbank2@blogger.com','Ireland'),(4,'Moses','mpendlenton3@jugem.jp','Portugal'),(5,'Jamal','jviles4@reddit.com','United States'),(6,'Carissa','chalpine5@dmoz.org','Sweden'),(7,'Shannan','sspringham6@dot.gov','Indonesia'),(8,'Stanislaus','samiranda7@photobucket.com','South Africa'),(9,'Minta','mbutteris8@plala.or.jp','Saudi Arabia'),(10,'Peggie','pstobbe9@oakley.com','Russia'),(11,'Ric','rhowleya@wikimedia.org','Madagascar'),(12,'Jennee','jlawelesb@spotify.com','Indonesia'),(13,'Evey','eandriessec@skyrock.com','Greece'),(14,'Willow','wschankelborgd@shareasale.com','Indonesia'),(15,'Deane','dkere@dot.gov','Ethiopia'),(16,'Lilith','lberntf@house.gov','Indonesia'),(17,'Gilda','gmiddlemissg@printfriendly.com','Syria'),(18,'Lonna','lcrinionh@artisteer.com','Indonesia'),(19,'Emmaline','ecraythornei@fastcompany.com','Portugal'),(20,'Frederick','fvirrj@reference.com','Japan'),(21,'Conni','cstarrk@newsvine.com','Indonesia'),(22,'Grover','gfroodl@live.com','Democratic Republic of the Congo'),(23,'Truda','tjuszczykm@wunderground.com','Indonesia'),(24,'Elliott','ebearnsn@sciencedaily.com','China'),(25,'Lorene','lantonikovo@sfgate.com','Greece'),(26,'Gran','gterranp@elegantthemes.com','Sweden'),(27,'Niven','nwhallq@vinaora.com','United States'),(28,'Janeta','jguester@nyu.edu','Colombia'),(29,'Howard','hstollenbergs@ifeng.com','China'),(30,'Nealy','nbracchit@statcounter.com','Brazil'),(31,'Alvan','aroglierou@networksolutions.com','Sri Lanka'),(32,'Marti','mkempstonv@bizjournals.com','Indonesia'),(33,'Thorsten','tbertomierw@exblog.jp','Russia'),(34,'Brnaby','bskilbeckx@1688.com','Iraq'),(35,'Dominik','drojy@clickbank.net','Venezuela'),(36,'Tedra','tmenelawsz@soup.io','Bolivia'),(37,'Floria','fmacgruer10@dmoz.org','Portugal'),(38,'Robin','rkersaw11@yolasite.com','Philippines'),(39,'Goldie','gwheatley12@weebly.com','Malaysia'),(40,'Zulema','zprimrose13@delicious.com','Greece'),(41,'Ermin','edoniso14@kickstarter.com','Slovenia'),(42,'Cassi','cfiggs15@yahoo.com','China'),(43,'Chan','creith16@hostgator.com','Indonesia'),(44,'Letti','laleksic17@ebay.com','Sri Lanka'),(45,'Bjorn','borteaux18@posterous.com','Russia'),(46,'Riane','rfawckner19@alexa.com','Indonesia'),(47,'Peria','pyarker1a@theglobeandmail.com','Yemen'),(48,'Kristina','kfreiburger1b@trellian.com','Indonesia'),(49,'Lynn','lannets1c@sfgate.com','Russia'),(50,'Lyndel','llarkby1d@cafepress.com','Samoa'),(51,'Terence','tdilliway1e@dropbox.com','China'),(52,'Sybilla','ssussams1f@jalbum.net','Indonesia'),(53,'Nancey','ndzeniskevich1g@dell.com','Sudan'),(54,'Colan','cyaus1h@engadget.com','Colombia'),(55,'Jonell','jbeacom1i@spotify.com','Yemen'),(56,'Theadora','tmassow1j@fda.gov','China'),(57,'Janel','jfittall1k@ca.gov','China'),(58,'Dougie','dbaynon1l@omniture.com','Croatia'),(59,'Freedman','fblincowe1m@cdbaby.com','China'),(60,'Forrester','fkulicke1n@huffingtonpost.com','China'),(61,'Tiphanie','tjerrans1o@usgs.gov','China'),(62,'Liva','lfermin1p@cyberchimps.com','Russia'),(63,'Hartley','hbeardsworth1q@ca.gov','Russia'),(64,'Skell','sfeander1r@toplist.cz','China'),(65,'Ketti','kvivers1s@blogs.com','China'),(66,'Lucienne','lfuzzard1t@github.io','Ukraine'),(67,'Baryram','bmeindl1u@instagram.com','Democratic Republic of the Congo'),(68,'Rooney','rmixture1v@usnews.com','Philippines'),(69,'Kalina','kkenforth1w@amazon.co.uk','Philippines'),(70,'Madlin','mmixon1x@weebly.com','Estonia'),(71,'Phillip','pdobbie1y@msu.edu','Russia'),(72,'Deena','dcrumbie1z@youku.com','France'),(73,'Tiertza','tohegertie20@msn.com','Russia'),(74,'Felix','fgibbins21@desdev.cn','Indonesia'),(75,'Terrijo','thannah22@geocities.com','Poland'),(76,'Cirilo','cpeppard23@google.pl','Japan'),(77,'Brigit','bquin24@goo.ne.jp','China'),(78,'Gayelord','gpeacey25@pcworld.com','Democratic Republic of the Congo'),(79,'Byrom','bwhiteson26@vk.com','France'),(80,'Wilhelm','wdanilchev27@hp.com','France'),(81,'Ricky','rkauffman28@yellowpages.com','Ukraine'),(82,'Larina','lpainter29@digg.com','Luxembourg'),(83,'Tracey','tsephton2a@quantcast.com','Thailand'),(84,'Lek','laitkin2b@infoseek.co.jp','China'),(85,'Scarlett','sdibson2c@geocities.com','China'),(86,'Lorinda','lpagan2d@elpais.com','Thailand'),(87,'Silvana','sgiovannardi2e@youtube.com','China'),(88,'Karlee','kmalinowski2f@nytimes.com','Philippines'),(89,'Schuyler','srigler2g@senate.gov','France'),(90,'Cate','csigne2h@chron.com','Mongolia'),(91,'Stanislas','sfurmenger2i@toplist.cz','Philippines'),(92,'Estell','edrinkel2j@google.co.uk','Indonesia'),(93,'Edd','elentsch2k@multiply.com','Mexico'),(94,'Tildi','tbelchamber2l@flavors.me','Russia'),(95,'Carly','cplank2m@msu.edu','Indonesia'),(96,'Herta','hbeard2n@usgs.gov','France'),(97,'Lorri','lbielby2o@cafepress.com','Japan'),(98,'Kissee','kklaesson2p@omniture.com','Indonesia'),(99,'Haskel','hmolen2q@indiatimes.com','China'),(100,'Rafaello','rpierton2r@cloudflare.com','Saudi Arabia');
/*!40000 ALTER TABLE `usename` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-27 18:46:03
