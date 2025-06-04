CREATE TABLE parcels (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    size DECIMAL(10,2),
    price DECIMAL(10,2),
    status VARCHAR(20)
);
