package com.example.exercise2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exercise2.ui.theme.Exercise2Theme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exercise2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
         Image(painter = painterResource(id = R.drawable.littlelemonlogo), contentDescription ="" )
         TextField(value = "", onValueChange = {}, label = { Text(text = "UserName")})
         TextField(value = "", onValueChange = {}, label = { Text(text = "Password")})
         Button(onClick = { /*TODO*/ },
              colors = ButtonDefaults.buttonColors(Color(0xFF495E57))) {
                  Text(text = "Login",
                  color = Color(0xFFEDEFEE))
             }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}
