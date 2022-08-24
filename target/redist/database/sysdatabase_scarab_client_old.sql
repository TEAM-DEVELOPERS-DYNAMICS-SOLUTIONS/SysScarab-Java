-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sysdatabase_scarab
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `client_old`
--

DROP TABLE IF EXISTS `client_old`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client_old` (
  `IdLogClient` int NOT NULL AUTO_INCREMENT,
  `DateLogClient` datetime NOT NULL,
  `UserCreatorLog` varchar(45) NOT NULL,
  `IdClient` int NOT NULL,
  `ImageClient` longblob NOT NULL,
  `NameClient` varchar(64) NOT NULL,
  `LastNameClient` varchar(64) NOT NULL,
  `EmailClient` varchar(64) NOT NULL,
  `PasswordClient` varchar(40) NOT NULL,
  `AddressClient` longtext NOT NULL,
  `PhoneClient` varchar(15) NOT NULL,
  `StatusConnectionClient` set('I','D','C') NOT NULL,
  `StatusAdminClient` set('AD','EP','CL','NA') NOT NULL,
  `GenderClient` set('F','M','I') NOT NULL,
  PRIMARY KEY (`IdLogClient`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client_old`
--

LOCK TABLES `client_old` WRITE;
/*!40000 ALTER TABLE `client_old` DISABLE KEYS */;
INSERT INTO `client_old` VALUES (1,'2022-07-26 22:37:37','root@localhost',101,_binary 'vacio','Andres Ricardo','Sierra Chaguala','Sierra2000@sms.com','Admin123','Cll 128 # 15-30','3159263025','I','CL','M'),(2,'2022-07-26 22:37:52','root@localhost',107,_binary 'vacio','Evelia','Zorrilla','bufekoubreilloi-6728@yopmail.com','su2pH5u',' Carrera 10A No. 20 - 40','322633354','I','CL','F'),(3,'2022-07-27 09:02:10','root@localhost',101,_binary 'vacio','Andres Ricardo','Sierra Chaguala','Sierra2000@sms.com','1591q91w','Cll 128 # 15-30','3159263025','I','CL','M'),(4,'2022-07-27 09:02:18','root@localhost',102,_binary 'vacio','Ariel','Solano Matas','crapippuredo-3550@yopmail.com','9W2N3','Calle 10 No. 9 - 78  Centro','329529309','I','CL','M'),(5,'2022-07-27 09:02:30','root@localhost',103,_binary 'vacio','Dani','Blasco Samper','frounuhecrafre-5587@yopmail.com','HB3RQp','Carrera 56A No. 51 - 81','329229011','I','CL','M'),(6,'2022-07-27 09:03:00','root@localhost',104,_binary 'vacio','Domingo','Mármol Hoyos','yeuyoitoukapreu-3760@yopmail.com','5n58bP24','Carrera 22 No. 17-31','303699832','I','CL','M'),(7,'2022-07-27 09:03:51','root@localhost',105,_binary 'vacio','Blas Eligio','Becerra Sevillano','grajufrotreisoi-3715@yopmail.com','sWhx24K','Carrera 54 No. 68 - 80','315300937 ','I','CL','M'),(8,'2022-07-27 09:04:24','root@localhost',106,_binary 'vacio','Carlos','del Botella','broizaumoussiquo-8038@yopmail.com','duH736T','Calle 59 No. 27 - 35','305422632','I','CL','M'),(9,'2022-07-27 09:05:32','root@localhost',107,_binary 'vacio','Evelia','Zorrilla','bufekoubreilloi-6728@yopmail.com','su2pH5u','Carrera 10A No. 20 - 40','322633354','I','CL','F'),(10,'2022-07-27 09:12:24','root@localhost',108,_binary 'vacio','Rebeca Victoria','Portillo Blazquez','tenoussacreddou-3318@yopmail.com','ubYpPSr','Carrera 8 No. 20 - 59','324984559','I','CL','F'),(11,'2022-07-27 09:12:51','root@localhost',109,_binary 'vacio','Carmela','Verdú-Gelabert','cutefaciqueu-7503@yopmail.com','2D28jad','Calle 20 No. 22 - 27 piso 3','302667537','I','CL','F'),(12,'2022-07-27 09:19:01','root@localhost',110,_binary 'vacio','Domitila','Soler Doménech','paubrittupruwi-9967@yopmail.com','kwsgaEq','Carrera 8a No. 7 - 88 -94','314422507','I','CL','F');
/*!40000 ALTER TABLE `client_old` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-22 21:24:44
