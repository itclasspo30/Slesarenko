-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Фев 06 2017 г., 00:16
-- Версия сервера: 5.5.25
-- Версия PHP: 5.2.12

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `task_base`
--

-- --------------------------------------------------------

--
-- Структура таблицы `tasks`
--

CREATE TABLE IF NOT EXISTS `tasks` (
  `task_id` int(10) NOT NULL AUTO_INCREMENT,
  `task_text` varchar(50) NOT NULL,
  `task_status` varchar(10) NOT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=63 ;

--
-- Дамп данных таблицы `tasks`
--

INSERT INTO `tasks` (`task_id`, `task_text`, `task_status`) VALUES
(49, 'Walk the dog', 'disable'),
(52, 'Pay bills', 'disable'),
(55, 'Shoping', 'disable'),
(57, 'Hit the gym', 'enable'),
(58, 'Learning english', 'enable'),
(59, 'Check my car', 'enable'),
(60, 'Read book', 'enable'),
(61, 'Meet Olga', 'enable'),
(62, 'More sleeping', 'enable');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
