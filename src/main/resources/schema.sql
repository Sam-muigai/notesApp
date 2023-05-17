CREATE TABLE IF NOT EXISTS notes(
    id SERIAL PRIMARY KEY ,
    email VARCHAR(50) NOT NULL,
    title VARCHAR(50) NOT NULL ,
    description TEXT,
    category VARCHAR(20)

);