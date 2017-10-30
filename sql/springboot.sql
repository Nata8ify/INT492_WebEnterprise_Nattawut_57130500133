-- phpMyAdmin SQL Dump
-- version 4.0.10.16
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 02, 2017 at 11:04 AM
-- Server version: 5.1.73
-- PHP Version: 5.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `springboot`
--

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `role_name`) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=35 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`) VALUES
(1, 'user101@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(2, 'user102@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(3, 'user103@gmail.com', 'manager'),
(4, 'user104@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(5, 'user105@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(6, 'user106@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(7, 'user107@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(8, 'user108@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(9, 'user109@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(10, 'user110@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(11, 'user111@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(12, 'user112@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(13, 'user113@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(14, 'user114@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(15, 'user115@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(16, 'user116@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(17, 'user117@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(18, 'user118@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(19, 'user119@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(20, 'user120@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(21, 'user121@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(22, 'user122@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(23, 'user123@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(24, 'user124@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(25, 'user125@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(26, 'user126@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(27, 'user127@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(28, 'user128@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(29, 'user129@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(30, 'user130@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(31, 'user131@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(32, 'user132@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(33, 'user133@gmail.com', '1d0258c2440a8d19e716292b231e3190'),
(34, 'user134@gmail.com', '1d0258c2440a8d19e716292b231e3190');

-- --------------------------------------------------------

--
-- Table structure for table `users_roles`
--

CREATE TABLE IF NOT EXISTS `users_roles` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKj6m8fwv7oqv74fcehir1a9ffy` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
(1, 1),
(1, 2),
(2, 1),
(3, 2),
(4, 1),
(5, 1),
(6, 1),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(11, 1),
(12, 1),
(13, 1),
(14, 1),
(15, 1),
(16, 1),
(17, 1),
(18, 1),
(19, 1),
(20, 1),
(21, 1),
(22, 1),
(23, 1),
(24, 1),
(25, 1),
(26, 1),
(27, 1),
(28, 1),
(29, 1),
(30, 1),
(31, 1),
(32, 1),
(33, 1),
(34, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
