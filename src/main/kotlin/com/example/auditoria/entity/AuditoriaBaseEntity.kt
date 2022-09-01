package com.example.auditoria.entity

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class AuditoriaBaseEntity(

    @Column(name = "criado_em", nullable = false, updatable = false)
    @CreatedDate
    open var criadoEm: LocalDateTime? = null,

    @Column(name = "atualizado_em", nullable = false)
    @LastModifiedDate
    open var atualizadoEm: LocalDateTime? = null,

    @Column(name = "criado_por", nullable = false, updatable = false)
    @CreatedBy
    open var criadoPor: String? = null,

    @Column(name = "atualizado_por", nullable = false)
    @LastModifiedBy
    open var atualizadoPor: String? = null

)
