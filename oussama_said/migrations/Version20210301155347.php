<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210301155347 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('CREATE TABLE clients (id_client INT AUTO_INCREMENT NOT NULL, nom VARCHAR(255) NOT NULL, PRIMARY KEY(id_client)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE plats (id_plat INT AUTO_INCREMENT NOT NULL, id_resto INT NOT NULL, nom VARCHAR(255) NOT NULL, composition VARCHAR(255) NOT NULL, prix INT NOT NULL, type VARCHAR(255) NOT NULL, photo VARCHAR(255) NOT NULL, INDEX IDX_854A620A67A41481 (id_resto), PRIMARY KEY(id_plat)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE reservation_plats (id_res_plat INT AUTO_INCREMENT NOT NULL, id_client INT NOT NULL, id_plat INT NOT NULL, quantity INT NOT NULL, date_reservation DATETIME NOT NULL, INDEX IDX_C635B2ADE173B1B8 (id_client), INDEX IDX_C635B2ADAB18BE05 (id_plat), PRIMARY KEY(id_res_plat)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE restaurants (id_resto INT AUTO_INCREMENT NOT NULL, nom VARCHAR(255) NOT NULL, adresse VARCHAR(255) NOT NULL, ville VARCHAR(255) NOT NULL, description VARCHAR(10000) NOT NULL, type VARCHAR(255) NOT NULL, photo VARCHAR(255) NOT NULL, num_tel INT NOT NULL, email VARCHAR(255) NOT NULL, note INT NOT NULL, PRIMARY KEY(id_resto)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('ALTER TABLE plats ADD CONSTRAINT FK_854A620A67A41481 FOREIGN KEY (id_resto) REFERENCES restaurants (id_resto)');
        $this->addSql('ALTER TABLE reservation_plats ADD CONSTRAINT FK_C635B2ADE173B1B8 FOREIGN KEY (id_client) REFERENCES clients (id_client)');
        $this->addSql('ALTER TABLE reservation_plats ADD CONSTRAINT FK_C635B2ADAB18BE05 FOREIGN KEY (id_plat) REFERENCES plats (id_plat)');
    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE reservation_plats DROP FOREIGN KEY FK_C635B2ADE173B1B8');
        $this->addSql('ALTER TABLE reservation_plats DROP FOREIGN KEY FK_C635B2ADAB18BE05');
        $this->addSql('ALTER TABLE plats DROP FOREIGN KEY FK_854A620A67A41481');
        $this->addSql('DROP TABLE clients');
        $this->addSql('DROP TABLE plats');
        $this->addSql('DROP TABLE reservation_plats');
        $this->addSql('DROP TABLE restaurants');
    }
}
