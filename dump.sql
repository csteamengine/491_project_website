-- MySQL dump 10.13  Distrib 5.7.17, for osx10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: sensorweb
-- ------------------------------------------------------
-- Server version	5.7.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `home_node`
--

DROP TABLE IF EXISTS `home_node`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `home_node` (
  `home_node_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `is_active` bit(1) DEFAULT b'1',
  `created` datetime DEFAULT CURRENT_TIMESTAMP,
  `location` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`home_node_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `home_node`
--

LOCK TABLES `home_node` WRITE;
/*!40000 ALTER TABLE `home_node` DISABLE KEYS */;
/*!40000 ALTER TABLE `home_node` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leaf_node`
--

DROP TABLE IF EXISTS `leaf_node`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leaf_node` (
  `leaf_node_id` int(11) NOT NULL AUTO_INCREMENT,
  `home_node_id` int(11) NOT NULL,
  `created` datetime DEFAULT CURRENT_TIMESTAMP,
  `is_active` bit(1) DEFAULT b'1',
  PRIMARY KEY (`leaf_node_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leaf_node`
--

LOCK TABLES `leaf_node` WRITE;
/*!40000 ALTER TABLE `leaf_node` DISABLE KEYS */;
/*!40000 ALTER TABLE `leaf_node` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sensor_readings`
--

DROP TABLE IF EXISTS `sensor_readings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sensor_readings` (
  `sensor_readings_id` int(11) NOT NULL AUTO_INCREMENT,
  `leaf_node_id` int(11) NOT NULL,
  `home_node_id` int(11) NOT NULL,
  `reading_value` double DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL COMMENT 'Like the GPS coordinates of the home node\n',
  PRIMARY KEY (`sensor_readings_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sensor_readings`
--

LOCK TABLES `sensor_readings` WRITE;
/*!40000 ALTER TABLE `sensor_readings` DISABLE KEYS */;
/*!40000 ALTER TABLE `sensor_readings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `is_active` bit(1) DEFAULT b'1',
  `date_created` datetime DEFAULT CURRENT_TIMESTAMP,
  `username` varchar(25) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `first` varchar(50) DEFAULT NULL,
  `last` varchar(50) DEFAULT NULL,
  `address_line_1` varchar(250) DEFAULT NULL,
  `address_line_2` varchar(250) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `zip_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-04 22:36:09
