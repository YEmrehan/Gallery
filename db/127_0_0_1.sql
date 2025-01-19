-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 07 Oca 2025, 13:25:45
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `galeri`
--
CREATE DATABASE IF NOT EXISTS `galeri` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `galeri`;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `arabalar`
--

CREATE TABLE `arabalar` (
  `id` int(11) NOT NULL,
  `sasi_numarasi` varchar(50) NOT NULL,
  `marka` varchar(100) NOT NULL,
  `model` varchar(100) NOT NULL,
  `yil` int(11) NOT NULL,
  `kilometre` int(11) NOT NULL,
  `yakit_tipi` enum('Benzin','Dizel','Benzin ve LPG','Elektrik') NOT NULL,
  `vites_tipi` enum('Manuel','Otomatik') NOT NULL,
  `hasar_kaydi` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `arabalar`
--

INSERT INTO `arabalar` (`id`, `sasi_numarasi`, `marka`, `model`, `yil`, `kilometre`, `yakit_tipi`, `vites_tipi`, `hasar_kaydi`) VALUES
(65445, '9876', 'Volkswagen', 'Golf', 2022, 15000, 'Benzin', 'Otomatik', 'Kaporta hasarı'),
(65446, '4321', 'Audi', 'A3', 2019, 30000, 'Dizel', 'Manuel', 'Motor arızası'),
(65447, '8765', 'BMW', 'X5', 2021, 25000, 'Benzin ve LPG', 'Otomatik', 'Süspansiyon arızası'),
(65448, '1111', 'Mercedes', 'A200', 2018, 120000, 'Benzin', 'Manuel', 'Yok'),
(65449, '2233', 'Renault', 'Clio', 2020, 20000, 'Elektrik', 'Otomatik', 'Fren sistemi arızası'),
(65450, '3344', 'Ford', 'Fiesta', 2021, 15000, 'Benzin', 'Manuel', 'Kaporta hasarı'),
(65451, '4455', 'Opel', 'Insignia', 2020, 30000, 'Dizel', 'Otomatik', 'Yok'),
(65453, '6677', 'Toyota', 'Corolla', 2021, 5000, 'Benzin ve LPG', 'Otomatik', 'Yok'),
(65454, '7788', 'CX_55', 'cv55', 0, 0, 'Benzin', 'Manuel', 'Yok');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `calisanlar`
--

CREATE TABLE `calisanlar` (
  `id` int(11) NOT NULL,
  `isim` varchar(100) NOT NULL,
  `soyisim` varchar(100) NOT NULL,
  `pozisyon` varchar(100) NOT NULL,
  `telefon` varchar(20) DEFAULT NULL,
  `adres` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `calisanlar`
--

INSERT INTO `calisanlar` (`id`, `isim`, `soyisim`, `pozisyon`, `telefon`, `adres`) VALUES
(898, 'Mehmet', 'Yılmaz', 'Satış Temsilcisi', '5321234567', 'İstanbul'),
(899, 'Ayşe', 'Kara', 'Satış Müdürü', '5331234567', 'Ankara'),
(900, 'Ali', 'Demir', 'Yazılım Geliştirici', '5341234567', 'İzmir'),
(901, 'Fatma', 'Özdemir', 'Müdür Yardımcısı', '5351234567', 'Bursa'),
(902, 'Kemal', 'Büyük', 'Muhasebeci', '5361234567', 'Antalya'),
(903, 'Zeynep', 'Çelik', 'Satın Alma Uzmanı', '5371234567', 'Adana'),
(904, 'Emre', 'Şahin', 'Lojistik Müdürü', '5381234567', 'Konya'),
(905, 'Oya', 'Kılıç', 'İnsan Kaynakları Uzmanı', '5391234567', 'Eskişehir'),
(906, 'Furkan', 'Çetin', 'Finans Müdürü', '5401234567', 'Samsun');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteriler`
--

CREATE TABLE `musteriler` (
  `id` int(11) NOT NULL,
  `isim` varchar(100) NOT NULL,
  `soyisim` varchar(100) NOT NULL,
  `telefon` varchar(20) DEFAULT NULL,
  `adres` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `musteriler`
--

INSERT INTO `musteriler` (`id`, `isim`, `soyisim`, `telefon`, `adres`) VALUES
(24546, 'Ahmet', 'Demir', '5551234567', 'Kadıköy, İstanbul'),
(24547, 'Mehmet', 'Kara', '5552234567', 'Çankaya, Ankara'),
(24548, 'Fatma', 'Şahin', '5553234567', 'Konak, İzmir'),
(24549, 'Ayşe', 'Yılmaz', '5554234567', 'Nilüfer, Bursa'),
(24550, 'Emre', 'Öztürk', '5555234567', 'Antalya Merkez, Antalya'),
(24551, 'Kemal', 'Çelik', '5556234567', 'Seyhan, Adana'),
(24552, 'Zeynep', 'Kılıç', '5557234567', 'Meram, Konya'),
(24553, 'Ali', 'Büyük', '5558234567', 'Tepebaşı, Eskişehir'),
(24554, 'Boya', 'Arslan', '5559234567', 'Atakum, Samsun');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `satislar`
--

CREATE TABLE `satislar` (
  `id` int(11) NOT NULL,
  `araba_id` int(11) NOT NULL,
  `musteri_id` int(11) NOT NULL,
  `calisan_id` int(11) NOT NULL,
  `tarih` varchar(20) DEFAULT NULL,
  `fiyat` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `satislar`
--

INSERT INTO `satislar` (`id`, `araba_id`, `musteri_id`, `calisan_id`, `tarih`, `fiyat`) VALUES
(1, 65445, 24546, 898, '2025-01-07', '150000'),
(2, 65446, 24547, 899, '2025-01-06', '180000'),
(3, 65447, 24548, 900, '2025-01-05', '220000'),
(4, 65448, 24549, 901, '2025-01-04', '250000'),
(5, 65449, 24550, 902, '2025-01-03', '100000'),
(6, 65450, 24551, 903, '2025-01-02', '110000'),
(7, 65451, 24552, 905, '2025-01-01', '95000');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `arabalar`
--
ALTER TABLE `arabalar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `calisanlar`
--
ALTER TABLE `calisanlar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `musteriler`
--
ALTER TABLE `musteriler`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `satislar`
--
ALTER TABLE `satislar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `araba_id` (`araba_id`),
  ADD KEY `musteri_id` (`musteri_id`),
  ADD KEY `calisan_id` (`calisan_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `arabalar`
--
ALTER TABLE `arabalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65455;

--
-- Tablo için AUTO_INCREMENT değeri `calisanlar`
--
ALTER TABLE `calisanlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=908;

--
-- Tablo için AUTO_INCREMENT değeri `musteriler`
--
ALTER TABLE `musteriler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24556;

--
-- Tablo için AUTO_INCREMENT değeri `satislar`
--
ALTER TABLE `satislar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `satislar`
--
ALTER TABLE `satislar`
  ADD CONSTRAINT `satislar_ibfk_1` FOREIGN KEY (`araba_id`) REFERENCES `arabalar` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `satislar_ibfk_2` FOREIGN KEY (`musteri_id`) REFERENCES `musteriler` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `satislar_ibfk_3` FOREIGN KEY (`calisan_id`) REFERENCES `calisanlar` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
