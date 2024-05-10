package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val appD = findViewById<CardView>(R.id.appDCard)
        val webD = findViewById<CardView>(R.id.webDCard)
        val ml = findViewById<CardView>(R.id.mlCard)
        val ai = findViewById<CardView>(R.id.aiCard)
        val cybSec = findViewById<CardView>(R.id.cybSecCard)
        val blockChain = findViewById<CardView>(R.id.blockChainCard)
        val button = findViewById<Button>(R.id.btnContact)

        button.setOnClickListener{
            intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:9608595205")
            startActivity(intent)
        }

        appD.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLTV_nsuD2lf4UCTV6xwvNPvFdmCNKyhc8&si=TvXY2fp_RQl0oSx7")
            startActivity(intent)
        }
        webD.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agq5TrH9XLIKQvv0iaF2X3w&si=w9M6FuDP5fXIAsyh")
            startActivity(intent)
        }
        ml.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLjVLYmrlmjGe-xLyoCdDrt8Nil1Alg_L3&si=j5mc8F8T2IHUhss7")
            startActivity(intent)
        }
        ai.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&si=gxWgLzxHACSa2_5T")
            startActivity(intent)
        }
        cybSec.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PL9ooVrP1hQOGPQVeapGsJCktzIO4DtI4_&si=j0bHBacIuwu9MFHq")
            startActivity(intent)
        }
        blockChain.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLgPmWS2dQHW-BRQCQCNYgmHUfCN115pn0&si=0Br_NiwkrWhfwxuu")
            startActivity(intent)
        }

    }
}