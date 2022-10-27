package art.tm.start1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button)
        val button1 : Button = findViewById(R.id.button1)
        val textView : TextView = findViewById(R.id.textView)

        button.setOnClickListener {
            textView.text = "Ala"
            val intent = Intent(applicationContext,
                MainActivity2::class.java)

            startActivity(intent)
        }

        button1.setOnClickListener {
            textView.text = "Ola"
            val intent = Intent(applicationContext,
                Main3Activity::class.java)

            startActivity(intent)
        }
    }
}