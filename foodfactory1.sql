-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 28, 2020 at 01:25 PM
-- Server version: 5.7.30-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `foodfactory1`
--
CREATE DATABASE IF NOT EXISTS `foodfactory1` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `foodfactory1`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `name` varchar(20) DEFAULT NULL,
  `contact_no` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`contact_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`name`, `contact_no`, `password`) VALUES
('trapti', '9993387574', 'trapti');

-- --------------------------------------------------------

--
-- Table structure for table `customer_plan`
--

CREATE TABLE IF NOT EXISTS `customer_plan` (
  `contact_no` varchar(14) DEFAULT NULL,
  `plan` varchar(20) DEFAULT NULL,
  `planSelectDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `planDueDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `delivery` int(20) DEFAULT NULL,
  `last_delivery` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  KEY `contact_no` (`contact_no`),
  KEY `plan` (`plan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_plan`
--

INSERT INTO `customer_plan` (`contact_no`, `plan`, `planSelectDate`, `planDueDate`, `delivery`, `last_delivery`) VALUES
('7788992211', 'Premium', '2020-12-21 18:31:58', '2021-01-20 18:31:58', 30, '0000-00-00 00:00:00'),
('9876543122', 'Starter', '2020-12-28 07:41:09', '2020-12-29 07:41:09', 1, '0000-00-00 00:00:00'),
('7654321090', 'Pro', '2020-12-28 07:42:11', '2021-01-27 07:42:11', 3, '0000-00-00 00:00:00'),
('9988221133', 'Premium', '2020-12-28 07:43:29', '2021-01-27 07:43:29', 30, '0000-00-00 00:00:00'),
('9988770066', 'Starter', '2020-12-28 07:44:02', '2020-12-29 07:44:02', 1, '0000-00-00 00:00:00'),
('9341645321', 'Pro', '2020-12-28 07:45:18', '2021-01-27 07:45:18', 3, '0000-00-00 00:00:00'),
('8889997776', 'Premium', '2020-12-28 07:46:08', '2021-01-27 07:46:08', 30, '0000-00-00 00:00:00'),
('9321123456', 'Pro', '2020-12-28 07:46:43', '2021-01-27 07:46:43', 3, '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE IF NOT EXISTS `feedback` (
  `name` varchar(20) DEFAULT NULL,
  `contact_no` varchar(20) DEFAULT NULL,
  `msg` varchar(200) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  KEY `contact_no` (`contact_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`name`, `contact_no`, `msg`, `image`) VALUES
