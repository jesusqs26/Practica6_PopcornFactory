package quintero.jesus.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras

        if (bundle != null){
            findViewById<ImageView>(R.id.tv_pelicula_imagen).setImageResource(bundle.getInt("header"))
            findViewById<TextView>(R.id.tv_nombre_pelicula).setText(bundle.getInt("nombre"))
            findViewById<TextView>(R.id.tv_pelicula_imagen).setText(bundle.getInt("sinopsis"))
        }
    }
}