package com.example.auditoria.repository

import com.example.auditoria.entity.ProdutoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProdutoRepository : JpaRepository<ProdutoEntity, Long>
