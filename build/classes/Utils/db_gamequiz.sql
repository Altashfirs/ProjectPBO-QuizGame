-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 02, 2025 at 04:44 PM
-- Server version: 8.0.30
-- PHP Version: 8.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_gamequiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `quiz`
--

CREATE TABLE `quiz` (
  `id_quiz` int NOT NULL,
  `question` varchar(255) NOT NULL,
  `option_a` varchar(255) NOT NULL,
  `option_b` varchar(255) NOT NULL,
  `option_c` varchar(255) NOT NULL,
  `option_d` varchar(255) NOT NULL,
  `answer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `quiz`
--

INSERT INTO `quiz` (`id_quiz`, `question`, `option_a`, `option_b`, `option_c`, `option_d`, `answer`) VALUES
(1, 'What is the capital city of France?', 'Paris', 'London', 'Berlin', 'Madrid', 'Paris'),
(2, 'Which planet is known as the Red Planet?', 'Venus', 'Mars', 'Jupiter', 'Saturn', 'Mars'),
(3, 'Who painted the Mona Lisa?', 'Vincent van Gogh', 'Pablo Picasso', 'Leonardo da Vinci', 'Claude Monet', 'Leonardo da Vinci'),
(4, 'What is the largest mammal in the world?', 'Blue Whale', 'African Elephant', 'Giraffe', 'Hippopotamus', 'Blue Whale'),
(5, 'In which year did World War II end?', '1940', '1945', '1950', '1939', '1945'),
(6, 'What is the chemical symbol for Gold?', 'Au', 'Ag', 'Fe', 'Cu', 'Au'),
(7, 'Which country is home to the kangaroo?', 'Brazil', 'India', 'Australia', 'South Africa', 'Australia'),
(8, 'Who wrote the play \"Romeo and Juliet\"?', 'William Shakespeare', 'Charles Dickens', 'Jane Austen', 'Mark Twain', 'William Shakespeare'),
(9, 'What is the smallest prime number?', '0', '1', '2', '3', '2'),
(10, 'Which gas is most abundant in Earth\'s atmosphere?', 'Oxygen', 'Nitrogen', 'Carbon Dioxide', 'Hydrogen', 'Nitrogen'),
(11, 'What is the longest river in the world?', 'Amazon', 'Nile', 'Yangtze', 'Mississippi', 'Nile'),
(12, 'Who is the Greek god of war?', 'Zeus', 'Apollo', 'Ares', 'Hermes', 'Ares'),
(13, 'What is the main ingredient in guacamole?', 'Tomato', 'Avocado', 'Onion', 'Pepper', 'Avocado'),
(14, 'Which element has the atomic number 1?', 'Helium', 'Hydrogen', 'Lithium', 'Beryllium', 'Hydrogen'),
(15, 'In which sport is the term \"home run\" used?', 'Basketball', 'Soccer', 'Baseball', 'Tennis', 'Baseball'),
(16, 'What is the currency of Japan?', 'Yuan', 'Won', 'Yen', 'Ringgit', 'Yen'),
(17, 'Who discovered penicillin?', 'Alexander Fleming', 'Marie Curie', 'Isaac Newton', 'Thomas Edison', 'Alexander Fleming'),
(18, 'Which country hosted the 2016 Summer Olympics?', 'China', 'Brazil', 'Russia', 'Japan', 'Brazil'),
(19, 'What is the largest desert in the world?', 'Sahara', 'Gobi', 'Antarctic', 'Kalahari', 'Antarctic');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `quiz`
--
ALTER TABLE `quiz`
  ADD PRIMARY KEY (`id_quiz`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `quiz`
--
ALTER TABLE `quiz`
  MODIFY `id_quiz` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
