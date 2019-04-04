USE `cams`;

SET FOREIGN_KEY_CHECKS =0;
TRUNCATE `resident`;
SET FOREIGN_KEY_CHECKS =1;

INSERT INTO `resident`
    ( `name`, `password`)
VALUES
       ( '居民1', '123' ),
       ( '居民2', '123' ),
       ( '居民3', '123' );
