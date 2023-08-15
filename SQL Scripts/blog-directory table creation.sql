USE `travelblogger_tracker`;

--
-- Table structure for table `blog`
--

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `views` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `blog` VALUES 
	(1,
    'Hidden Gems: Offbeat Destinations',
    'Join our intrepid journey as we venture off the beaten path, exploring lesser-known destinations brimming with untold stories and captivating landscapes.',
    34),
	
    (2,
    'India\'\s Diverse Landscapes',
    'Embark on an unforgettable odyssey through India\'\s diverse terrain, from the opulent palaces of Rajasthan to the breathtaking plateaus of the Western Ghats.',
    500),
	
    (3,
    'Authentic Italy: Beyond Brochures',
    'Delight your taste buds as we delve into Italy\'\s culinary delights beyond the typical tourist fare, savoring regional specialties and secret recipes.',
    2456),
	
    (4,
    'Eco-Adventures: Amazon Rainforest',
    'Immerse yourself in an eco-conscious escapade through the Amazon rainforest, discovering its rich biodiversity while supporting responsible travel practices.',
    33),
	
    (5,
    'Tropical Bliss: Southeast Asia Islands',
    'Sail away to Southeast Asia\'\s idyllic islands, where sun-kissed beaches, azure waters, and hidden paradises await your discovery.',
    720);

