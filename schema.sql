CREATE TABLE `city_rates` (
  `id` int(11) unsigned NOT NULL primary key AUTO_INCREMENT,
  `city_name` varchar(20) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `pension_Rate_Person` varchar(20) DEFAULT NULL,
  `medical_Rate_Person` varchar(20) DEFAULT NULL,
  `unempolyee_Rate_Person` varchar(20) DEFAULT NULL,
  `basicHousing_Rate_Person` varchar(20) DEFAULT NULL,
  `supplementHousing_Rate_Person` varchar(20) DEFAULT NULL,
);
