package cryptic.kiki.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureSix : AppCompatActivity() {
   lateinit var btnChak1 :Button
    lateinit var btnChak2 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_six)
        btnChak1 = findViewById(R.id.btnChak1)
        btnChak1.setOnClickListener {
            val intent = Intent(this,PictureFive::class.java)
            startActivity(intent)
        }
    }
}