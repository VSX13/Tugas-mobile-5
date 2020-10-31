package com.example.booklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.RecyclerView as RecyclerView1

class MainActivity : AppCompatActivity() {
    val list = ArrayList<buku>()
    val listBuku = arrayOf(
        "Matematika",
        "Bahasa Inggris",
        "Bahasa Arab",
        "Bahasa Indonesia",
        "IPA",
        "IPS",
        "Seni Budaya dan Prakarya",
        "Pendidikan Kewarganegaraan",
        "Pendidikan Jasmani"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listBuku.size){
            list.add(buku(listBuku.get(i)))
            if (listBuku.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                RecyclerView.adapter = adapter
                adapter.setOnClickListener {
                    // val isi = findViewById<Users>(R.id.lbList)
                    Toast.makeText(this, "Test Buku "+ listBuku[it]+ " Berhasil" , Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}