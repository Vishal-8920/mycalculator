package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.mycalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.btnAc.setOnClickListener {
         binding.tvResult.text=" "
         binding.tvHistory.text=" "

     }

        binding.btnZero.setOnClickListener {
            binding.tvHistory.append("0")
        }
        binding.btnOne.setOnClickListener {
            binding.tvHistory.append("1")
        }
        binding.btnTwo.setOnClickListener {
            binding.tvHistory.append("2")
        }
        binding.btnThree.setOnClickListener {
            binding.tvHistory.append("3")
        }
        binding.btnFour.setOnClickListener {
            binding.tvHistory.append("4")
        }
        binding.btnFive.setOnClickListener {
            binding.tvHistory.append("5")
        }
        binding.btnSix.setOnClickListener {
            binding.tvHistory.append("6")
        }
        binding.btnSeven.setOnClickListener {
            binding.tvHistory.append("7")
        }
        binding.btnEight.setOnClickListener {
            binding.tvHistory.append("8")
        }
        binding.btnNine.setOnClickListener {
            binding.tvHistory.append("9")
        }

        binding.btnDot.setOnClickListener {
            binding.tvHistory.append(".")
        }

       binding.btnAdd.setOnClickListener {
           binding.tvHistory.append("+")
       }
        binding.btnMinus.setOnClickListener {
            binding.tvHistory.append("-")
        }
        binding.btnMultiply.setOnClickListener {
            binding.tvHistory.append("*")
        }
        binding.btnDivide.setOnClickListener {
            binding.tvHistory.append("/")
        }
        binding.btnOpenBracket.setOnClickListener {
            binding.tvHistory.append("(")
        }
        binding.btnCloseBracket.setOnClickListener {
            binding.tvHistory.append(")")
        }
        binding.btnEqual.setOnClickListener {

            val expressions=ExpressionBuilder(binding.tvHistory.text.toString()).build()
            val result=expressions.evaluate()
            val longResult=result.toLong()

            if (result==longResult.toDouble())
            {
                binding.tvResult.text=longResult.toString()
            }
            else
            {
                binding.tvResult.text=result.toString()
            }
        }

    }
}