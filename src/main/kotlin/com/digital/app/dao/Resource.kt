package com.digital.app.dao

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("RESOURCE")
data class Resource(@Id var resourceId: String?, val name: String, val type: String, val defaultaccess: String, val status: String, val metadata: String)

