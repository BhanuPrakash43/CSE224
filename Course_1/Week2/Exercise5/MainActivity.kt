package com.example.exercise5

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.exercise5.ui.theme.Pink80
import com.example.exercise5.ui.theme.Purple80
import com.example.exercise5.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           val materialBlue700=Color(0xFF1976D2)
            val scaffoldState= rememberScaffoldState(rememberDrawerState(DrawerValue.Open))

            Scaffold(
                scaffoldState=scaffoldState, topBar = {
                    TopAppBar(
                        title = { Text(resources.getString(R.string.app_name))},
                        contentColor = Color.White,
                        backgroundColor = materialBlue700
                    )
                }, content = {
                    paddingValues -> 
                    MenuContent(paddingValues=paddingValues)
                }
            )


        }
        

    }
}

@Composable
fun MenuContent(paddingValues: PaddingValues){
    Surface(modifier = Modifier.padding(paddingValues)) {
         val menuPadding=8.dp
        val configuration= LocalConfiguration.current
        when(configuration.orientation){
            ORIENTATION_LANDSCAPE->{
                Column() {
                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(text = "Appetizers",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxHeight()
                            .background(Purple80)
                            .padding(menuPadding))

                        Text(text = "Salads",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxHeight()
                            .padding(menuPadding))
                    }

                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(text = "Drinks",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxHeight()
                            .background(Pink80)
                            .padding(menuPadding))

                        Text(text = "Mains",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxHeight()
                            .background(PurpleGrey80)
                            .padding(menuPadding))


                    }
                }
            }

            else->{
                Column() {
                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(text = "Appetizers",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Purple80)
                                .padding(menuPadding))

                        Text(text = "Salads",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .padding(menuPadding))
                    }

                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(text = "Drinks",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Pink80)
                                .padding(menuPadding))

                        Text(text = "Mains",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(PurpleGrey80)
                                .padding(menuPadding))


                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview(){
    MenuContent(paddingValues = PaddingValues(10.dp))
}
