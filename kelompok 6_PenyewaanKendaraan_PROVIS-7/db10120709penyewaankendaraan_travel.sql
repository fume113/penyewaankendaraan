-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 06, 2022 at 05:15 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db10120709penyewaankendaraan_travel`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `user_id` int(3) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `email` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `role` enum('admin','customer','','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`user_id`, `username`, `password`, `nama`, `no_hp`, `email`, `alamat`, `role`) VALUES
(1, 'admin', 'admin', 'Rijal', '081312057698', 'rijal.hasanudin1@gmail.com', 'Lembang', 'admin'),
(2, 'customer', 'customer', 'Tegar', '081234567890', 'tegar@gmail.com', 'Bekasi', 'customer'),
(3, 'Rijal', 'Rijal', 'Rijal', '081312057698', 'rijal.hasanudin1@gmail.com', 'Lembang', 'customer'),
(4, 'Tegar', 'Tegar', 'Tegar', '081318142830', 'tegar@gmail.com', 'Tanggerang', 'customer'),
(5, 'Salsabila', 'Salsabila', 'Salsabila', '081542744717', 'Salsabila@gmail.com', 'Cimahi', 'customer'),
(6, 'Haikal', 'Haikal', 'Haikal', '081388058331', 'Haikal@gmail.com', 'Bandung', 'customer'),
(7, 'Anggela', 'Anggela', 'Anggela', '08986818229', 'Anggela@gmail.com', 'Bandung', 'customer'),
(8, 'Budi', 'Budi', 'Budi', '081311111111', 'Budi@gmail.com', 'Bali', 'customer'),
(9, 'Michael', 'Michael', 'Michael', '081322222222', 'Michael@gmail.com', 'Balikpapan', 'customer'),
(10, 'Sri', 'Sri', 'Sri', '081333333333', 'Sri@gmail.com', 'Cijengkol', 'customer'),
(11, 'Chairul', 'Chairul', 'Chairul', '081344444444', 'Chairul@gmail.com', 'Jakarta', 'customer'),
(12, 'Sukanto', 'Sukanto', 'Sukanto', '081355555555', 'Sukanto@gmail.com', 'Jayagiri', 'customer'),
(13, 'Peter', 'Peter', 'Peter', '081366666666', 'Peter@gmail.com', 'Amerika', 'customer'),
(14, 'Martua', 'Martua', 'Martua', '081377777777', 'Martua@gmail.com', 'Maluku', 'customer'),
(15, 'Tahir', 'Tahir', 'Tahir', '081388888888', 'Tahir@gmail.com', 'NTB', 'customer'),
(16, 'Lock', 'Lock', 'Lock', '081399999999', 'Lock@gmail.com', 'China', 'customer'),
(17, 'Theodore', 'Theodore', 'Theodore', '081310101010', 'Theodore@gmail.com', 'Bogor', 'customer'),
(18, 'Hary', 'Hary', 'Hary', '081311011101', 'Hary@gmail.com', 'Jogjakarta', 'customer'),
(19, 'Achmad', 'Achmad', 'Achmad', '081312121212', 'Achmad@gmail.com', 'Serang', 'customer'),
(20, 'Murday', 'Murday', 'Murday', '081313131313', 'Murday@gmail.com', 'Sumbawa', 'customer'),
(21, 'Djoko', 'Djoko', 'Djoko', '081314141414', 'Djoko@gmail.com', 'Panorama', 'customer'),
(22, 'Ciputra', 'Ciputra', 'Ciputra', '081315151515', 'Ciputra@gmail.com', 'Ciputri', 'customer'),
(23, 'Edwin', 'Edwin', 'Edwin', '081316161616', 'Edwin@gmail.com', 'Prancis', 'customer'),
(24, 'Kiki', 'Kiki', 'Kiki', '081317171717', 'Kiki@gmail.com', 'Eropa', 'customer'),
(25, 'Sjamsul', 'Sjamsul', 'Sjamsul', '081318181818', 'Sjamsul@gmail.com', 'Batavia', 'customer'),
(27, '123', '123', '123', '123', '123@gmail.com', 'Lembang', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `id_kendaraan` int(3) NOT NULL,
  `nama_kendaraan` enum('Avanza','Xenia','Agya','Jazz','Brio','Beat','Scoopy','Nmax','Supra','Kharisma') NOT NULL,
  `no_polisi` varchar(11) NOT NULL,
  `jenis_kendaraan` enum('Mobil','Motor','','') NOT NULL,
  `harga_sewa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kendaraan`
--

INSERT INTO `kendaraan` (`id_kendaraan`, `nama_kendaraan`, `no_polisi`, `jenis_kendaraan`, `harga_sewa`) VALUES
(1, 'Avanza', 'B 105K 0P', 'Mobil', 650000),
(2, 'Avanza', 'AV HGW1 RS', 'Mobil', 650000),
(3, 'Avanza', 'SG WET2 XZ', 'Mobil', 650000),
(4, 'Xenia', 'ET XGS3 WT', 'Mobil', 550000),
(5, 'Xenia', 'RI UTS2 TR', 'Mobil', 550000),
(6, 'Xenia', 'HD R83I SD', 'Mobil', 550000),
(7, 'Agya', 'DF WES9 HD', 'Mobil', 350000),
(8, 'Agya', 'KL JISU JG', 'Mobil', 350000),
(9, 'Agya', 'YR CBSQ 2G', 'Mobil', 350000),
(10, 'Jazz', 'FG FSHW YE', 'Mobil', 400000),
(11, 'Jazz', 'RY SIWR 96', 'Mobil', 400000),
(12, 'Jazz', '87 UISX R4', 'Mobil', 400000),
(13, 'Brio', 'SD 235G HJ', 'Mobil', 300000),
(14, 'Brio', 'JG 85XH S3', 'Mobil', 300000),
(15, 'Brio', 'GD 7348 SJ', 'Mobil', 300000),
(16, 'Beat', 'KL 53GS BX', 'Motor', 250000),
(17, 'Beat', 'UI 213M DX', 'Motor', 250000),
(18, 'Beat', '82 KSDJ 7G', 'Motor', 250000),
(19, 'Scoopy', 'GJ 723Z MB', 'Motor', 225000),
(20, 'Scoopy', '23 FDFA AS', 'Motor', 225000),
(21, 'Scoopy', '86 JKDS 64', 'Motor', 225000),
(22, 'Nmax', 'DF 2938 MG', 'Motor', 300000),
(23, 'Nmax', 'GF DGWE 53', 'Motor', 300000),
(24, 'Nmax', 'HF DFSG 23', 'Motor', 300000),
(25, 'Supra', 'JK DSJG XV', 'Motor', 150000),
(26, 'Supra', '87 JSDJ 67', 'Motor', 150000),
(27, 'Supra', 'GF ERQA DF', 'Motor', 150000),
(28, 'Kharisma', '12 SDXC 3Z', 'Motor', 100000),
(29, 'Kharisma', 'DF 123G 56', 'Motor', 100000),
(30, 'Kharisma', 'GF DFHS 23', 'Motor', 100000);

-- --------------------------------------------------------

--
-- Table structure for table `saldo`
--

CREATE TABLE `saldo` (
  `id_saldo` int(3) NOT NULL,
  `user_id` int(3) NOT NULL,
  `saldo` varchar(13) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `saldo`
--

INSERT INTO `saldo` (`id_saldo`, `user_id`, `saldo`) VALUES
(1, 2, '50000'),
(2, 3, '200000'),
(3, 4, '0'),
(4, 5, '0'),
(5, 6, '0'),
(6, 7, '0'),
(7, 8, '0'),
(8, 9, '0'),
(9, 10, '0'),
(10, 11, '0'),
(11, 12, '0'),
(12, 13, '0'),
(13, 14, '0'),
(14, 15, '0'),
(15, 16, '0'),
(16, 17, '0'),
(17, 18, '0'),
(18, 19, '0'),
(19, 20, '0'),
(20, 21, '0'),
(21, 22, '0'),
(22, 23, '0'),
(23, 24, '0'),
(24, 25, '0'),
(26, 27, '0');

-- --------------------------------------------------------

--
-- Table structure for table `sesi`
--

CREATE TABLE `sesi` (
  `id_sesi` int(2) NOT NULL DEFAULT 1,
  `user_id` int(3) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `kode_tiket` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `id_tiket` int(3) NOT NULL,
  `user_id` int(3) DEFAULT NULL,
  `id_kendaraan` int(3) NOT NULL,
  `nama_kendaraan` enum('Avanza','Xenia','Agya','Jazz','Brio','Beat','Scoopy','Nmax','Supra','Kharisma') NOT NULL,
  `kode_tiket` varchar(10) NOT NULL,
  `status` enum('Tersedia','Tidak Tersedia') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`id_tiket`, `user_id`, `id_kendaraan`, `nama_kendaraan`, `kode_tiket`, `status`) VALUES
(1, 2, 1, 'Avanza', 'O8yUZHvjnz', 'Tidak Tersedia'),
(2, NULL, 2, 'Avanza', 'fjMC8Kbebu', 'Tersedia'),
(3, NULL, 3, 'Avanza', 'jgJoBraeJn', 'Tersedia'),
(4, NULL, 4, 'Xenia', 'gUKLV1RQNX', 'Tersedia'),
(5, NULL, 5, 'Xenia', 'bxDx13x9lR', 'Tersedia'),
(6, NULL, 6, 'Xenia', 'DDVEClxzA1', 'Tersedia'),
(7, NULL, 7, 'Agya', 'SWzYWQfj89', 'Tersedia'),
(8, NULL, 8, 'Agya', '96xlY9QTn8', 'Tersedia'),
(9, NULL, 9, 'Agya', 'E8sPMEZIva', 'Tersedia'),
(10, NULL, 10, 'Jazz', 'uqadkOVyxA', 'Tersedia'),
(11, NULL, 11, 'Jazz', '55Qo3RB2cv', 'Tersedia'),
(12, NULL, 12, 'Jazz', 'j303B1ZKEm', 'Tersedia'),
(13, NULL, 13, 'Brio', 'lMdZDpV1i9', 'Tersedia'),
(14, NULL, 14, 'Brio', 'VQ0lOYHnIp', 'Tersedia'),
(15, NULL, 15, 'Brio', 'Z7PbcKEjs7', 'Tersedia'),
(16, NULL, 16, 'Beat', 'SqCKnqV50B', 'Tersedia'),
(17, NULL, 17, 'Beat', 'EugRQdpn8K', 'Tersedia'),
(18, NULL, 18, 'Beat', 'k5Gle5bTRA', 'Tersedia'),
(19, NULL, 19, 'Scoopy', 'C0m8JaSZhZ', 'Tersedia'),
(20, NULL, 20, 'Scoopy', 'vpPAYWZWrF', 'Tersedia'),
(21, NULL, 21, 'Scoopy', 'eqeSbgEpnx', 'Tersedia'),
(22, NULL, 22, 'Nmax', '8yk5fdCgTX', 'Tersedia'),
(23, NULL, 23, 'Nmax', 'o1O6xpg1ok', 'Tersedia'),
(24, NULL, 24, 'Nmax', 'fOD09e3vfO', 'Tersedia'),
(25, NULL, 25, 'Supra', 'rUoZdhvjkR', 'Tersedia'),
(26, NULL, 26, 'Supra', 'nrIF3776C5', 'Tersedia'),
(27, NULL, 27, 'Supra', 'UHlnyLocPM', 'Tersedia'),
(28, NULL, 28, 'Kharisma', 'T5cP5d0LBS', 'Tersedia'),
(29, NULL, 29, 'Kharisma', '6bEt2tV3Db', 'Tersedia'),
(30, NULL, 30, 'Kharisma', 'pJOS0m1Cuz', 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `voucher`
--

CREATE TABLE `voucher` (
  `id_voucher` int(3) NOT NULL,
  `user_id` int(3) DEFAULT NULL,
  `kode_voucher` varchar(10) NOT NULL,
  `nominal` varchar(13) NOT NULL,
  `status` enum('Digunakan','Belum Digunakan') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `voucher`
--

INSERT INTO `voucher` (`id_voucher`, `user_id`, `kode_voucher`, `nominal`, `status`) VALUES
(1, 2, 'H9HIDKocNP', '50000', 'Digunakan'),
(2, 2, 'bzXcVArUn1', '50000', 'Digunakan'),
(3, NULL, '7CpxVq5GmI', '50000', 'Belum Digunakan'),
(4, NULL, 'eBNj33EISm', '50000', 'Belum Digunakan'),
(5, NULL, 'dxyBbbOpOT', '50000', 'Belum Digunakan'),
(6, NULL, '8vGx9hDzsy', '100000', 'Belum Digunakan'),
(7, NULL, 'cPYE8aN6Mn', '100000', 'Belum Digunakan'),
(8, NULL, '3vWinAP52u', '100000', 'Belum Digunakan'),
(9, NULL, 'ELPebLKEDD', '100000', 'Belum Digunakan'),
(10, NULL, 'eTiSySrQ43', '100000', 'Belum Digunakan'),
(11, 2, 'FoJie36qUL', '250000', 'Digunakan'),
(12, NULL, 'jZjPCY3T2J', '250000', 'Belum Digunakan'),
(13, NULL, 'OA0Do4QaeJ', '250000', 'Belum Digunakan'),
(14, NULL, 'kJH6SYWQqF', '250000', 'Belum Digunakan'),
(15, NULL, 'aQio71A3A5', '250000', 'Belum Digunakan'),
(16, 3, 'pVXB4TFFb5', '500000', 'Digunakan'),
(17, NULL, 'G03W7P3QPi', '500000', 'Belum Digunakan'),
(18, NULL, 'fRCAvyeHQu', '500000', 'Belum Digunakan'),
(19, NULL, 'UsSY2grnsJ', '500000', 'Belum Digunakan'),
(20, NULL, 'pF0nMqXmvt', '500000', 'Belum Digunakan'),
(21, NULL, 'cPIhzZClas', '1000000', 'Belum Digunakan'),
(22, NULL, 'L40HdrO037', '1000000', 'Belum Digunakan'),
(23, NULL, 'Ds6eh8u5cL', '1000000', 'Belum Digunakan'),
(24, NULL, 'rjyeEFV3LW', '1000000', 'Belum Digunakan'),
(25, NULL, 'GhjH0UukLG', '1000000', 'Belum Digunakan'),
(26, NULL, 'cNT70CXMyq', '500000', 'Belum Digunakan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD PRIMARY KEY (`id_kendaraan`);

--
-- Indexes for table `saldo`
--
ALTER TABLE `saldo`
  ADD PRIMARY KEY (`id_saldo`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `sesi`
--
ALTER TABLE `sesi`
  ADD PRIMARY KEY (`id_sesi`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`id_tiket`),
  ADD UNIQUE KEY `id_kendaraan` (`id_kendaraan`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `voucher`
--
ALTER TABLE `voucher`
  ADD PRIMARY KEY (`id_voucher`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `user_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `kendaraan`
--
ALTER TABLE `kendaraan`
  MODIFY `id_kendaraan` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `saldo`
--
ALTER TABLE `saldo`
  MODIFY `id_saldo` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
  MODIFY `id_tiket` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `voucher`
--
ALTER TABLE `voucher`
  MODIFY `id_voucher` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `saldo`
--
ALTER TABLE `saldo`
  ADD CONSTRAINT `saldo_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `akun` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sesi`
--
ALTER TABLE `sesi`
  ADD CONSTRAINT `sesi_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `akun` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tiket`
--
ALTER TABLE `tiket`
  ADD CONSTRAINT `tiket_ibfk_1` FOREIGN KEY (`id_kendaraan`) REFERENCES `kendaraan` (`id_kendaraan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tiket_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `akun` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `voucher`
--
ALTER TABLE `voucher`
  ADD CONSTRAINT `voucher_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `akun` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
