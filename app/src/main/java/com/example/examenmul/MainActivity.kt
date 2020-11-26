

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenmul.R
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTextoInicial
        bUno.setOnClickListener {
            val intent = Intent(this, Actividad2::class.java)
            startActivity(intent)
        }

        bTres.setOnClickListener {
            if (Random.nextBoolean()){
                val intent = Intent(this, Actividad2::class.java)
                startActivity(intent)
            } }
        }

    }
}