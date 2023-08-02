create table country_code (
    id uuid not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    name varchar(255) not null,
    phone_code varchar(255) not null, 
    primary key (id),
    unique(name)
);


