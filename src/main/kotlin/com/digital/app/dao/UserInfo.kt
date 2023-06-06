package com.digital.app.dao

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("USER_INFO")
data class UserInfo(@Id var userId: String?, val extId: String, val firstname: String, val lastname: String, val roleId: String, val metadata: String)
