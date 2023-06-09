package com.digital.app.dao


import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("RESOURCE")
data class Resource(@Id var resourceid: String?, val name: String, val type: String, val defaultaccess: String, val status: String, @JsonIgnore val metadata: String?)

