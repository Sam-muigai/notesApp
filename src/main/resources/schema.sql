CREATE TABLE IF NOT EXISTS notes(
    id SERIAL PRIMARY KEY ,
    email VARCHAR(20) NOT NULL,
    title VARCHAR(20) NOT NULL ,
    description TEXT,
    category VARCHAR(20)

);