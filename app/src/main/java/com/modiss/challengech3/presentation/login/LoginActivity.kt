package com.modiss.challengech3.presentation.login

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class LoginActivity<ActivityLoginBinding> : AppCompatActivity() {

    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    private val viewModel: LoginViewModel by viewModels {
        GenericViewModelFactory.create(createViewModel())
    }

    private fun createViewModel(): LoginViewModel {
        return LoginViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupForm()
        setClickListeners()
        observeResult()
    }

    private fun setupForm() {
        //todo : setup form
    }

    private fun observeResult() {
        //todo : observe value from login result
    }

    private fun navigateToMain() {
        //todo : navigate to main
    }

    private fun setClickListeners() {
        //todo :set click listener
    }

    private fun navigateToRegister() {
        //todo : navigate to register
    }

    private fun doLogin() {
        //todo : do login process
    }

    private fun isFormValid(): Boolean {
        //todo : create result from email validation and password
        return false
    }

    private fun checkEmailValidation(email: String): Boolean {
        //todo : check email is valid
        return false
    }

    private fun checkPasswordValidation(
        confirmPassword: String,
        textInputLayout: TextInputLayout
    ): Boolean {
        //todo : check password is valid
        return false
    }
}