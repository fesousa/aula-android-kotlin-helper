/*
Baseado nos códigos do livro
LECHETA, R. R. Android Essencial com Kotlin. Edição: 1ª ed. Novatec, 2017. 

Código original: https://github.com/livroandroid/kotlin-essencial-1ed
*/

package br.com.fernandosousa.lmsapp

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

object AndroidUtils {
    // verificar se existe algum tipo de conexão disponível
    fun isInternetDisponivel(context: Context): Boolean {
        val conexao = context.getSystemService(Context.CONNECTIVITY_SERVICE)  as ConnectivityManager

        val redes = conexao.allNetworks
        return redes.map{conexao.getNetworkInfo(it)}.any{it.state == NetworkInfo.State.CONNECTED}
    }
}