package com.example.auditoria.entity

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*

@Entity
@Table(name = "produto")
@EntityListeners(AuditingEntityListener::class)
class ProdutoEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "nome")
    var nome: String? = null,

    @Column(name = "descricao")
    var descricao: String? = null

) : AuditoriaBaseEntity()
