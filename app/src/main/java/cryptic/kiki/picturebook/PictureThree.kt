package cryptic.kiki.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureThree : AppCompatActivity() {
    lateinit var btnTuna1:Button
    lateinit var btnTuna2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)
        btnTuna1 = findViewById(R.id.btnTuna1)
        btnTuna1.setOnClickListener {
            val intent = Intent(this, PictureOne::class.java)
            startActivity(intent)
        }
        btnTuna1 = findViewById(R.id.btnTuna2)
        btnTuna2.setOnClickListener {
            val intent = Intent(this,PictureFour::class.java)
            startActivity(intent)
        }
    }
}