package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maça"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "teste",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "teste 2",
                    descricao = "teste 2",
                    valor = BigDecimal("19.99")
                ),
            )
        )
    }
}