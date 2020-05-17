/*
Baseado nos códigos do livro
LECHETA, R. R. Android Essencial com Kotlin. Edição: 1ª ed. Novatec, 2017. 

Código original: https://github.com/livroandroid/kotlin-essencial-1ed
*/

package br.com.fernandosousa.lmsapp

import android.app.Application
import java.lang.IllegalStateException

class LMSApplication: Application() {
    // chamado quando android iniciar o processo da aplicação
    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        // singleton
        private var appInstance: LMSApplication?  = null
        fun getInstance(): LMSApplication {
            if (appInstance == null) {
                throw IllegalStateException("Configurar application no Android Manifest")
            }
            return appInstance!!
        }
    }

    // chamado quando android terminar processo da aplicação
    override fun onTerminate() {
        super.onTerminate()
    }
}