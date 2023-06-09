package com.digital.app.response

import com.digital.app.dao.Resource

data class ResourceDTO(val resource: Resource,   val documentMetadata:List<DocumentMetadata>? )
