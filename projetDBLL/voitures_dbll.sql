-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 14 Janvier 2017 à 23:51
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `voitures_dbll`
--

-- --------------------------------------------------------

--
-- Structure de la table `marques`
--

CREATE TABLE IF NOT EXISTS `marques` (
  `idm` int(11) NOT NULL AUTO_INCREMENT,
  `Nom_m` varchar(50) NOT NULL,
  `logo_m` varchar(10000) NOT NULL,
  PRIMARY KEY (`idm`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Contenu de la table `marques`
--

INSERT INTO `marques` (`idm`, `Nom_m`, `logo_m`) VALUES
(1, 'Audi', 'logo_marques/audi-logo.png'),
(2, 'BMW', 'logo_marques/BMW-logo.png'),
(3, 'Citroën', 'logo_marques/citroen-logo.png'),
(4, 'Dacia', 'logo_marques/Dacia-logo.png'),
(5, 'Fiat', 'logo_marques/fiat-logo.png'),
(6, 'Ford', 'logo_marques/Ford-logo.png'),
(7, 'Hyundai', 'logo_marques/hyundai-logo.png'),
(8, 'Kia', 'logo_marques/kia-logo.png'),
(9, 'Mazda', 'logo_marques/mazda-logo.png'),
(10, 'Mercedes', 'logo_marques/mercedes-logo.png');

-- --------------------------------------------------------

--
-- Structure de la table `voitures`
--

CREATE TABLE IF NOT EXISTS `voitures` (
  `idv` int(11) NOT NULL DEFAULT '0',
  `idm` int(11) NOT NULL,
  `nom_v` varchar(50) NOT NULL,
  `image_v` varchar(10000) NOT NULL,
  `prix` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idv`),
  KEY `idm` (`idm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `voitures`
--

INSERT INTO `voitures` (`idv`, `idm`, `nom_v`, `image_v`, `prix`) VALUES
(1, 1, 'AUDI A1 SPORTBACK', 'audi/AUDI A1 SPORTBACK.jpg', '58980'),
(2, 1, 'AUDI A6 1.8 TFSI AMBITION LUXE BVA', 'audi/AUDI A6 1.8 TFSI AMBITION LUXE BVA.jpg', '159980'),
(3, 2, 'BMW SÉRIE 3', 'bmw/BMW SÉRIE 3.jpg', '100600'),
(4, 2, 'BMW SÉRIE 1 5P', 'bmw/BMW SÉRIE 1 5P.jpj', '78700'),
(5, 3, 'CITROËN C1 1.0 L 68CH', 'citroen/CITROËN C1 1.0 L 68CH.jpg', '24600'),
(6, 3, 'CITROËN C-ELYSÉE', 'citroen/CITROËN C-ELYSÉE.jpg', '29980'),
(7, 4, 'CITROËN C-ELYSÉE', 'dacia/CITROËN C-ELYSÉE.jpg', '28750'),
(8, 4, 'DACIA SANDERO 1.2 L', 'dacia/DACIA SANDERO 1.2 L.jpg', '27950'),
(9, 5, 'FIAT PANDA', 'fiat/FIAT PANDA.jpg', '27890'),
(10, 5, 'FIAT PUNTO POP 1.2 FIRE', 'fiat/FIAT PUNTO POP 1.2 FIRE.png', '29690'),
(11, 6, 'FORD FIESTA', 'ford/FORD FIESTA.jpg', '31980'),
(12, 6, 'FORD FIESTA', 'ford/FORD FIESTA.jpg', '44800'),
(13, 7, 'HYUNDAI GRAND I10', 'hyundai/HYUNDAI GRAND I10.jpg', '21270'),
(14, 7, 'HYUNDAI I10 1.0 L', 'hyundai/HYUNDAI I10 1.0 L.jpg', '27950'),
(15, 8, 'KIA PICANTO', 'kia/KIA PICANTO.jpg', '23448'),
(16, 8, 'KIA RIO', 'kia/KIA RIO.jpg', '34980'),
(17, 9, 'MAZDA 2 SEDAN 1.5 L SKYACTIV', 'mazda/MAZDA 2 SEDAN 1.5 L SKYACTIV.jpg', '41500'),
(18, 9, 'MAZDA 2', 'mazda/MAZDA 2.jpg', '40900'),
(19, 10, 'MERCEDES-BENZ CLASSE A', 'mercedes/MERCEDES-BENZ CLASSE A.jpg', '78000'),
(20, 10, 'MERCEDES-BENZ CLASSE B', 'mercedes/MERCEDES-BENZ CLASSE B.jpg', '69900');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `voitures`
--
ALTER TABLE `voitures`
  ADD CONSTRAINT `voitures_ibfk_1` FOREIGN KEY (`idm`) REFERENCES `marques` (`idm`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
