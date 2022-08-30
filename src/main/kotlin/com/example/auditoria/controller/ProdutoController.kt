package com.example.auditoria.controller

import com.example.auditoria.entity.ProdutoEntity
import com.example.auditoria.repository.ProdutoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produtos")
class ProdutoController {

    @Autowired
    private lateinit var produtoRepository: ProdutoRepository

    @GetMapping("/")
    fun listar(pageable: Pageable): Page<ProdutoEntity> = produtoRepository.findAll(pageable)

    @GetMapping("/{id}")
    fun obter(@PathVariable id: Long): ResponseEntity<ProdutoEntity> =
        ResponseEntity.ok(produtoRepository.findByIdOrNull(id))

    @DeleteMapping("/{id}")
    fun deletar(@PathVariable id: Long) {
        produtoRepository.deleteById(id)
    }

    @PostMapping("/")
    fun salvar(@RequestBody produto: ProdutoEntity): ResponseEntity<ProdutoEntity> =
        ResponseEntity.ok(produtoRepository.save(produto))

}
