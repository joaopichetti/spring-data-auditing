package com.example.auditoria.entity

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
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
    var descricao: String? = null,

    @Column(name = "criado_em", nullable = false, updatable = false)
    @CreatedDate
    var criadoEm: LocalDateTime? = null,

    @Column(name = "atualizado_em", nullable = false)
    @LastModifiedDate
    var atualizadoEm: LocalDateTime? = null,

    @Column(name = "criado_por", nullable = false, updatable = false)
    @CreatedBy
    var criadoPor: String? = null,

    @Column(name = "atualizado_por", nullable = false)
    @LastModifiedBy
    var atualizadoPor: String? = null

)
