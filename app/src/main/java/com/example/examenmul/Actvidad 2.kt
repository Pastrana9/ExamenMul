
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Actividad2 : AppCompatActivity(){ 

    companion object{
        const val CLAVE = "ASDF"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val idRecibido = intent.getIntExtra(CLAVE,0)
        if (idRecibido!=0){

        }
    }
}



//Boton 1



//Boton 2



//Boton 3