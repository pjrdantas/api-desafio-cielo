# api-desafio-cielo
API para Extrato de Lançamentos em conta. 

SCRIPT DO BANCO DE DADOS

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema db_desafio_cielo
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_desafio_cielo` ;

-- -----------------------------------------------------
-- Schema db_desafio_cielo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_desafio_cielo` DEFAULT CHARACTER SET utf8mb4 ;
SHOW WARNINGS;
USE `db_desafio_cielo` ;

-- -----------------------------------------------------
-- Table `db_desafio_cielo`.`tb_extrato`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_desafio_cielo`.`tb_extrato` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `db_desafio_cielo`.`tb_extrato` (
  `id` INT(10) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `tb_extrato_data_lancamento` DATE NOT NULL,
  `tb_extrato_descricao` VARCHAR(45) NOT NULL,
  `tb_extrato_numero` INT(11) NOT NULL,
  `tb_extrato_situacao` VARCHAR(45) NOT NULL,
  `tb_extrato_data_confirmacao` DATE NOT NULL,
  `tb_extrato_dados_bancario` VARCHAR(100) NOT NULL,
  `tb_extrato_valorFinal` DECIMAL(9,2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8mb4;

SHOW WARNINGS;
CREATE UNIQUE INDEX `id_UNIQUE` ON `db_desafio_cielo`.`tb_extrato` (`id` ASC);

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



*----------------------------------------------------- JSON DE ENTRADA -----------------------------------------------------

{
	"totalControleLancamento": {
		"quantidadeLancamentos": 608,
		"quantidadeRemessas": 39,
		"valorLancamentos": 473320.37
	},
	"listaControleLancamento": [{
			"lancamentoContaCorrenteCliente": {
				"numeroRemessaBanco": 64320236054,
				"nomeSituacaoRemessa": "Pago",
				"dadosDomicilioBancario": {
					"codigoBanco": 123,
					"numeroAgencia": 1,
					"numeroContaCorrente": "00000000065470"
				},
				"nomeTipoOperacao": "regular"
			},
			"dataEfetivaLancamento": "03/06/2016",
			"dataLancamentoContaCorrenteCliente": "03/06/2016",
			"numeroEvento": 42236790,
			"descricaoGrupoPagamento": "LA-56",
			"codigoIdentificadorUnico": "1",
			"nomeBanco": "BANCO ABCD S.A.             ",
			"quantidadeLancamentoRemessa": 22,
			"numeroRaizCNPJ": "12996721",
			"numeroSufixoCNPJ": "1597",
			"valorLancamentoRemessa": 11499.1,
			"dateLancamentoContaCorrenteCliente": 1464922800000,
			"dateEfetivaLancamento": 1464922800000
		},
		{
			"lancamentoContaCorrenteCliente": {
				"numeroRemessaBanco": 64320626054,
				"nomeSituacaoRemessa": "Pago",
				"dadosDomicilioBancario": {
					"codigoBanco": 123,
					"numeroAgencia": 1,
					"numeroContaCorrente": "00000000065470"
				},
				"nomeTipoOperacao": "regular"
			},
			"dataEfetivaLancamento": "02/06/2016",
			"dataLancamentoContaCorrenteCliente": "02/06/2016",
			"numeroEvento": 42592397,
			"descricaoGrupoPagamento": "LA-56",
			"codigoIdentificadorUnico": "25",
			"nomeBanco": "BANCO ABCD S.A.             ",
			"quantidadeLancamentoRemessa": 2,
			"numeroRaizCNPJ": "12996721",
			"numeroSufixoCNPJ": "1597",
			"valorLancamentoRemessa": 1960,
			"dateLancamentoContaCorrenteCliente": 1464836400000,
			"dateEfetivaLancamento": 1464836400000
		}
	],
	"indice": 1,
	"tamanhoPagina": 25,
	"totalElements": 39
}
 ---------------------------------------- JSON SAIDA -----------------------------------------------
 
 [
    {
        "id": 10,
        "dataLancamento": "2016-06-02",
        "descricao": "Pago",
        "numero": 42592397,
        "valorFinal": 1960,
        "situacao": "regular",
        "dataConfirmacao": "2016-06-02",
        "dadosBancario": "BANCO ABCD S.A.             Ag.: 1 / CC.: 000000000654701960"
    },
    {
        "id": 9,
        "dataLancamento": "2016-06-03",
        "descricao": "Pago",
        "numero": 42236790,
        "valorFinal": 11499,
        "situacao": "regular",
        "dataConfirmacao": "2016-06-03",
        "dadosBancario": "BANCO ABCD S.A.             Ag.: 1 / CC.: 0000000006547011499"
    }
]

*------------------------------------------------- FIM --------------------------------------------------------------------

