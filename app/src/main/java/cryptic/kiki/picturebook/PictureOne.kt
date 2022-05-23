package cryptic.kiki.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureOne : AppCompatActivity() {
    lateinit var btnEgg1:Button
    lateinit var btnEgg2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_one2)
        btnEgg1 = findViewById(R.id.btnEgg1)
        btnEgg1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnEgg2 = findViewById(R.id.btnEgg2)
        btnEgg2.setOnClickListener {
            val intent: Intent = Intent(this,PictureThree::class.java)
            startActivity(intent)
        }

    }
}