package com.example.alexsilkov.ht4
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.solver.ArrayLinkedVariables
import android.support.v7.widget.GridLayoutManager
import com.example.alexsilkov.ht4.R.drawable.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameData = resources.getStringArray(R.array.planets)
        val visionData = arrayOf(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)
        val distanceData = resources.getStringArray(R.array.distanceToSun)
        val live = arrayOf(death, death, plants, death, death, death, death, death)
        var webview = webView
        var webArray = arrayOf("https://ru.wikipedia.org/wiki/%D0%9C%D0%B5%D1%80%D0%BA%D1%83%D1%80%D0%B8%D0%B9",
                "https://ru.wikipedia.org/wiki/%D0%92%D0%B5%D0%BD%D0%B5%D1%80%D0%B0",
                "https://ru.wikipedia.org/wiki/%D0%97%D0%B5%D0%BC%D0%BB%D1%8F",
                "https://ru.wikipedia.org/wiki/%D0%9C%D0%B0%D1%80%D1%81",
                "https://ru.wikipedia.org/wiki/%D0%AE%D0%BF%D0%B8%D1%82%D0%B5%D1%80",
                "https://ru.wikipedia.org/wiki/%D0%A1%D0%B0%D1%82%D1%83%D1%80%D0%BD",
                "https://ru.wikipedia.org/wiki/%D0%A3%D1%80%D0%B0%D0%BD_(%D0%BF%D0%BB%D0%B0%D0%BD%D0%B5%D1%82%D0%B0)",
                "https://ru.wikipedia.org/wiki/%D0%9D%D0%B5%D0%BF%D1%82%D1%83%D0%BD")
        var data = Array(8, { i ->
            Planet(nameData[i],
                    visionData[i],
                    distanceData[i],
                    live[i],
                    webArray[i])
        })


        var list = list_of_planet
        list.layoutManager = GridLayoutManager(applicationContext, 1)
        list.adapter = PlanetAdapter(data)
        list.adapter.notifyDataSetChanged()
    }
}