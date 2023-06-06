package com.digital.app.dao

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("ROLE")
data class Role(@Id var roleId: String?, val rolename: String)
