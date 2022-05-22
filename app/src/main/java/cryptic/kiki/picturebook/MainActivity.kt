package cryptic.kiki.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnWelcome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWelcome = findViewById(R.id.btnWelcome)
        btnWelcome.setOnClickListener {
            var intent =Intent(this, PictureOne::class.java)
            startActivity(intent)
        }


    }
}