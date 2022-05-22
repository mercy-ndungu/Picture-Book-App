package cryptic.kiki.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFive : AppCompatActivity() {
    lateinit var btnP2:Button
    lateinit var btnP1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_five)
        btnP2 = findViewById(R.id.btnP2)
        btnP2.setOnClickListener {
            val intent = Intent(this, PictureFour::class.java)
            startActivity(intent)
        }
        btnP1 = findViewById(R.id.btnP1)
        btnP1.setOnClickListener {
            val intent = Intent(this, PictureSix::class.java)
            startActivity(intent)
        }
    }
}