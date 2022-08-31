package com.example.auditoria.config

import org.springframework.data.domain.AuditorAware
import org.springframework.security.core.context.SecurityContextHolder
import java.util.*

class SpringSecurityAuditorAware : AuditorAware<String> {

    override fun getCurrentAuditor(): Optional<String> {
        val authentication = SecurityContextHolder.getContext().authentication

        if (!authentication.isAuthenticated) {
            return Optional.empty()
        }

        return Optional.ofNullable(authentication.name)
    }

}
