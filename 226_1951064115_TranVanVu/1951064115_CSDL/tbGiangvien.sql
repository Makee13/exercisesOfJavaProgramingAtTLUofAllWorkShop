-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 27, 2021 at 06:53 AM
-- Server version: 5.5.59-log
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dlgv`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbGiangvien`
--

CREATE TABLE `tbgiangvien` (
  `MaDD` varchar(50) NOT NULL,
  `Hoten` varchar(50) NOT NULL,
  `GT` tinyint(1) NOT NULL,
  `Donvi` varchar(50) NOT NULL,
  `Soct` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbGiangvien`
--

INSERT INTO `tbGiangvien` (`MaDD`, `Hoten`, `GT`, `Donvi`, `Soct`) VALUES
('123', 'abcd', 1, '43143214', 14324),
('1234', 'abcd', 0, '43143214', 14324),
('543', 'cdef', 1, '1', 124);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbGiangvien`
--
ALTER TABLE `tbGiangvien`
  ADD PRIMARY KEY (`MaDD`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
