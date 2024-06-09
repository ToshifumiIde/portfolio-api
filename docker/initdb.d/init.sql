CREATE TABLE IF NOT EXISTS test(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  uuid varchar(32) NOT NULL,
  title VARCHAR(255) NOT NULL,
  description varchar(1000) NOT NULL
);

INSERT INTO test (id,uuid,title,description) VALUES
(1,'00000000000000000000000000000001','test1','description1');