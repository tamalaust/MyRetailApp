/*
SQLyog Community v12.16 (64 bit)
MySQL - 5.6.24 : Database - myretailapp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`myretailapp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `myretailapp`;

/*Table structure for table `product_price` */

DROP TABLE IF EXISTS `product_price`;

CREATE TABLE `product_price` (
  `product_price_cat_id` int(11) NOT NULL,
  `pc_unit_price` decimal(10,2) NOT NULL,
  PRIMARY KEY (`product_price_cat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `product_price` */

insert  into `product_price`(`product_price_cat_id`,`pc_unit_price`) values 
(5543,'14.55'),
(5555,'200.00'),
(7563,'150.00');

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prod_sku` varchar(200) NOT NULL,
  `prod_name` varchar(200) NOT NULL,
  `prod_category` varchar(80) DEFAULT NULL,
  `updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `prod_price_cat_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `prod_price_cat_id_idx` (`prod_price_cat_id`),
  CONSTRAINT `prod_price_cat_id` FOREIGN KEY (`prod_price_cat_id`) REFERENCES `product_price` (`product_price_cat_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `products` */

insert  into `products`(`id`,`prod_sku`,`prod_name`,`prod_category`,`updated_date`,`prod_price_cat_id`) values 
(1,'AEX143','Stroller','baby','2015-11-19 21:27:11',5555),
(2,'AEX143','Stroller','baby','2015-11-19 21:27:11',5543),
(3,'AEX143','Stroller','baby','2015-11-19 21:27:11',7563);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