('ajay', '9321123456', 'Omnifood is just awesome! I just launched a startup which leaves me with no time for cooking, so Omnifood is a life-saver. Now that I got used to it, I couldn''t live without my daily meals!', 'customer-1.jpg'),
('sarika', '8769543212', 'Inexpensive, healthy and great-tasting meals, delivered right to my home. We have lots of food delivery here in Lisbon, but no one comes even close to Omifood. Me and my family are so in love!', 'customer-2.jpg'),
('pallavi', '9988221133', 'I was looking for a quick and easy food delivery service in San Franciso. I tried a lot of them and ended up with Omnifood. Best food delivery service in the Bay Area. Keep up the great work!\r\n', 'customer-3.jpg'),
('jay', '7788992211', 'Inexpensive, healthy and great-tasting meals, delivered right to my home. Omnifood is just awesome! ', 'i4.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `meal`
--

CREATE TABLE IF NOT EXISTS `meal` (
  `category` varchar(30) NOT NULL,
  `price` varchar(10) DEFAULT NULL,
  `validity` varchar(20) DEFAULT NULL,
  `inter` varchar(20) DEFAULT NULL,
  `orderTiming` varchar(30) DEFAULT NULL,
  `accessNew` varchar(30) DEFAULT NULL,
  `freeDelivery` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `meal`
--

INSERT INTO `meal` (`category`, `price`, `validity`, `inter`, `orderTiming`, `accessNew`, `freeDelivery`) VALUES
('Premium', '399', '/month', '30 ', 'Order 24/7', 'Access to newest creation   ', 'Free delivery'),
('Pro', '149', '/month', '3', 'Order 24/7', 'Access to newest creation  ', 'Free delivery'),
('Starter', '19', '/meal', '1', 'Order from 8 am to 12 pm', 'No access to newest creation  ', 'Free delivery');

-- --------------------------------------------------------

--
-- Table structure for table `newsletter`
--

CREATE TABLE IF NOT EXISTS `newsletter` (
  `name` varchar(25) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `how_find` varchar(20) DEFAULT NULL,
  `newsletter` varchar(10) DEFAULT NULL,
  `drop_line` varchar(30) DEFAULT NULL,
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `newsletter`
--

INSERT INTO `newsletter` (`name`, `email`, `how_find`, `newsletter`, `drop_line`) VALUES
('trapti', 't@gmail.com', 'friends', 'false', 'edfgh');

-- --------------------------------------------------------

--
-- Table structure for table `todaym`
--

CREATE TABLE IF NOT EXISTS `todaym` (
  `image` varchar(200) DEFAULT NULL,
  `item1` varchar(20) DEFAULT NULL,
  `item2` varchar(20) DEFAULT NULL,
  `item3` varchar(20) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `todaym`
--

INSERT INTO `todaym` (`image`, `item1`, `item2`, `item3`, `id`) VALUES
('food.jpg', 'Malai kofte', 'Aaloo paratha', 'Ice cream', 8);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `name` varchar(25) NOT NULL,
  `contact_no` varchar(20) NOT NULL,
  `email_id` varchar(25) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL,
  `latitude` float NOT NULL,
  `longtitude` float NOT NULL,
  `request_status` tinyint(1) DEFAULT NULL,
  `payment_status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`contact_no`),
  UNIQUE KEY `email_id` (`email_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `contact_no`, `email_id`, `password`, `latitude`, `longtitude`, `request_status`, `payment_status`) VALUES
('jaypal', '7654321090', 'jaypal@gmail.com', '234567', 22.7444, 75.8792, 1, 0),
('shana', '7700221188', 'shana@gmail.com', 'shana12', 27.3866, 80.1287, 0, 0),
('rajat', '7722113311', 'rajat@gmail.com', 'rajat12', 22.7589, 75.8914, 0, 0),
('jay', '7788992211', 'jay@gmail.com', '555555', 22.757, 75.8672, 1, 1),
('jagrati', '7869762420', 'jagrati@gmail.com', 'jagrati12', 22.7, 75.8372, 0, 0),
('himanshu', '8112233445', 'himanshu@gmail.com', 'himanshu12', 22.731, 75.8638, 1, 0),
('sarika', '8769543212', 'sarika@gmail.com', '999999', 22.7314, 75.8678, 0, 0),
('shubh', '8888999977', 'shubh@gmail.com', 'subh12', 22.7318, 75.8846, 0, 0),
('shimpi', '8889997776', 'shimpi@gmail.com', 'shimpi12', 22.7277, 75.8858, 1, 1),
('ajay', '9321123456', 'ajay@gmail.com', 'ajay12', 22.7637, 75.8959, 1, 1),
('sashi', '9341645321', 'shashi@gmail.com', '000000', 22.7713, 75.8917, 1, 0),
('trisha', '9876543122', 'traptitrisha@gmail.com', 'trapti', 22.7674, 75.8927, 1, 1),
('sakshi', '9876543219', 'sakshi@gmail.com', 'sakshi12', 22.7562, 75.8882, 0, 0),
('hiteshi', '9876678999', 'hiteshi@gmail.com', 'hiteshi12', 22.754, 75.9041, 0, 0),
('aanand', '9911882277', 'aanand@gmail.com', 'aanand12', 22.7115, 75.883, 0, 0),
('pallavi', '9988221133', 'pallavi@gmail.com', 'pallavi12', 22.7456, 75.8695, 1, 0),
('shubham', '9988770066', 'shubham@gmail.com', 'shubham12', 22.7185, 75.8554, 1, 1),
('jay', '9993298498', 'sanjay@gmail.com', 'jay', 22.9734, 78.6569, 1, 0),
('trapti', '9993387574', 'traptisharma992@gmail.com', 'trapti', 22.7732, 22.7732, 0, 0);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer_plan`
--
ALTER TABLE `customer_plan`
  ADD CONSTRAINT `customer_plan_ibfk_1` FOREIGN KEY (`contact_no`) REFERENCES `user` (`contact_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `customer_plan_ibfk_2` FOREIGN KEY (`plan`) REFERENCES `meal` (`category`);

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`contact_no`) REFERENCES `user` (`contact_no`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
