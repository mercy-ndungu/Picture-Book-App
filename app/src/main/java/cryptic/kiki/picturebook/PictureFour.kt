package cryptic.kiki.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFour : AppCompatActivity() {
    lateinit var btnPease1:Button
    lateinit var btnPease2 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_four)
        btnPease1 = findViewById(R.id.btnPease1)
        btnPease1.setOnClickListener {
            val intent = Intent(this,PictureThree::class.java)
            startActivity(intent)
        }
        btnPease2 = findViewById(R.id.btnPease2)
        btnPease2.setOnClickListener {
            val intent = Intent(this,PictureFive::class.java)
            startActivity(intent)
        }
    }
}