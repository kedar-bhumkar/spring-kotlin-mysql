package com.digital.app.dao

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("TEST_MESSAGES")
data class Message(@Id var id: String?, val text: String)
