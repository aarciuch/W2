package art.tm.start1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import art.tm.start1.databinding.ActivityMain3Binding

class Main3Activity : AppCompatActivity() {
    lateinit var binding : ActivityMain3Binding
    var a = NameClass("Czesio")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main3)

        if (savedInstanceState != null) {
            a.name = savedInstanceState.getString("data").toString()
            binding.invalidateAll()
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main3)
        binding.name1 = a
        binding.button.setOnClickListener {
            a.name = binding.edit.text.toString() + "Zosia"
            binding.invalidateAll()
        }

        binding.edit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                a.name = s.toString()

                binding.invalidateAll()
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("data", a.name)
    }

}