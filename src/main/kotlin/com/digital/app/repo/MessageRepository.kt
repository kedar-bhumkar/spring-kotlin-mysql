package com.digital.app.repo

import com.digital.app.dao.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>