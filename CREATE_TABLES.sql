CREATE TABLE gastos (
                        id                INT AUTO_INCREMENT PRIMARY KEY,
                        titulo            VARCHAR(100)  NOT NULL,
                        categoria_id      INT           NOT NULL,
                        cantidad_importe  DECIMAL(10,2) NOT NULL,
                        establecimiento   VARCHAR(100),
                        ubicacion_nombre  VARCHAR(150),
                        latitud           DOUBLE,
                        longitud          DOUBLE,
                        fecha             DATE          NOT NULL,
                        hora              TIME,
                        metodo_pago       VARCHAR(30),
                        descripcion       VARCHAR(500),
                        creado_en         DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE categorias (
                            id      INT AUTO_INCREMENT PRIMARY KEY,
                            nombre  VARCHAR(50) NOT NULL UNIQUE,
                            color   VARCHAR(7)  NOT NULL DEFAULT '#808080'
);