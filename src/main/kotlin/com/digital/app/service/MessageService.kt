package com.digital.app.service

import com.digital.app.dao.Message
import com.digital.app.repo.MessageRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class MessageService(val db: MessageRepository) {


    fun findMessages(): List<Message> = db.findAll().toList()

    fun findMessageById(id: String): List<Message> = db.findById(id).toList()

    fun save(message: Message) {
        db.save(message)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}
