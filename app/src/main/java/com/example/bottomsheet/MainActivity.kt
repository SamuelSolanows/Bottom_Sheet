package com.example.bottomsheet


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomsheet.databinding.ActivityMainBinding
import com.example.bottomsheet.databinding.BottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {

            var vista = BottomSheetDialogBinding.inflate(layoutInflater)
            var alerta = BottomSheetDialog(this@MainActivity)
            alerta.setCancelable(true)
            alerta.setContentView(vista.root)
            alerta.show()

            vista.apply {
                txtname.text = "Samuel Solano Amaya"
                txtpuesto.text = "Desarrollador"
                txtedad.text = "18"
            }

        }
    }
}