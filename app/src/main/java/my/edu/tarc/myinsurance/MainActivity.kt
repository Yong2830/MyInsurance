package my.edu.tarc.myinsurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.edu.tarc.myinsurance.databinding.ActivityMainBinding
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Show UI
        binding = ActivityMainBinding.inflate(layoutInflater)
        //binding = UI tree
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroup.checkedRadioButtonId
            val smoker = binding.checkBoxSmoker.isChecked
            var premium = 0




            if(gender == binding.radioButtonMale.id){
                if(age == 0){ //less than 17
                    premium = 60
                }
                else if (age == 1){
                    premium = 70 + 50

                }
                else if (age == 2){
                    premium = 90 + 100

                }
                else if (age == 3){
                    premium = 120 + 150

                }
                else if (age == 4){
                    premium = 150 + 200

                }

                else if (age == 5){
                    premium = 150 + 200
                }


            }
            else if(gender == binding.radioButtonFemale.id){
                if(age == 0){ //less than 17
                    premium = 60
                }
                else if (age == 1){
                    premium = 70

                }
                else if (age == 2){
                    premium = 90

                }
                else if (age == 3){
                    premium = 120

                }
                else if (age == 4){
                    premium = 150

                }

                else if (age == 5){
                    premium = 150
                }

            }

            if(smoker == true){
                if(age == 0){ //less than 17
                    premium = premium
                }
                else if (age == 1){
                    premium = premium  + 100

                }
                else if (age == 2){
                    premium = premium  + 150

                }
                else if (age == 3){
                    premium = premium + 200

                }
                else if (age == 4){
                    premium = premium + 250

                }

                else if (age == 5){
                    premium = premium  + 300
                }

            }

            binding.textViewPremium.text = premium.toString()
        }
        binding.buttonReset.setOnClickListener {
            binding.spinnerAge.setSelection(0)
            binding.radioGroup.check(binding.radioButtonMale.id)
            binding.checkBoxSmoker.isChecked = false
            binding.textViewPremium.text = "textViewPremium"


        }
    }
}