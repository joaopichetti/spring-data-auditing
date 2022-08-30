package com.example.auditoria.entity

import javax.persistence.*

@Entity
@Table(name = "produto")
class ProdutoEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "nome")
    var nome: String? = null,

    @Column(name = "descricao")
    var descricao: String? = null

)
