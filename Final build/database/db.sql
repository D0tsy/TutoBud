CREATE DATABASE  IF NOT EXISTS `tutobud` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tutobud`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: tutobud
-- ------------------------------------------------------
-- Server version	8.0.38

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
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservation` (
  `ID` varchar(45) NOT NULL,
  `TutorName` varchar(45) NOT NULL,
  `Subject` varchar(45) NOT NULL,
  `Slot` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES ('12452','cerap','maths','2024-07-10','12:00 - 13:00'),('12456','jiman','maths','2024-07-10','12:00 - 13:00'),('','Adib','maths','2024-07-18','12:00 - 13:00'),('4567','cerap','bio chem','2024-07-13','12:00 - 13:00');
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_record`
--

DROP TABLE IF EXISTS `student_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_record` (
  `id` int NOT NULL,
  `First Name` mediumtext NOT NULL,
  `Last Name` mediumtext NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Phone Number` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_record`
--

LOCK TABLES `student_record` WRITE;
/*!40000 ALTER TABLE `student_record` DISABLE KEYS */;
INSERT INTO `student_record` VALUES (12452,'Aiman','Siddiqq','aimansid@gmail.com',2756791),(13415,'trstr','gfssf','tgsgs@hgdh.com',57385385),(789,'Jummat','Khmis','Kumat@yahoo.com',156787453),(3456,'Naziman','Budiman','mnaziman@gmail.com',168998739);
/*!40000 ALTER TABLE `student_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutor_record`
--

DROP TABLE IF EXISTS `tutor_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tutor_record` (
  `TutorID` int NOT NULL,
  `TFirstName` mediumtext NOT NULL,
  `TLastName` mediumtext NOT NULL,
  `TPhoneNumber` int NOT NULL,
  `TEmail` varchar(45) NOT NULL,
  `TSubject` mediumtext NOT NULL,
  `Slot` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutor_record`
--

LOCK TABLES `tutor_record` WRITE;
/*!40000 ALTER TABLE `tutor_record` DISABLE KEYS */;
INSERT INTO `tutor_record` VALUES (1663413,'cerap','arcad',18461889,'cerap@gmail.com ','bio chem','0'),(18714568,'Adib','Wan',12895731,'wanadib@gmail.com','Petroleum ','0'),(24000127,'jiman','budi',2837462,'mnaiman@gmai;.com','maths','12:00 - 13:00');
/*!40000 ALTER TABLE `tutor_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `idusers` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idusers`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin'),(7,'riz','pass');
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

-- Dump completed on 2024-07-24 19:13:01
