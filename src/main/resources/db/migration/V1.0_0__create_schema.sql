create table produto
(
    id serial not null primary key,
    nome varchar(60) not null,
    descricao varchar(60) not null,
    criado_em timestamp not null,
    atualizado_em timestamp not null
);
