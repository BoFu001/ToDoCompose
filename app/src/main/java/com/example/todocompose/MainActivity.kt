package com.example.todocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.todocompose.ui.theme.ToDoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoComposeTheme {
                TestConstraintLayout()
            }
        }
    }
}

@Composable
fun TestConstraintLayout(){
    ConstraintLayout (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {


        val (btn1, btn2, btn3) = createRefs()
        val guidelineFromBottom = createGuidelineFromBottom(0.1f)

        Button(
            onClick = { println("aaaaa btn1")},
            modifier = Modifier.constrainAs(btn1){
                bottom.linkTo(guidelineFromBottom)
            }
        ){
            Text(text = "Btn1")
        }

        Button(
            onClick = { println("aaaaa btn2")},
            modifier = Modifier.constrainAs(btn2){
                bottom.linkTo(guidelineFromBottom)
            }
        ){
            Text(text = "Btn2")
        }

        Button(
            onClick = { println("aaaaa btn3")},
            modifier = Modifier.constrainAs(btn3){
                bottom.linkTo(guidelineFromBottom)
            }
        ){
            Text(text = "Btn3")
        }

        createHorizontalChain(btn1, btn2, btn3, chainStyle = ChainStyle.Spread)


    }
}

