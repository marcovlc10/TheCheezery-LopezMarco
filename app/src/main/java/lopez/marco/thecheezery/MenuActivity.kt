package lopez.marco.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_cold_drinks)
        var btnHot: Button = findViewById(R.id.button_hot_drinks)
        var btnSweets: Button = findViewById(R.id.button_sweets)
        var btnSalties: Button = findViewById(R.id.button_salties)

        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).putExtra("typo", "1")
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).putExtra("typo", "2")
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).putExtra("typo", "3")
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java).putExtra("typo", "4")
            startActivity(intent)
        }

    }
}