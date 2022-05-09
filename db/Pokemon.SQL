-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2022 a las 21:27:19
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `pokemon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `equipo` int(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `pokedollar` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `potencia` int(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `tipo_movimiento` enum('ATAQUE','MEJORA','ESTADO','') NOT NULL,
  `ID_movimiento` varchar(20) NOT NULL,
  `coste_estamina` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon`
--

CREATE TABLE `pokemon` (
  `vitalidad` int(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `fertilidad` int(20) NOT NULL,
  `mote` varchar(20) NOT NULL,
  `defensa` int(20) NOT NULL,
  `defensa_especial` int(20) NOT NULL,
  `nivel` int(20) NOT NULL,
  `ataque_especial` int(20) NOT NULL,
  `velocidad` int(20) NOT NULL,
  `estamina` int(20) NOT NULL,
  `ataque` int(20) NOT NULL,
  `tipo` enum('PLANTA','FUEGO','AGUA','TIERRA','BICHO','ELECTRICO','VOLADOR') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`nombre`);
COMMIT;
