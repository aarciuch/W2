package art.tm.start1

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginStart
import androidx.core.view.updatePadding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var ll = LinearLayout(applicationContext)
        var text = TextView(applicationContext)
        var button = Button(applicationContext)

        val dimen = LinearLayout.LayoutParams(LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT)
        )

        val llDimen = LinearLayout.LayoutParams(LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT)
        )

        dimen.setMargins(16,16,16,16)

        ll.layoutParams = llDimen
        text.layoutParams = dimen
        text.text = "Ala"
        text.setTextColor(Color.RED)
        text.setBackgroundColor(Color.BLUE)
        text.textAlignment = View.TEXT_ALIGNMENT_CENTER
        text.textSize = 30F
        text.setTypeface(null, Typeface.BOLD_ITALIC)
        button.layoutParams = dimen
        button.text = "Button"

        ll.orientation = LinearLayout.VERTICAL

        ll.addView(text)
        ll.addView(button)

        button.setOnClickListener {
            if (text.text == "Ala")
                text.text = "Ola"
            else
                text.text = "Ala"
        }

        text.updatePadding(16, 16, 16, 16)

        setContentView(ll)
    }
}